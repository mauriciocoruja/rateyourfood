package com.mauriciocoruja.rateyourfood.services;

import com.mauriciocoruja.rateyourfood.entities.Establishment;
import com.mauriciocoruja.rateyourfood.repositories.EstablishmentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstablishmentService {
    @Autowired
    private EstablishmentRepositories establishmentRepositories;

    public List<Establishment> findAll() {
        return establishmentRepositories.findAll();
    }

    public Establishment findById(Long id) {
        Optional<Establishment> obj = establishmentRepositories.findById(id);
        return obj.get();
    }

}
