package com.mauriciocoruja.rateyourfood.resources;

import com.mauriciocoruja.rateyourfood.entities.Rating;
import com.mauriciocoruja.rateyourfood.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ratings")
public class RatingResources {

    @Autowired
    private RatingService ratingService;

    @GetMapping
    public ResponseEntity<List<Rating>> findall() {
        List<Rating> objs = ratingService.findAll();
        return ResponseEntity.ok().body(objs);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Rating> findById(@PathVariable Long id) {
        Rating obj = ratingService.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
