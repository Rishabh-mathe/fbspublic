package com.cognizant.flightbookingPublic.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {
	
	@Id
	private long cityId;
	private String cityName;
	public long getCityId() {
		return cityId;
	}
	public void setCityId(long cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	

}
