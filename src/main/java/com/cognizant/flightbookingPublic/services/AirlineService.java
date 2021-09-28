package com.cognizant.flightbookingPublic.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.flightbookingPublic.dtos.AirlineDto;
import com.cognizant.flightbookingPublic.mappers.AirlineMapper;
import com.cognizant.flightbookingPublic.models.Airline;
import com.cognizant.flightbookingPublic.repositories.AirlineRepo;

@Service
public class AirlineService {

	@Autowired
	private AirlineRepo airlineRepo;
	
	@Autowired
	private AirlineMapper airlineMapper;
	
	public List<AirlineDto> getAllAirline() {
		ArrayList<AirlineDto> airlineDtos = new ArrayList<AirlineDto>();
		airlineRepo.findAll().stream().forEach(airline->{
			airlineDtos.add(airlineMapper.map(airline, AirlineDto.class));
		});
		return airlineDtos;
	}
}
