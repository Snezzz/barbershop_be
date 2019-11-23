package com.sweater.controllers;

import com.sweater.entities.Service;
import com.sweater.services.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {
    ServiceService serviceService;

    @Autowired
    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/services")
    public List<Service> getAllServices(){
        return serviceService.getAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/service/{id}")
    public Service getService(@PathVariable int id){
        return serviceService.getService(id);
    }
}
