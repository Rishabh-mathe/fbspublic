package com.cognizant.flightbookingPublic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.flightbookingPublic.models.Airline;

@Repository
public interface AirlineRepo extends JpaRepository<Airline, Long>{

}
