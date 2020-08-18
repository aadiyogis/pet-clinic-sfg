package com.learning.pet.clinic.sfg.services.map;

import com.learning.pet.clinic.sfg.model.Pet;
import com.learning.pet.clinic.sfg.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * aditya created on 18/08/20
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
