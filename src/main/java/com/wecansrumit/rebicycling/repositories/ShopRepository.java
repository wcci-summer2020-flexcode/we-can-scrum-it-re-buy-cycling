package com.wecansrumit.rebicycling.repositories;

import com.wecansrumit.rebicycling.model.Shop;
import org.springframework.data.repository.CrudRepository;


public interface ShopRepository extends CrudRepository <Shop, Long> {
}
