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
        
        SuggestedAge twelveToTwentyFourMonths = new SuggestedAge ("12-24 Months");
        SuggestedAge twoToFourYears = new SuggestedAge ("2-4 Years");
        SuggestedAge fiveToSevenYears = new SuggestedAge ("5-7 Years");
        SuggestedAge eightToElevenYears = new SuggestedAge ("8-11 Years");
        SuggestedAge twelveToFifteenYears = new SuggestedAge ("12-15 Years");

        suggestedAgeRepo.save(twelveToTwentyFourMonths);
        suggestedAgeRepo.save(twoToFourYears);
        suggestedAgeRepo.save(fiveToSevenYears);
        suggestedAgeRepo.save(eightToElevenYears);
        suggestedAgeRepo.save(twelveToFifteenYears);

        Bike bikeDynacraft1 = new Bike (
                "Dynacraft Manga Starburst Bike - Pink",
//                Twilight Girls Bike",
                "https://media.kohlsimg.com/is/image/kohls/4402065_Multi?wid=2048&hei=2048&op_sharpen=1",
                "Kids Single Speed",
                "16 inch",
                "Marcia Craggett",
                "$37.00",
                "Available",
                cleveland,
                female,
                eightToElevenYears);

        Bike bikeHuffy5	 = new Bike (
                "Huffy Sea Girls Bike - Pink/Blue",
//                Rocket Boys Bike, Green
                "https://i5.walmartimages.com/asr/145c6be5-3064-4e50-b4e9-31551e9eb19f_1.eca4f3e021175583771c251a248d3582.jpeg?odnWidth=undefined&odnHeight=undefined&odnBg=ffffff",
                "Kids Single Speed",
                "20 inch",
                "Serina Nagy"	,
                "$28.00",
                "Available",
                cleveland,
                female,
                eightToElevenYears);

        Bike bikeHuffy6	 = new Bike (
                "Huffy Manga Power Slide Bike - Blue",
//                Rock It Boys Bike, Silver
                "https://ak1.ostkcdn.com/images/products/27704828/Magna-Powerslide-20-Bike-Blue-61d24447-689f-4131-b2fe-8d7accb0d501_1000.jpg",
                "Kids Single Speed",
                "20 inch",
                "Tom Johnson"	,
                "$28.00",
                "Available",
                cleveland,
                male,
                eightToElevenYears);

        Bike bikeDynacraft2	 = new Bike (
                "Dynacraft Manga Major Damage Bike - Green",
//                Invader Boys Bike
                "https://media.kohlsimg.com/is/image/kohls/4402070_Green?wid=2048&hei=2048&op_sharpen=1",
                "Kids Single Speed",
                "16 inch",
                "Albert Green",
                "$40.00",
                "Unavailable",
                cleveland,
                male,
                fiveToSevenYears);

        Bike bikeMongoose1 = new Bike (
                "Mongoose Rebel Kids BMX Bike - Black",
//                Mode 270 Mag Boys' Freestyle Bike
                "https://i5.walmartimages.com/asr/b39513c6-b1f0-4d35-9885-6a589d7d114d_1.27aefc32ef0a7c43d6d5dedc808116af.jpeg?odnWidth=undefined&odnHeight=undefined&odnBg=ffffff",
                "BMX",
                "20 inch",
                "Chris Taylor",
                "$37.00",
                "Available",
                cleveland,
                male,
                eightToElevenYears);

        Bike bikeJohnDeere1	 = new Bike (
                "John Deere Heavy Duty Bike - Green",
//                Heavy Duty Boys Bicycle
                "https://www.duitworld.world/images/z/6o05bp6t6.jpg",
                "Kids Single Speed w/ Training Wheels",
                "12 inch",
                "Robin Thomas",
                "$44.00",
                "Unavailable",
                columbus,
                male,
                fiveToSevenYears);

        Bike bikeKent2	 = new Bike (
                "Kent Abyss Bike - Charcoal",
//                Boy's Ambush Bike
                "https://cdn.shopify.com/s/files/1/0251/7286/9219/products/18_KentAbyss_A_540x.jpg?v=1576787927",
                "Kids Single Speed",
                "18 inch",
                "Alan Kostrick",
                "$44.00",
                "Available",
                cleveland,
                male,
                fiveToSevenYears);

        Bike bikeHuffy4	 = new Bike (
                "Huffy Green Machine Bike - Green",
//                Green Machine RT 20-Inch 3-Wheel Tricycle
                "https://media.kohlsimg.com/is/image/kohls/2995037?wid=2048&hei=2048&op_sharpen=1",
                "Kids Single Speed",
                "12 inch",
                "Joan Robinson",
                "$44.00",
                "Available",
                columbus	,
                neutral	,
                fiveToSevenYears	);

        Bike bikePacific1 = new Bike (
                "Pacific Flex Bike - Black"	,
                "https://dks.scene7.com/is/image/GolfGalaxy/17BAFYPCFCFLXB16XBTB_Grey?qlt=70&wid=1100&fmt=webp"	,
                "Kids Single Speed",
                "16 inch",
                "Cindy Thompson",
                "$25.00",
                "Available",
                columbus	,
                male	,
                fiveToSevenYears	);

        Bike bikeHuffy2	 = new Bike (
                "Huffy DreamWorks Trolls Poppy Bike - Purple/Pink"	,
                "https://media.kohlsimg.com/is/image/kohls/2848972?wid=2048&hei=2048&op_sharpen=1"	,
                "Kids Single Speed"	,
                "16 inch"	,
                "Tom Johnson"	,
                "$37.00"	,
                "Available"	,
                cleveland	,
                female	,
                fiveToSevenYears	);

        Bike bikeGuardian1	 = new Bike (
                "Guardian Small Ethose Bike - Till"	,
                "https://cdn.shopify.com/s/files/1/1030/6965/products/Guardian-Ethos-20-inch-bike-aqua-pink_12dbf17d-4eb1-4f67-8945-1cbee9ed8d9a_1383x.png?v=1573597985"	,
                "Mountain"	,
                "20 inch"	,
                "Slobodan Franks"	,
                "$60.00"	,
                "Unavailable"	,
                cleveland	,
                female	,
                twelveToFifteenYears	);

        Bike bikeHuffy3	 = new Bike (
                "Huffy Cruiser Bike - Lavender"	,
                "https://www.huffybikes.com/media/catalog/product/cache/2c2a4e3c804766a90bf34abbda7bf13f/7/3/73598-9.jpg"	,
                "Cruiser"	,
                "20 inch"	,
                "Daniel Wright"	,
                "$49.00"	,
                "Available"	,
                cleveland	,
                female	,
                twelveToFifteenYears);

        Bike bikeKent1	 = new Bike (
                "Kent Temptest Bike - Black/Aqua"	,
                "https://i5.walmartimages.com/asr/aa8d6880-41db-4ee0-8aa7-8d05b257a67f_2.37cf62eca51eda25d0af4d8171668169.jpeg?odnWidth=undefined&odnHeight=undefined&odnBg=ffffff"	,
                "BMX"	,
                "20 inch"	,
                "Cliff Jenkins Jr"	,
                "$44.00"	,
                "Unavailable"	,
                columbus	,
                female	,
                twelveToFifteenYears);

        Bike bikeNext2	 = new Bike (
                "Next Mountain Bike wtih Full Suspension - Black"	,
                "https://i5.walmartimages.com/asr/9a94737f-7b7c-4f86-a803-47ff78dfb776_1.b96ceca865ca7ddeae7e3112a4eec08f.jpeg?odnWidth=612&odnHeight=612&odnBg=ffffff"	,
                "Mountain"	,
                "24 inch"	,
                "Simon Vargas"	,
                "$62.00"	,
                "Unavailable"	,
                columbus	,
                neutral	,
                twelveToFifteenYears	);

        Bike bikeSchwinn1	 = new Bike (
                "Schwinn Hello Kitty Bike - Pink"	,
                "https://media.kohlsimg.com/is/image/kohls/1836632?wid=2048&hei=2048&op_sharpen=1"	,
                "Kids Single Speed"	,
                "16 inch"	,
                "Jon Smith"	,
                "$55.00"	,
                "Available"	,
                columbus	,
                female	,
                twelveToFifteenYears	);

        Bike bikeNext3	 = new Bike (
                "Next Gauntlet Mountain Bike - Light Blue"	,
                "https://i5.walmartimages.com/asr/3feb16a6-d66c-4f08-8a47-fd7fdf13350b_1.fd0aa1f6cfbeff8810183ae9bb0f28a2.jpeg?odnWidth=undefined&odnHeight=undefined&odnBg=ffffff"	,
                "Mountain"	,
                "24 inch"	,
                "Simon Vargas"	,
                "$62.00"	,
                "Unavailable"	,
                columbus	,
                female	,
                twelveToFifteenYears	);

        Bike bikeHuffy1	 = new Bike (
                "Huffy Major Damage Bike - Yellow"	,
                "https://media.kohlsimg.com/is/image/kohls/1811525?wid=2048&hei=2048&op_sharpen=1"	,
                "Kids Single Speed"	,
                "16 inch"	,
                "Cliff Jenkins Jr"	,
                "$34.00"	,
                "Available"	,
                columbus	,
                male	,
                fiveToSevenYears	);

        Bike bikeNext1	 = new Bike (
                "Next Gauntlet Bike - Red"	,
                "https://i.ebayimg.com/images/g/pssAAOSw0Q5e9Nxp/s-l1600.jpg"	,
                "18-Speed"	,
                "20 inch"	,
                "Jesse DeWitt"	,
                "$62.00"	,
                "Available"	,
                columbus	,
                male	,
                twelveToFifteenYears	);

        Bike bikeCannonDale1 = new Bike (
                "Cannondale Trail Bike - Blue"	,
                "https://images.giant-bicycles.com/b_white,c_pad,h_650,q_80/ouyq0tlpqu0ykuze7mkq/arx24_1.jpg"	,
                "Kids Single Speed"	,
                "16 inch"	,
                "Mark Coleman"	,
                "$100.00"	,
                "Available"	,
                cleveland	,
                neutral	,
                twelveToFifteenYears	);

        Bike bikeRoadmaster1 = new Bike (
                "RoadMaster Granite Peak BIke - Blue",
//                Granite Peak Boys Mountain Bike, Black
                "https://i5.walmartimages.com/asr/ffb9bfd3-cf80-47e9-8f6c-b72596f99f88_1.43b7ee04660eea072f3bf957849ebeca.jpeg?odnWidth=undefined&odnHeight=undefined&odnBg=ffffff"	,
                "Mountain"	,
                "20 inch"	,
                "George Jefferson"	,
                "$40.00"	,
                "Available"	,
                columbus	,
                female	,
                twelveToFifteenYears	);

        Bike bikeKent3	 = new Bike (
                "Kent Jet BMX Bike - Pink/Black"	,
                "https://cdn.shopify.com/s/files/1/0222/8328/8640/products/6103ab54-d5c8-40cb-bec2-4fc4094c191a_720x.jpg?v=1595234052"	,
                "BMX"	,
                "20 inch"	,
                "Jane Doey"	,
                "$44.00"	,
                "Unavailable"	,
                cleveland	,
                female	,
                twelveToFifteenYears	);

        Bike bikeRetrospect1	 = new Bike (
                "Coewske Steel Frame Bike - White "	,
                "https://images-na.ssl-images-amazon.com/images/I/71kS5jqnQuL._AC_SL1500_.jpg"	,
                "Balance Bike"	,
                "16 inch"	,
                "Jon Smith"	,
                "$39.00"	,
                "Available"	,
                cleveland	,
                neutral	,
                twelveToTwentyFourMonths	);

        Bike smarTrike1	 = new Bike (
                "Radio Flyer Dual Deck Tricycle"	,
                "https://i5.walmartimages.com/asr/729b9cd9-04ad-46e3-b145-bad8ee5aee37_1.352e1c81cc21f389315274b0064835cb.jpeg?odnWidth=undefined&odnHeight=undefined&odnBg=ffffff"	,
                "Tri-cycle"	,
                "12 inch"	,
                "Bonnie Witherspoon"	,
                "$35.00"	,
                "Available"	,
                cleveland	,
                male	,
                fiveToSevenYears	);

        Bike bikeSchwinn2	 = new Bike (
                "Schwinn Grit with Removable Push Handle Bike - Orange"	,
                "https://i5.walmartimages.com/asr/6cf3f3a3-ecce-46c2-904b-2b2f9d254d1b_1.5ce9f13cba135edf53eb2cb569ce1e6b.jpeg?odnWidth=undefined&odnHeight=undefined&odnBg=ffffff"	,
                "Tri-cycle"	,
                "12 inch"	,
                "James Bond"	,
                "$15.00"	,
                "Available"	,
                columbus	,
                neutral	,
                twelveToTwentyFourMonths	);

        Bike bikeHauck1	 = new Bike (
                "Hauck Aluminum Rider Bike - Green"	,
                "https://i5.walmartimages.com/asr/8ed4deb0-832b-460a-aea1-d47c95717433_1.3aa25d5749264326a8d5a7aaef832785.jpeg?odnWidth=undefined&odnHeight=undefined&odnBg=ffffff"	,
                "Balance Bike"	,
                "14 inch"	,
                "Cliff Jenkins Jr"	,
                "$30.00"	,
                "Available"	,
                columbus	,
                male	,
                twoToFourYears);

        Bike bikeRoyalBaby1	 = new Bike (
                "RoyalBaby Honey Button Bike - Pink"	,
//                Freestyle BMX Bicycle
                "https://images-na.ssl-images-amazon.com/images/I/716d4AErWcL._AC_SL1500_.jpg",
                "Kids Single Speed",
                "14 inch",
                "Bob James",
                "$15.00",
                "Available",
                cleveland,
                female,
                fiveToSevenYears);

        Bike bikeSchwinn3 = new Bike (
                "Schwinn Koen - Black",
//                PJ Masks: Catboy Kids Bike
                "https://images-na.ssl-images-amazon.com/images/I/81xmI7FmSzL._AC_SL1500_.jpg",
                "Kids Single Speed",
                "12 inch",
                "Christian Lewis",
                "$37.00",
                "Unavailable",
                cleveland,
                male,
                twoToFourYears);

        Bike bikeFisherPrice1	 = new Bike (
                "Fisher-Price 3-in-1 Interactive Lion - Yellow",
//                Fisher-Price Trike
                "https://i5.walmartimages.com/asr/b3393ba9-a1d1-47af-a320-1ae73b348794_1.2a307a141b03a415c612b5f67b560303.jpeg?odnWidth=undefined&odnHeight=undefined&odnBg=ffffff"	,
                "Tri-cycle",
                "N/A",
                "Todd Thomas",
                "$15.00",
                "Available",
                cleveland,
                neutral,
                twoToFourYears);

        Bike bikeRadioFlyer1	 = new Bike (
                "Radio Flyer 4-in-one Stroll 'N Stride - Red",
//                Classic Red Dual Deck Tricycle
                "https://target.scene7.com/is/image/Target/GUEST_7017dfc6-8b54-4d90-a652-2dcaee354452?fmt=webp&wid=1400&qlt=80",
                "Tri-cycle",
                "5 inch",
                "James Brown",
                "$15.00",
                "Available",
                columbus,
                male	,
                twoToFourYears);

        Bike bikeRadioFlyer2	 = new Bike (
                "Radio Flyer 4-in-one Stroll 'N Stride - Pink",
//                Glide & Go Balance Bike
                "https://target.scene7.com/is/image/Target/GUEST_798f5191-9c1f-4358-a185-37c27658be50?fmt=webp&wid=1400&qlt=80",
                "Balance Bike",
                "5 inch",
                "Kathy Paulson",
                "$20.00",
                "Unavailable",
                columbus,
                female	,
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
