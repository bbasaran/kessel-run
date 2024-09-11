package org.misoenergy.hackday.kessel_run.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.Pair;
import org.misoenergy.hackday.kessel_run.model.StarWarsPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.util.function.Tuple2;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
@Slf4j
public class StarWarsApiService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private JsonToPojoConverterService jsonToPojoConcerterService;

    private String url = "https://sw5eapi.azurewebsites.net/api/class";

    public List<StarWarsPojo> getClassData () {

        //return getClassDataRestTemplate();

        return getClassDataWebClient();
    }

    private List<StarWarsPojo> getClassDataRestTemplate() {

        StarWarsPojo[] response = restTemplate.getForObject(url, StarWarsPojo[].class);
        List<StarWarsPojo> starWarsPojoList = Arrays.stream(response).toList();

        log.info("Using rest template: size of response is: {}", starWarsPojoList.size());

        return starWarsPojoList;
    }

    private List<StarWarsPojo> getClassDataWebClient () {

        StarWarsPojo[] response = WebClient.builder()
                .build()
                .get()
                .uri(url)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(StarWarsPojo[].class)
                .block();

        List<StarWarsPojo> starWarsPojoList = Arrays.stream(response).toList();

        log.info("Using webclient: size of response is: {}", starWarsPojoList.size());

        return starWarsPojoList;
    }


    public void generatePojoFromJSON() {

        String packageName = "org.misoenergy.hackday.kessel_run.model";

        Map<String, File> pojoList = new HashMap<>();

        String jsonPath = "src/main/resources/";
        File classJson = new File(jsonPath + "starwarsjsonresponse.json");
        File equipmentJson = new File(jsonPath + "equipment.json");
        String classClassName = "StarWarsPojo";
        String equipmentClassName = "EquipmentPojo";

        pojoList.put(classClassName, classJson);
        pojoList.put(equipmentClassName, equipmentJson);

        String outputPath = "src/main/resources/";
        File outputJavaClassDirectory = new File(outputPath);


        pojoList.forEach((className, pojoJson) -> {
            try {
                jsonToPojoConcerterService.convertJsonToJavaClass(pojoJson.toURI()
                        .toURL(), outputJavaClassDirectory, packageName, className);
            } catch (Exception e) {
                log.info("exception : {}", e.getMessage());
            }
        });
    }
}
