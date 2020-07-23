package com.wecansrumit.rebicycling.controllers;

import com.wecansrumit.rebicycling.model.Shop;
import com.wecansrumit.rebicycling.repositories.ShopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
public class ShopRestController {
    @Resource
    private ShopRepository shopRepo;

    @GetMapping("/api/shops")
    public Collection<Shop> getAllShops() {
        return (Collection<Shop>) shopRepo.findAll();
    }

    @GetMapping("/api/shops/{shopId}")
    public Shop getShop(@PathVariable Long shopId){
        return shopRepo.findById(shopId).get();
    }
}
