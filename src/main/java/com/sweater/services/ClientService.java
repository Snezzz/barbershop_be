package com.sweater.services;

import com.sweater.entities.Client;
import com.sweater.entities.Record;
import com.sweater.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class ClientService {
    ClientRepository clientRepository;
    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void add(Client client){
        clientRepository.save(client);
    }

    public Client getUser(String login,String password){
        return clientRepository.findByLoginAndPassword(login,password);
    }

}

