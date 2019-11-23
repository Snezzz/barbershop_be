package com.sweater.services;

import com.sweater.entities.Record;
import com.sweater.repositories.CompanyRepository;
import com.sweater.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class RecordService {
    RecordRepository recordRepository;
    @Autowired
    public RecordService ( RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public void addRecord(Record record){
        recordRepository.save(record);
    }

    public Set<Record> getRecords(int id){
        return recordRepository.findRecordsByClientId(id);
    }
    public void removeRecord (int id){
        recordRepository.deleteById(id);
    }

    public List <Record> getAllRecords(){
        return recordRepository.findAll();
    }
}
