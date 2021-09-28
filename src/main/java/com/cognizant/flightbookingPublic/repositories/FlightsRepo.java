package com.cognizant.flightbookingPublic.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.flightbookingPublic.models.Flights;

public interface FlightsRepo extends JpaRepository<Flights, Long> {

	List<Flights> findByFromCityAndToCity(long from, long to);

}
