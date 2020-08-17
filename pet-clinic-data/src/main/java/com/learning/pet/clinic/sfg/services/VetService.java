package com.learning.pet.clinic.sfg.services;

import com.learning.pet.clinic.sfg.model.Vet;

import java.util.Set;

/**
 * aditya created on 17/08/20
 */
public interface VetService {

    Vet findById(Long id);

    Set<Vet> findAll();

    Vet save(Vet vet);
}
