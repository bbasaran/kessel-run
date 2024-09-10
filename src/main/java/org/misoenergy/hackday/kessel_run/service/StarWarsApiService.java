package org.misoenergy.hackday.kessel_run.service;

import lombok.extern.slf4j.Slf4j;
import org.misoenergy.hackday.kessel_run.model.FlavorText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class StarWarsApiService {

    @Autowired
    RestTemplate restTemplate;

    public FlavorText getClassData () {

        String url = "https://sw5eapi.azurewebsites.net/api/class";
        String response = restTemplate.getForObject(url, String.class);
        log.info("response is:" + response);

        return null;
    }
}
