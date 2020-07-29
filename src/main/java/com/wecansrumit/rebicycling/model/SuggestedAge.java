package com.wecansrumit.rebicycling.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class SuggestedAge {

    @Id
    @GeneratedValue
    private Long id;
    private String suggestedAgeRange;

    @JsonIgnore
    @OneToMany (mappedBy = "suggestedAge")

    private Collection<Bike> bikes;

    public Long getId(){
        return id;
    }

    public String getSuggestedAgeRange(){
        return suggestedAgeRange;
    }

    public Collection<Bike> getBikes() {
        return bikes;
    }

    public SuggestedAge(){}

    public SuggestedAge(String suggestedAgeRange) {
        this.suggestedAgeRange = suggestedAgeRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuggestedAge suggestedAge = (SuggestedAge) o;
        return Objects.equals(id, suggestedAge.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
