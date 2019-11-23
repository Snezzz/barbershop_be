package com.sweater.controllers;

import com.sweater.entities.CompanyInformation;
import com.sweater.services.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InformationController {
    InformationService informationService;

    @Autowired
    InformationController(InformationService informationService){
        this.informationService = informationService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/information")
    public List<CompanyInformation> getInformation(){
        return informationService.getAllInformation();
    }
}
