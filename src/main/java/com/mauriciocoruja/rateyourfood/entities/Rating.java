package com.mauriciocoruja.rateyourfood.entities;

import com.mauriciocoruja.rateyourfood.entities.enums.Evaluation;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "tb_rating")
@Entity
public class Rating implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Evaluation prep;
    private Evaluation flavor;
    private Evaluation appearance;

    @ManyToOne
    @JoinColumn(name = "dish_id")
    private Dish dish;

    public Rating() {
    }

    public Rating(Long id, Evaluation prep, Evaluation flavor, Evaluation appearance, Dish dish) {
        this.id = id;
        this.prep = prep;
        this.flavor = flavor;
        this.appearance = appearance;
        this.dish = dish;
    }

    public Dish getDish() {
        return dish;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Evaluation getPrep() {
        return prep;
    }

    public void setPrep(Evaluation prep) {
        this.prep = prep;
    }

    public Evaluation getFlavor() {
        return flavor;
    }

    public void setFlavor(Evaluation flavor) {
        this.flavor = flavor;
    }

    public Evaluation getAppearance() {
        return appearance;
    }

    public void setAppearance(Evaluation appearance) {
        this.appearance = appearance;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Double getAverageRate(Evaluation flavor, Evaluation appearance, Evaluation prep) {
        return (double) ((flavor.getCode() + appearance.getCode() + prep.getCode()) / 3);
    }
}