package com.mauriciocoruja.rateyourfood.repositories;

import com.mauriciocoruja.rateyourfood.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepositories extends JpaRepository<Rating, Long> {

}
