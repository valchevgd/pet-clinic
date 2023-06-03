package com.valchevgd.petclinic.service;

import com.valchevgd.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet getById(Long id);
    Pet save(Pet pet);
    Set<Pet> getAll();
}
