package com.learning.pet.clinic.sfg.services;

import com.learning.pet.clinic.sfg.model.Owner;

/**
 * aditya created on 17/08/20
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
