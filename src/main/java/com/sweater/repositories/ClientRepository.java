package com.sweater.repositories;

import com.sweater.entities.Client;
import com.sweater.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ClientRepository extends JpaRepository<Client,Integer> {
    Client findByLoginAndPassword(String login,String password);
}
