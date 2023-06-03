package com.valchevgd.petclinic.service;

import com.valchevgd.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner getById(Long id);
    Owner save(Owner owner);
    Set<Owner> getAll();
    Owner getByLastName(String lastName);
}
