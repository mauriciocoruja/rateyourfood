package com.mauriciocoruja.rateyourfood.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_dish")
public class Dish {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String dishName;
    private String dishDescription;

    @OneToMany
    private Set<Rating> rating = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "establishment_id")
    private Establishment establishment;

    public Set<Rating> getRating() {
        return rating;
    }

    public Establishment getEstablishment() {
        return establishment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDishDescription() {
        return dishDescription;
    }

    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }
}
