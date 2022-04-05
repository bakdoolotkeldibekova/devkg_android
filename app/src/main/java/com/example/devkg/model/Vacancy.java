package com.example.devkg.model;

public class Vacancy {

    private String name; // название
    private String company;  // столица
    private int flagResource; // ресурс флага

    public Vacancy(String name, String company, int flag){

        this.name=name;
        this.company = company;
        this.flagResource=flag;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getFlagResource() {
        return this.flagResource;
    }

    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }
}