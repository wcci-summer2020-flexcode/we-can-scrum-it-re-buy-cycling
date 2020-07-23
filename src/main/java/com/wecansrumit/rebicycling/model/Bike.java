package com.wecansrumit.rebicycling.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Bike {

    @Id
    @GeneratedValue
    private Long id;
    String brandName;
    String imageUrl;
    String bicycleType;
    String wheelSize;
    String donatedBy;
    String buyInPrice;
    String currentStatus;


//    @JsonIgnore

    @ManyToOne
    private Shop shop;


    @ManyToOne
    private Gender gender;


    @ManyToOne
    private SuggestedAge suggestedAge;



    public Long getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getBicycleType() {
        return bicycleType;
    }

    public String getWheelSize() {
        return wheelSize;
    }

    public String getDonatedBy() {
        return donatedBy;
    }

    public String getBuyInPrice() {
        return buyInPrice;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public Shop getShop(){
        return shop;
    }

    public Gender getGender(){
        return gender;
    }

    public SuggestedAge getSuggestedAge(){
        return suggestedAge;
    }


    public Bike (){}

    public Bike (
            String brandName,
            String imageUrl,
            String bicycleType,
            String wheelSize,
            String donationsBy,
            String buyInPrice,
            String currentStatus,
            Shop shop,
            Gender gender,
            SuggestedAge suggestedAge){
        this.brandName = brandName;
        this.imageUrl = imageUrl;
        this.bicycleType = bicycleType;
        this.wheelSize = wheelSize;
        this.donatedBy = donationsBy;
        this.buyInPrice = buyInPrice;
        this.currentStatus = currentStatus;
        this.shop = shop;
        this.gender = gender;
        this.suggestedAge = suggestedAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return Objects.equals(id, bike.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
