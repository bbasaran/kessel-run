package org.misoenergy.hackday.kessel_run.controller;

import org.misoenergy.hackday.kessel_run.model.StarWarsPojo;
import org.misoenergy.hackday.kessel_run.service.StarWarsApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StarWarsApiController {

    @Autowired
    StarWarsApiService starWarsApiService;

    @GetMapping("/class-data")
    public List<StarWarsPojo> fetchClassData(){

        List<StarWarsPojo> starWarsPojoList = starWarsApiService.getClassData();
        return starWarsPojoList;

    }

    @GetMapping("/generate-data")
    public ResponseEntity generatePojoFromJSON () {
        starWarsApiService.generatePojoFromJSON();

        return ResponseEntity.ok().body("Json Generated Successfully");
    }
}
