package com.cognizant.flightbookingPublic.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.flightbookingPublic.models.FlightSearchReq;
import com.cognizant.flightbookingPublic.models.Flights;
import com.cognizant.flightbookingPublic.services.FlightService;

@RestController
@RequestMapping("/flight")
@CrossOrigin("http://localhost:4200/")
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	@PostMapping
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<List<Flights>> findFights(@RequestBody FlightSearchReq flightReq){
		List<Flights> flight = flightService.getFlight(flightReq);
		return new ResponseEntity<List<Flights>>(flight, HttpStatus.OK);
	}
	
	@GetMapping("/getAvlNumOfTkt")
	public long getAvlNumOfTkt(String jurneyDate, String bookingClass) {
		long avlNumOfTickets = 0;
		DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
		LocalDate parse = LocalDate.parse(jurneyDate,dateformatter);
		Long avlTickets = flightService.getAvlNumOfTickets(parse, bookingClass);
		if(avlTickets != null) {
			avlNumOfTickets = avlTickets;
		}
		return avlNumOfTickets;
	}
}
