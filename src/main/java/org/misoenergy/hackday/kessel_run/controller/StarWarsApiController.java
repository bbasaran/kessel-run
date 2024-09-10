package org.misoenergy.hackday.kessel_run.controller;

import org.misoenergy.hackday.kessel_run.service.StarWarsApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarWarsApiController {

    @Autowired
    StarWarsApiService starWarsApiService;

    @GetMapping("/class-data")
    public String fetchClassData(){

        starWarsApiService.getClassData();
        return "This is test";

    }
}
