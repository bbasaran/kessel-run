package org.misoenergy.hackday.kessel_run.service;

import lombok.extern.slf4j.Slf4j;
import org.misoenergy.hackday.kessel_run.model.StarWarsPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class StarWarsApiService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private JsonToPojoConcerterService jsonToPojoConcerterService;

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

        String jsonPath = "src/main/resources/";
        File inputJson = new File(jsonPath + "starwarsjsonresponse.json");

        String outputPath = "src/main/resources/";
        File outputJavaClassDirectory = new File(outputPath);

        String javaClassName = "StarWarsPojo";

        try {
            jsonToPojoConcerterService.convertJsonToJavaClass(inputJson.toURI()
                    .toURL(), outputJavaClassDirectory, packageName, javaClassName ) ;

        }catch (Exception ex) {
            log.info("exception : {}" , ex.getMessage() );
        }
    }
}
