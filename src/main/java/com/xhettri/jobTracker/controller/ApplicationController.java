package com.xhettri.jobTracker.controller;

import com.xhettri.jobTracker.dto.ApplicationRequest;
import com.xhettri.jobTracker.entity.Application;
import com.xhettri.jobTracker.repository.ApplicationCollection;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/applications")
public class ApplicationController {
    private ApplicationCollection applicationList;
    public ApplicationController(ApplicationCollection applicationList){
        this.applicationList= applicationList;
    }

    @GetMapping("/")
    public List<Application> returnInstance(){
        return applicationList.returnListOfApplication();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Application> fetchApplicationById(@PathVariable("id") long id){
         Application a = applicationList.searchByID(id);
         if(a==null){
             return new ResponseEntity<>(a, HttpStatus.NOT_FOUND);
         }
         return new ResponseEntity<>(a ,HttpStatus.OK);
    }

    @PostMapping("/create")
    public void createApplication(@RequestBody ApplicationRequest dto){
        applicationList.addApplication(new Application(dto.getCompany(),dto.getStatus(), dto.getRole(), dto.getLink(),dto.getPublishedDate(),
                dto.getAppliedDate(), dto.getNotes()));
    }
}
