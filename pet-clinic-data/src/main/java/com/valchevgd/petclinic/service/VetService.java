package com.valchevgd.petclinic.service;

import com.valchevgd.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet getById(Long id);
    Vet save(Vet vet);
    Set<Vet> getAll();
}
