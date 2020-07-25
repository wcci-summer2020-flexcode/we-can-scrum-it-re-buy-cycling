package com.wecansrumit.rebicycling.repositories;

import com.wecansrumit.rebicycling.model.Bike;
import org.springframework.data.repository.CrudRepository;

public interface BikeRepository extends CrudRepository <Bike, Long> {
}
