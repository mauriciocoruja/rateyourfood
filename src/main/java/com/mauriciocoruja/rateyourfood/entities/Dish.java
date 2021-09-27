package com.mauriciocoruja.rateyourfood.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_dish")
public class Dish {
    public static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dishName;
    private String dishDescription;

    @OneToMany(mappedBy = "dish")
    private Set<Rating> ratings = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "establishment_id")
    private Establishment establishment;


    public Dish() {
    }

    public Dish(Long id, String dishName, String dishDescription, Establishment establishment) {
        this.id = id;
        this.dishName = dishName;
        this.dishDescription = dishDescription;
        this.establishment = establishment;
    }

    @JsonIgnore
    public Set<Rating> getRating() {
        return ratings;
    }

    public Establishment getEstablishment() {
        return establishment;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
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
}
