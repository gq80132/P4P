package com.clinic.vetApp.model;

public class Client {
    private Long id;
    private String personName;
    private String petName;
    private Integer petAge;
    private String petType;

    public Client() {}

    public Client(Long id, String personName, String petName, Integer petAge, String petType) {
        this.id = id;
        this.personName = personName;
        this.petName = petName;
        this.petAge = petAge;
        this.petType = petType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Integer getPetAge() {
        return petAge;
    }

    public void setPetAge(Integer petAge) {
        this.petAge = petAge;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }
}
