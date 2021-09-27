package com.mauriciocoruja.rateyourfood.resources;

import com.mauriciocoruja.rateyourfood.entities.Dish;
import com.mauriciocoruja.rateyourfood.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/dishes")
public class DishResources {

    @Autowired
    private DishService dishService;

    @GetMapping
    public ResponseEntity<List<Dish>> findall() {
        List<Dish> objs = dishService.findAll();
        return ResponseEntity.ok().body(objs);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Dish> findById(@PathVariable Long id) {
        Dish obj = dishService.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
