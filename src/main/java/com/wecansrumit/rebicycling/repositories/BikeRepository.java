package com.wecansrumit.rebicycling.repositories;

import com.wecansrumit.rebicycling.model.Bike;
import com.wecansrumit.rebicycling.model.Gender;
import com.wecansrumit.rebicycling.model.Shop;
import com.wecansrumit.rebicycling.model.SuggestedAge;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BikeRepository extends CrudRepository <Bike, Long> {
    List<Bike> findAllBikesByShop (Optional<Shop> shop);
    List<Bike> findAllBikesByGender (Optional<Gender> gender);
    List<Bike> findAllBikesBySuggestedAge (Optional<SuggestedAge> suggestedAge);
     List<Bike> findAllBikesByShopAndGenderAndSuggestedAge (
             Optional<Shop>shop,
             Optional<Gender>gender,
             Optional<SuggestedAge>suggestedAge);
}


