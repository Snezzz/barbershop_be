package com.sweater.repositories;

import com.sweater.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface RecordRepository extends JpaRepository<Record,Integer> {
    Set<Record> findRecordsByClientId(int id);
}
