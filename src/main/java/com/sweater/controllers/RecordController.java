package com.sweater.controllers;

import com.sweater.entities.Record;
import com.sweater.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class RecordController {
    RecordService recordService;

    @Autowired
    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/record")
    public void postRecord(@RequestBody Record record){
        recordService.addRecord(record);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/records/{id}")
    public Set<Record> getRecords(@PathVariable int id){
        return recordService.getRecords(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/record/{id}")
    public void removeRecord(@PathVariable int id){
        recordService.removeRecord(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/records")
    public List<Record> getAllRecords(){
        return recordService.getAllRecords();
    }

}
