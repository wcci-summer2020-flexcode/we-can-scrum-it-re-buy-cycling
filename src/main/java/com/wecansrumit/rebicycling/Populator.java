package com.wecansrumit.rebicycling;

import com.wecansrumit.rebicycling.model.Bike;
import com.wecansrumit.rebicycling.model.Gender;
import com.wecansrumit.rebicycling.model.Shop;
import com.wecansrumit.rebicycling.model.SuggestedAge;
import com.wecansrumit.rebicycling.repositories.BikeRepository;
import com.wecansrumit.rebicycling.repositories.GenderRepository;
import com.wecansrumit.rebicycling.repositories.ShopRepository;
import com.wecansrumit.rebicycling.repositories.SuggestedAgeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {
    @Resource
    private ShopRepository shopRepo;

    @Resource
    private GenderRepository genderRepo;

    @Resource
    private SuggestedAgeRepository suggestedAgeRepo;

    @Resource
    private BikeRepository bikeRepo;

    @Override
    public void run (String... args) throws Exception {
        Shop columbus = new Shop ("Columbus");
        Shop cleveland = new Shop ("Cleveland");
        shopRepo.save(columbus);
        shopRepo.save(cleveland);

        Gender male = new Gender ("Male");
        Gender female = new Gender ("Female");
        Gender neutral = new Gender ("Neutral");
        genderRepo.save(male);
        genderRepo.save(female);
        genderRepo.save(neutral);

//        SuggestedAge zeroToTwelveMonths = new SuggestedAge ("0-12 Months");
        SuggestedAge twelveToTwentyFourMonths = new SuggestedAge ("12-24 Months");
        SuggestedAge twoToFourYears = new SuggestedAge ("2-4 Years");
        SuggestedAge fiveToSevenYears = new SuggestedAge ("5-7 Years");
        SuggestedAge eightToElevenYears = new SuggestedAge ("8-11 Years");
        SuggestedAge twelveToFifteenYears = new SuggestedAge ("12-15 Years");
//        suggestedAgeRepo.save(zeroToTwelveMonths);
        suggestedAgeRepo.save(twelveToTwentyFourMonths);
        suggestedAgeRepo.save(twoToFourYears);
        suggestedAgeRepo.save(fiveToSevenYears);
        suggestedAgeRepo.save(eightToElevenYears);
        suggestedAgeRepo.save(twelveToFifteenYears);

        Bike bikeDynacraft1 = new Bike (
                "Dynacraft1",
//                Twilight Girls Bike",
                "src/main/resources/images/test_bike_schwinn2.jpg",
                "Kids Single Speed",
                "16 inch",
                "Marcia Craggett",
                "$37.00",
                "Available",
                cleveland,
                female,
                eightToElevenYears);

        Bike bikeHuffy5	 = new Bike (
                "Huffy1",
//                Rocket Boys Bike, Green
                "client/assets/bike_huffy5.jpeg",
                "Kids Single Speed",
                "20 inch",
                "Serina Nagy"	,
                "$28.00",
                "Available",
                cleveland,
                female,
                eightToElevenYears);

        Bike bikeHuffy6	 = new Bike (
                "Huffy6",
//                Rock It Boys Bike, Silver
                "client/assets/bike_huffy6.jpeg",
                "Kids Single Speed",
                "20 inch",
                "Tom Johnson"	,
                "$28.00",
                "Available",
                cleveland,
                male,
                eightToElevenYears);

        Bike bikeDynacraft2	 = new Bike (
                "Dynacraft2",
//                Invader Boys Bike
                "client/assets/bike_dynacraft2.jpeg",
                "Kids Single Speed",
                "16 inch",
                "Albert Green",
                "$40.00",
                "Unavailable",
                cleveland,
                male,
                fiveToSevenYears);

        Bike bikeMongoose1 = new Bike (
                "Mongoose1",
//                Mode 270 Mag Boys' Freestyle Bike
                "client/assets/bike_mongoose1.jpeg",
                "BMX",
                "N/A",
                "Chris Taylor",
                "$37.00",
                "Available",
                cleveland,
                male,
                fiveToSevenYears);

        Bike bikeJohnDeere1	 = new Bike (
                "John Deere1",
//                Heavy Duty Boys Bicycle
                "client/assets/bike_john_deere1.jpeg",
                "Kids Single Speed w/ Training Wheels",
                "16 inch",
                "Robin Thomas",
                "$44.00",
                "Unavailable",
                columbus,
                male,
                fiveToSevenYears);

        Bike bikeKent2	 = new Bike (
                "Kent2",
//                Boy's Ambush Bike
                "client/assets/bike_kent2.jpg",
                "Kids Single Speed",
                "18 inch",
                "Alan Kostrick",
                "$44.00",
                "Available",
                cleveland,
                male,
                fiveToSevenYears);

        Bike bikeHuffy4	 = new Bike (
                "Huffy4",
//                Green Machine RT 20-Inch 3-Wheel Tricycle
                "client/assets/bike_huffy4.jpeg",
                "Drifting Tri-cycle",
                "20 inch",
                "Joan Robinson",
                "$44.00",
                "Available",
                columbus	,
                neutral	,
                fiveToSevenYears	);

        Bike bikePacific1 = new Bike (
                "Pacific1"	,
                "client/assets/bike_pacific1.jpg"	,
                "Kids Single Speed"	,
                "16 inch"	,
                "Cindy Thompson"	,
                "$25.00"	,
                "Available"	,
                columbus	,
                neutral	,
                fiveToSevenYears	);

        Bike bikeHuffy2	 = new Bike (
                "Huffy2"	,
                "client/assets/bike_huffy2.jpg"	,
                "Kids Single Speed"	,
                "16 inch"	,
                "Tom Johnson"	,
                "$37.00"	,
                "Available"	,
                cleveland	,
                female	,
                fiveToSevenYears	);

        Bike bikeGuardian1	 = new Bike (
                "Guardian1"	,
                "client/assets/bike_guardian1.jpg"	,
                "Mountain"	,
                "20 inch"	,
                "Slobodan Franks"	,
                "$60.00"	,
                "Unavailable"	,
                cleveland	,
                female	,
                twelveToFifteenYears	);

        Bike bikeHuffy3	 = new Bike (
                "Huffy3"	,
                "client/assets/bike_huffy3.jpeg"	,
                "Cruiser"	,
                "20 inch"	,
                "Daniel Wright"	,
                "$49.00"	,
                "Available"	,
                cleveland	,
                female	,
                twelveToFifteenYears	);

        Bike bikeKent1	 = new Bike (
                "Kent1"	,
                "client/assets/bike_kent1.jpg"	,
                "BMX"	,
                "20 inch"	,
                "Cliff Jenkins Jr"	,
                "$44.00"	,
                "Unavailable"	,
                columbus	,
                female	,
                twelveToFifteenYears	);

        Bike bikeNext2	 = new Bike (
                "Next2"	,
                "client/assets/bike_next2.jpeg"	,
                "Mountain"	,
                "N/A"	,
                "Simon Vargas"	,
                "$62.00"	,
                "Unavailable"	,
                columbus	,
                female	,
                twelveToFifteenYears	);

        Bike bikeSchwinn1	 = new Bike (
                "Schwinn1"	,
                "client/assets/bike_schwinn1.jpeg"	,
                "Kids Single Speed"	,
                "16 inch"	,
                "Jon Smith"	,
                "$55.00"	,
                "Available"	,
                columbus	,
                female	,
                twelveToFifteenYears	);

        Bike bikeNext3	 = new Bike (
                "Next3"	,
                "client/assets/bike_next3.jpeg"	,
                "Mountain"	,
                "24 inch"	,
                "Simon Vargas"	,
                "$62.00"	,
                "Unavailable"	,
                columbus	,
                female	,
                twelveToFifteenYears	);

        Bike bikeHuffy1	 = new Bike (
                "Huffy1"	,
                "client/assets/bike_huffy1.jpg"	,
                "Kids Single Speed"	,
                "16 inch"	,
                "Cliff Jenkins Jr"	,
                "$34.00"	,
                "Available"	,
                columbus	,
                male	,
                twelveToFifteenYears	);

        Bike bikeNext1	 = new Bike (
                "Next1"	,
                "client/assets/bike_next1.jpeg"	,
                "18-Speed"	,
                "N/A"	,
                "Jesse DeWitt"	,
                "$62.00"	,
                "Available"	,
                columbus	,
                male	,
                twelveToFifteenYears	);

        Bike bikeCannonDale1 = new Bike (
                "Cannon Dale1"	,
                "client/assets/cannon_dale1.jpg"	,
                "Kids High Performance Speed"	,
                "24 inch"	,
                "Mark Coleman"	,
                "$100.00"	,
                "Available"	,
                cleveland	,
                neutral	,
                twelveToFifteenYears	);

        Bike bikeRoadmaster1 = new Bike (
                "RoadMaster1",
//                Granite Peak Boys Mountain Bike, Black
                "client/assets/bikeRoadmaster1.jpg"	,
                "Mountain"	,
                "24 inch"	,
                "George Jefferson"	,
                "$40.00"	,
                "Available"	,
                columbus	,
                neutral	,
                twelveToFifteenYears	);

        Bike bikeKent3	 = new Bike (
                "Kent3"	,
                "client/assets/bikeKent3.jpg"	,
                "BMX"	,
                "20 inch"	,
                "Jane Doey"	,
                "$44.00"	,
                "Unavailable"	,
                cleveland	,
                female	,
                twelveToFifteenYears	);

        Bike bikeRetrospect1	 = new Bike (
                "Retrospect1"	,
                "client/assets/bikeRetrospect1.jpg"	,
                "Balance Bike"	,
                "N/A"	,
                "Jon Smith"	,
                "$39.00"	,
                "Available"	,
                cleveland	,
                neutral	,
                twelveToTwentyFourMonths	);

        Bike smarTrike1	 = new Bike (
                "smarTrike1"	,
                "client/assets/smarTrike1.jpeg"	,
                "Tri-cycle"	,
                "N/A"	,
                "Bonnie Witherspoon"	,
                "$35.00"	,
                "Available"	,
                cleveland	,
                male	,
                twelveToTwentyFourMonths	);

        Bike bikeSchwinn2	 = new Bike (
                "Schwinn2"	,
                "client/assets/bikeSchwinn2.jpg"	,
                "Tri-cycle"	,
                "N/A"	,
                "James Bond"	,
                "$15.00"	,
                "Available"	,
                columbus	,
                neutral	,
                twelveToTwentyFourMonths	);

        Bike bikeHauck1	 = new Bike (
                "Hauck1"	,
                "client/assets/bikeHauck1.jpg"	,
                "Balance Bike"	,
                "N/A"	,
                "Cliff Jenkins Jr"	,
                "$30.00"	,
                "Available"	,
                columbus	,
                male	,
                twoToFourYears);

        Bike bikeRoyalBaby1	 = new Bike (
                "RoyalBaby1"	,
//                Freestyle BMX Bicycle
                "client/assets/bike_royal_baby1.jpg",
                "Kids Single Speed",
                "14 inch",
                "Bob James",
                "$15.00",
                "Available",
                cleveland,
                male,
                twoToFourYears);

        Bike bikeSchwinn3 = new Bike (
                "Schwinn3",
//                PJ Masks: Catboy Kids Bike
                "client/assets/bike_schwinn3.jpeg",
                "Kids Single Speed",
                "12 inch",
                "Christian Lewis",
                "$37.00",
                "Unavailable",
                cleveland,
                male,
                twoToFourYears);

        Bike bikeFisherPrice1	 = new Bike (
                "Fisher-Price1",
//                Fisher-Price Trike
                "client/assets/bike_fischer_price1.jpg"	,
                "Tri-cycle",
                "N/A",
                "Todd Thomas",
                "$15.00",
                "Available",
                cleveland,
                neutral,
                twoToFourYears);

        Bike bikeRadioFlyer1	 = new Bike (
                "Radio Flyer1",
//                Classic Red Dual Deck Tricycle
                "client/assets/bike_radio_flyer1.jpg",
                "Tri-cycle",
                "5 inch",
                "James Brown",
                "$15.00",
                "Available",
                columbus,
                neutral	,
                twoToFourYears);

        Bike bikeRadioFlyer2	 = new Bike (
                "Radio Flyer",
//                Glide & Go Balance Bike
                "client/assets/bike_radio_flyer2.jpg",
                "Balance Bike",
                "11 inch",
                "Kathy Paulson",
                "$20.00",
                "Unavailable",
                columbus,
                neutral	,
                twoToFourYears);

        bikeRepo.save(bikeDynacraft1);
        bikeRepo.save(bikeHuffy5);
        bikeRepo.save(bikeHuffy6);
        bikeRepo.save(bikeDynacraft2);
        bikeRepo.save(bikeMongoose1);
        bikeRepo.save(bikeJohnDeere1);
        bikeRepo.save(bikeKent2);
        bikeRepo.save(bikeHuffy4);
        bikeRepo.save(bikePacific1);
        bikeRepo.save(bikeHuffy2);
        bikeRepo.save(bikeGuardian1);
        bikeRepo.save(bikeHuffy3);
        bikeRepo.save(bikeKent1);
        bikeRepo.save(bikeNext2);
        bikeRepo.save(bikeSchwinn1);
        bikeRepo.save(bikeNext3);
        bikeRepo.save(bikeHuffy1);
        bikeRepo.save(bikeNext1);
        bikeRepo.save(bikeCannonDale1);
        bikeRepo.save(bikeRoadmaster1);
        bikeRepo.save(bikeKent3);
        bikeRepo.save(bikeRetrospect1);
        bikeRepo.save(smarTrike1);
        bikeRepo.save(bikeSchwinn2);
        bikeRepo.save(bikeHauck1);
        bikeRepo.save(bikeRoyalBaby1);
        bikeRepo.save(bikeSchwinn3);
        bikeRepo.save(bikeFisherPrice1);
        bikeRepo.save(bikeRadioFlyer1);
        bikeRepo.save(bikeRadioFlyer2);
    }

}
