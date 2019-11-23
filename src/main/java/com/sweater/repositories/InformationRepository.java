package com.sweater.repositories;

import com.sweater.entities.Client;
import com.sweater.entities.CompanyInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationRepository extends JpaRepository<CompanyInformation,Integer> {

}
