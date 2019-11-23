package com.sweater.services;

import com.sweater.entities.Promotions;
import com.sweater.repositories.PromotionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionsService {
    PromotionsRepository promotionsRepository;
    @Autowired
    public PromotionsService(PromotionsRepository promotionsRepository) {
        this.promotionsRepository = promotionsRepository;
    }


    public List<Promotions> getAllStores(){
        return promotionsRepository.findAll();
    }
}
