package com.xhettri.jobTracker.dto;

import com.xhettri.jobTracker.entity.Status;
import java.time.LocalDate;

public class ApplicationRequest {
    private String company;
    private Status status;
    private  String role;
    private  String link;
    private LocalDate publishedDate;
    private LocalDate appliedDate;
    private String notes=" ";

    public String getCompany(){
        return company;
    }

    public Status getStatus() {
        return status;
    }

    public String getRole() {
        return role;
    }

    public String getLink() {
        return link;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    public String getNotes() {
        return notes;
    }
}
