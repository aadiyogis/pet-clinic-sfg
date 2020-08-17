package com.learning.pet.clinic.sfg.model;

import java.io.Serializable;

/**
 * aditya created on 17/08/20
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
