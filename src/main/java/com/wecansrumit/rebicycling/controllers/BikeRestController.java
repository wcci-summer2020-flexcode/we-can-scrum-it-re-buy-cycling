package com.wecansrumit.rebicycling.controllers;

import com.wecansrumit.rebicycling.model.Bike;
import com.wecansrumit.rebicycling.model.Gender;
import com.wecansrumit.rebicycling.model.Shop;
import com.wecansrumit.rebicycling.model.SuggestedAge;
import com.wecansrumit.rebicycling.repositories.BikeRepository;
import com.wecansrumit.rebicycling.repositories.GenderRepository;
import com.wecansrumit.rebicycling.repositories.ShopRepository;
import com.wecansrumit.rebicycling.repositories.SuggestedAgeRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class BikeRestController {

    @Resource
    private BikeRepository bikeRepo;

    @Resource
    private ShopRepository shopRepo;

    @Resource
    private GenderRepository genderRepo;

    @Resource
    private SuggestedAgeRepository suggestedAgeRepo;

    @GetMapping("/api/bikes")
    public Collection<Bike> getBikes() {
        return (Collection<Bike>) bikeRepo.findAll();
    }

    @GetMapping("/api/bikes/{id}")
    public Optional<Bike> getBike(@PathVariable Long id) {
        return bikeRepo.findById(id);
    }

    @GetMapping("/api/bikes/shop/{id}")
    public Collection<Bike> getBikesByShop(@PathVariable Long id) {
        Optional<Shop> shop = Optional.of(shopRepo.findById(id).get());
        return (Collection<Bike>) bikeRepo.findAllBikesByShop(shop);
    }

    @GetMapping("/api/bikes/gender/{id}")
    public Collection<Bike> getBikesByGender(@PathVariable Long id) {
        Optional<Gender> gender = Optional.of(genderRepo.findById(id).get());
        return (Collection<Bike>) bikeRepo.findAllBikesByGender(gender);
    }

    @GetMapping("/api/bikes/suggestedage/{id}")
    public Collection<Bike> getBikesBySuggestedAge(@PathVariable Long id) {
        Optional<SuggestedAge> suggestedAge = Optional.of(suggestedAgeRepo.findById(id).get());
        return (Collection<Bike>) bikeRepo.findAllBikesBySuggestedAge(suggestedAge);
    }

   @GetMapping("api/filteredBikes/{shopid}/{genderid}/{suggestedid}")
    public Collection<Bike> getBikesByShopAndGenderAndSuggestedAge (
            @PathVariable Long shopid,
            @PathVariable Long genderid,
            @PathVariable Long suggestedAgeid){
       Optional<Shop> shop = Optional.of(shopRepo.findById(shopid).get());
       Optional<Gender> gender = Optional.of(genderRepo.findById(genderid).get());
        Optional<SuggestedAge> suggestedAge = Optional.of(suggestedAgeRepo.findById(suggestedAgeid).get());
       return (Collection<Bike>) bikeRepo.findAllBikesByShopAndGenderAndSuggestedAge(shop, gender, suggestedAge);
    }
}
