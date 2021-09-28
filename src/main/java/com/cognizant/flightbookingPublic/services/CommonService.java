package com.cognizant.flightbookingPublic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.flightbookingPublic.models.City;
import com.cognizant.flightbookingPublic.repositories.CityRepo;

@Service
public class CommonService {

	@Autowired
	private CityRepo cityRepo;
	
	public List<City> getAllCity(){
		List<City> cities = cityRepo.findAll();
		return cities;
	}
}
