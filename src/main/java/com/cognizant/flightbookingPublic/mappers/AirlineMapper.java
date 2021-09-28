package com.cognizant.flightbookingPublic.mappers;

import org.springframework.stereotype.Component;

import com.cognizant.flightbookingPublic.dtos.AirlineDto;
import com.cognizant.flightbookingPublic.models.Airline;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

@Component
public class AirlineMapper extends ConfigurableMapper{

	@Override
	protected void configure(MapperFactory factory) {
		super.configure(factory);
		factory.registerClassMap(
				factory.classMap(AirlineDto.class, Airline.class)
				.byDefault()
				);
	}

}
