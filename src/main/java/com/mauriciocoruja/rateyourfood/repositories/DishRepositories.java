package com.mauriciocoruja.rateyourfood.repositories;

import com.mauriciocoruja.rateyourfood.entities.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepositories extends JpaRepository<Dish, Long> {
}
