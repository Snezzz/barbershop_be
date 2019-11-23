package com.sweater.controllers;

import com.sweater.entities.Company;
import com.sweater.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/company")
    public Company getInformation(){
        return companyService.getInformation();
    }
}
