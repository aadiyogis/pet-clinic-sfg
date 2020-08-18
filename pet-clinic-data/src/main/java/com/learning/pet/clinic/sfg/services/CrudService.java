package com.learning.pet.clinic.sfg.services;

import java.util.Set;

/**
 * aditya created on 18/08/20
 */
public interface CrudService<T, ID> {

    T save(T object);

    T findById(ID id);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}
