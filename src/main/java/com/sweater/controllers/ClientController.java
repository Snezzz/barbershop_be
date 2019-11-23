package com.sweater.controllers;

import com.sweater.entities.Client;
import com.sweater.services.ClientService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {
    ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/user")
    public void addUser(@RequestBody Client client){
        clientService.add(client);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/user")
    @ResponseBody
    public Client getUser(@RequestParam(name = "l")String login,
                          @RequestParam(name = "p") String password){
        return clientService.getUser(login,password);
    }


}
