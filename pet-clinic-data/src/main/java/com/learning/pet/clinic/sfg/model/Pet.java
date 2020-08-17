package com.learning.pet.clinic.sfg.model;

import java.time.LocalDate;

/**
 * aditya created on 17/08/20
 */
public class Pet {
    private String name;
    private LocalDate birthDate;
    private PetType petType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }
}
