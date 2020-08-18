package com.learning.pet.clinic.sfg.services.map;

import com.learning.pet.clinic.sfg.model.Owner;
import com.learning.pet.clinic.sfg.services.CrudService;

import java.util.Set;

/**
 * aditya created on 18/08/20
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
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
}
