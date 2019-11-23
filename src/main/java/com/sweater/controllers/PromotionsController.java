package com.sweater.controllers;

import com.sweater.entities.Promotions;
import com.sweater.services.PromotionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PromotionsController {
    PromotionsService promotionsService;

    @Autowired
    public PromotionsController(PromotionsService promotionsService) {
        this.promotionsService = promotionsService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/discounts")
    public List<Promotions> getAll(){
        return promotionsService.getAllStores();
    }
}
