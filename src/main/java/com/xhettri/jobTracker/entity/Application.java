package com.xhettri.jobTracker.entity;

import java.time.LocalDate;

public class Application {
    private String company;
    private Status status;
    private  String role;
    private  String link;
    private LocalDate publishedDate;
    private LocalDate appliedDate;
    private String notes;
    private  long id;

    public Application(String company, Status status, String role, String link,LocalDate publishedDate, LocalDate appliedDate,Long id, String note){
        this.company = company;
        this.status = status;
        this.role = role;
        this.link = link;
        this.publishedDate = publishedDate;
        this.appliedDate = appliedDate;
        this.notes = note;
        this.id = id;
    }
    public Application(String company, Status status, String role, String link,LocalDate publishedDate, LocalDate appliedDate, String note){
        this(company,status,role,link,publishedDate,appliedDate,(long)0,note);
    }
    public void setStatus(Status status){this.status = status;}
    public void setNotes(String note){this.notes = note;}
    public void setId(long id){this.id =id;};
    public String getNotes()   {return notes;}
    public String getCompany() {return company;}
    public Status getStatus() {return status;}
    public String getRole() {return role;}
    public String getLink() {return link;}
    public LocalDate getPublishedDate() {return publishedDate;}
    public LocalDate getAppliedDate() {return appliedDate;}
    public long getId() {return id;}
    //    public static Application getInstance(String Company, Role role, String link, String data, int id){
//        return new Application(Company, role, link, data, id);
//    }
}

