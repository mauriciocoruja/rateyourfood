package com.mauriciocoruja.rateyourfood.resources;

import com.mauriciocoruja.rateyourfood.entities.Establishment;
import com.mauriciocoruja.rateyourfood.services.EstablishmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/establishments")
public class EstablishmentResources {

    @Autowired
    private EstablishmentService establishmentService;

    @GetMapping
    public ResponseEntity<List<Establishment>> findall() {
        List<Establishment> objs = establishmentService.findAll();
        return ResponseEntity.ok().body(objs);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Establishment> findById(@PathVariable Long id) {
        Establishment obj = establishmentService.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
