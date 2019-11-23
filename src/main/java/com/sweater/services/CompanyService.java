package com.sweater.services;

import com.sweater.entities.Company;
import com.sweater.repositories.ClientRepository;
import com.sweater.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    CompanyRepository companyRepository;
    @Autowired
    public CompanyService ( CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company getInformation(){
        return companyRepository.findById(1).get();
    }
}
