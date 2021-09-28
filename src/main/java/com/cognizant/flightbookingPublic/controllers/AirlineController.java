package com.cognizant.flightbookingPublic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.flightbookingPublic.dtos.AirlineDto;
import com.cognizant.flightbookingPublic.services.AirlineService;

@RestController
@RequestMapping("/airline")
@CrossOrigin
public class AirlineController {

	@Autowired
	private AirlineService airlineService;
	
	@GetMapping
	public List<AirlineDto> getAirlines() {
		return airlineService.getAllAirline();
	}
	
//	@GetMapping("/search-flight")
//	public ResponseEntity<FLight>
	
}
