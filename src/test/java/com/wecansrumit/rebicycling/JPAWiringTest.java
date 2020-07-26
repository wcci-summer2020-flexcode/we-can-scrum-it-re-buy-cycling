package com.wecansrumit.rebicycling;

import com.wecansrumit.rebicycling.model.Bike;
import com.wecansrumit.rebicycling.model.Gender;
import com.wecansrumit.rebicycling.model.Shop;
import com.wecansrumit.rebicycling.model.SuggestedAge;
import com.wecansrumit.rebicycling.repositories.BikeRepository;
import com.wecansrumit.rebicycling.repositories.GenderRepository;
import com.wecansrumit.rebicycling.repositories.ShopRepository;
import com.wecansrumit.rebicycling.repositories.SuggestedAgeRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

@DataJpaTest
public class JPAWiringTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ShopRepository shopRepo;

    @Autowired
    private GenderRepository genderRepo;

    @Autowired
    private SuggestedAgeRepository suggestedAgeRepo;

    @Autowired
    private BikeRepository bikeRepo;

    @Test
    public void shopShouldHaveAListOfBikes(){
        Shop testShopColumbus = new Shop ("Columbus");
        Shop testShopCleveland = new Shop ("Cleveland");
        Gender testGenderMale = new Gender ("Male");
        Gender testGenderFemale = new Gender ("Female");
        Gender testGenderNeutral = new Gender ("Neutral");
        SuggestedAge testSuggestedAge24 = new SuggestedAge ("2-4");
        SuggestedAge testSuggestedAge46 = new SuggestedAge ("4-6");
        Bike testBike1 = new Bike ("Schwinn", "imageURL here", "Mountain", "12", "Frank Swanson", "$200.00", "Available", testShopColumbus, testGenderNeutral, testSuggestedAge24);
        Bike testBike2 = new Bike ("Huffy", "imageURL here", "BMX", "18", "Mary Swanson", "250.00", "Not Available", testShopCleveland, testGenderMale, testSuggestedAge46);

        shopRepo.save(testShopColumbus);
        shopRepo.save(testShopCleveland);
        genderRepo.save(testGenderFemale);
        genderRepo.save(testGenderMale);
        genderRepo.save(testGenderNeutral);
        suggestedAgeRepo.save(testSuggestedAge24);
        suggestedAgeRepo.save(testSuggestedAge46);
        bikeRepo.save(testBike1);
        bikeRepo.save(testBike2);

        entityManager.flush();
        entityManager.clear();

        Optional<Shop> retrievedShopOpt = shopRepo.findById(testShopColumbus.getId());
        Shop retrievedShop = retrievedShopOpt.get();
        Assertions.assertThat(retrievedShop.getBikes()).contains(testBike1);
    }

}
