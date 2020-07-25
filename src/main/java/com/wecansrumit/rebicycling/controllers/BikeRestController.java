package com.wecansrumit.rebicycling.controllers;

import com.wecansrumit.rebicycling.model.Bike;
import com.wecansrumit.rebicycling.repositories.BikeRepository;
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

    @GetMapping ("/api/bikes")
    public Collection<Bike> getBikes(){
        return (Collection<Bike>) bikeRepo.findAll();
    }

    @GetMapping ("/api/bikes/{id}")
    public Optional<Bike> getBike(@PathVariable Long id) {
        return bikeRepo.findById(id);
    }

}
