package com.wecansrumit.rebicycling.repositories;

import com.wecansrumit.rebicycling.model.Gender;
import org.springframework.data.repository.CrudRepository;

public interface GenderRepository extends CrudRepository <Gender, Long> {
}
