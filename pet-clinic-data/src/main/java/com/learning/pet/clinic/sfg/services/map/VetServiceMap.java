package com.learning.pet.clinic.sfg.services.map;

import com.learning.pet.clinic.sfg.model.Vet;
import com.learning.pet.clinic.sfg.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * aditya created on 18/08/20
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
