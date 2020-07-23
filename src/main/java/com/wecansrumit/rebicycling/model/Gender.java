package com.wecansrumit.rebicycling.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Gender {

    @Id
    @GeneratedValue
    private Long id;
    private String genderType;

    @JsonIgnore
    @OneToMany (mappedBy = "gender")

    private Collection<Bike> bikes;

    public Long getId() {
        return id;
    }

    public Collection<Bike> getBikes() {
        return bikes;
    }

    public String getGenderType(){
        return genderType;
    }

    public Gender(){}

    public Gender(String genderType) {
        this.genderType = genderType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gender gender = (Gender) o;
        return Objects.equals(id, gender.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
