package com.cognizant.flightbookingPublic.services;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.flightbookingPublic.dtos.FlightsDto;
import com.cognizant.flightbookingPublic.mappers.FlightMapper;
import com.cognizant.flightbookingPublic.models.FlightSearchReq;
import com.cognizant.flightbookingPublic.models.Flights;
import com.cognizant.flightbookingPublic.repositories.BookingsRepo;
import com.cognizant.flightbookingPublic.repositories.FlightsRepo;

@Service
public class FlightService {

	@Autowired
	private FlightMapper flightMapper;
	
	@Autowired
	private BookingsRepo bookingRepo;
	
	@Autowired
	private FlightsRepo flightRepo;
	
	public List<Flights> getFlight(FlightSearchReq flightReq) {
		List<Flights> flights = flightRepo.findByFromCityAndToCity(flightReq.getFrom(),flightReq.getTo());
		String bookingDay = flightReq
								.getJourneyDate()
								.getDayOfWeek().toString().substring(0, 3);
		Predicate<Flights> dayCheker = fl->fl.getDays().contains(bookingDay);
		List<Flights> filteredFlight = flights.stream()
												.filter(dayCheker)
												.collect(Collectors.toList());
		return filteredFlight;
	}
	
	public Long getAvlNumOfTickets(LocalDate jurneyDate, String bookingClass) {
		Long totalBookings = bookingRepo.getTotalBookings(jurneyDate, bookingClass);
		System.out.println(totalBookings);
		return totalBookings;
	}

}
