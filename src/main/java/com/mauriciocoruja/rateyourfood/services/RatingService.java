package com.mauriciocoruja.rateyourfood.services;

import com.mauriciocoruja.rateyourfood.entities.Rating;
import com.mauriciocoruja.rateyourfood.repositories.RatingRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingService {
    @Autowired
    private RatingRepositories ratingRepositories;

    public List<Rating> findAll() {
        return ratingRepositories.findAll();
    }

    public Rating findById(Long id) {
        Optional<Rating> obj = ratingRepositories.findById(id);
        return obj.get();
    }
}
