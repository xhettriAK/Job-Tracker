package com.xhettri.jobTracker.repository;

import com.xhettri.jobTracker.entity.Application;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
//storage class
public class ApplicationCollection {
    private List<Application>collection = new ArrayList<>();
    AtomicLong counter = new AtomicLong(0);

    public ApplicationCollection(){}

    public void addApplication(Application application){
        application.setId(counter.incrementAndGet());
        collection.add(application);
    }

    public List<Application> returnListOfApplication(){
        return List.copyOf(this.collection);
    }

    public Application searchByID(long id){
        for(var application : collection){
            if(application.getId()==id){
                return application;
            }
        }
        return null;
    }
}
