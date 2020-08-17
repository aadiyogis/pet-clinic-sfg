package com.learning.pet.clinic.sfg.model;

/**
 * aditya created on 17/08/20
 */
public class Person extends BaseEntity{

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
