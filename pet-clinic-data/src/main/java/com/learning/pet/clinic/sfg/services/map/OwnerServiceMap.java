package com.learning.pet.clinic.sfg.services.map;

import com.learning.pet.clinic.sfg.model.Owner;
import com.learning.pet.clinic.sfg.services.OwnerService;

import java.util.Set;

/**
 * aditya created on 18/08/20
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
