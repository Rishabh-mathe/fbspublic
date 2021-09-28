package com.cognizant.flightbookingPublic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.flightbookingPublic.models.City;
import com.cognizant.flightbookingPublic.services.CommonService;

@RestController
@CrossOrigin
public class CommonController {

	@Autowired
	private CommonService commonService;
	
	@GetMapping("/getcities")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<City> getCities(){
		List<City> allCity = commonService.getAllCity();
		return allCity;
	}
}
