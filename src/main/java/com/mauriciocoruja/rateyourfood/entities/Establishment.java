package com.mauriciocoruja.rateyourfood.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_establishment")
public class Establishment implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;

    @OneToMany(mappedBy = "establishment")
    private Set<Dish> dishes = new HashSet<>();

    public Establishment() {
    }

    public Establishment(Long id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Dish> getDishes() {
        return dishes;
    }
}
