package com.learning.pet.clinic.sfg.services;

import com.learning.pet.clinic.sfg.model.Owner;

import java.util.Set;

/**
 * aditya created on 17/08/20
 */
public interface OwnerService {

    Owner findById(Long id);

    Set<Owner> findAll();

    Owner save(Owner owner);
}
