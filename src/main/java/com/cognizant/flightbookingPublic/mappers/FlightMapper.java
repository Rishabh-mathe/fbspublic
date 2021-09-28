package com.cognizant.flightbookingPublic.mappers;

import org.springframework.stereotype.Component;

import com.cognizant.flightbookingPublic.dtos.FlightsDto;
import com.cognizant.flightbookingPublic.models.Flights;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

@Component
public class FlightMapper extends ConfigurableMapper{
	@Override
	protected void configure(MapperFactory factory) {
		super.configure(factory);
		factory.registerClassMap(
				factory.classMap(FlightsDto.class, Flights.class)
				.byDefault()
				);
	}
}
