package com.wecansrumit.rebicycling.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Shop {

    @Id
    @GeneratedValue
    private Long id;
    private String location;

    @JsonIgnore
    @OneToMany (mappedBy = "shop")

    private Collection<Bike> bikes;

    public Long getId(){
        return id;
    }

    public String getLocation(){
        return location;
    }

    public Collection<Bike> getBikes(){
        return bikes;
    }

    public Shop (){}

    public Shop(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(id, shop.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
