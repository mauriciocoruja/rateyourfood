package com.mauriciocoruja.rateyourfood.repositories;

import com.mauriciocoruja.rateyourfood.entities.Establishment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstablishmentRepositories extends JpaRepository<Establishment, Long> {
}
