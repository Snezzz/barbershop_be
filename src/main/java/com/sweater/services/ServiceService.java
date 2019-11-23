package com.sweater.services;

import com.sweater.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {
    ServiceRepository serviceRepository;
    @Autowired
    public ServiceService ( ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }
    public List<com.sweater.entities.Service> getAll(){
        return serviceRepository.findAll();
    }
    public com.sweater.entities.Service getService(int id){
        return serviceRepository.findById(id).get();
    }
}
