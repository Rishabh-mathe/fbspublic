package com.cognizant.flightbookingPublic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.flightbookingPublic.models.City;

@Repository
public interface CityRepo extends JpaRepository<City, Long>{
	
}
