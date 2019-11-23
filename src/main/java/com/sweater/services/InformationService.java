package com.sweater.services;

import com.sweater.entities.CompanyInformation;
import com.sweater.repositories.InformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class InformationService {
    InformationRepository informationRepository;
    @Autowired
    public InformationService ( InformationRepository informationRepository) {
        this.informationRepository = informationRepository;
    }

    public List<CompanyInformation> getAllInformation(){
        return informationRepository.findAll();
    }

}
