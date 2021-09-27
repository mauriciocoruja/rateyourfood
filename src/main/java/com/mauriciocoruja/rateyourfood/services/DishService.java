package com.mauriciocoruja.rateyourfood.services;

import com.mauriciocoruja.rateyourfood.entities.Dish;
import com.mauriciocoruja.rateyourfood.repositories.DishRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DishService {
    @Autowired
    private DishRepositories dishRepositories;

    public List<Dish> findAll() {
        return dishRepositories.findAll();
    }

    public Dish findById(Long id) {
        Optional<Dish> obj = dishRepositories.findById(id);
        return obj.get();
    }
}
