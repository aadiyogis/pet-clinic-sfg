package com.learning.pet.clinic.sfg.services;

import com.learning.pet.clinic.sfg.model.Pet;

import java.util.Set;

/**
 * aditya created on 17/08/20
 */
public interface PetService {

    Pet findById(Long id);

    Set<Pet> findAll();

    Pet save(Pet pet);
}
