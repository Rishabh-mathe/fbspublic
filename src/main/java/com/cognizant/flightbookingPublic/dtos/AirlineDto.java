package com.cognizant.flightbookingPublic.dtos;

public class AirlineDto {
	private long id;
	
	private String airlineName;
	
	private String ownerName;
	
	private String ownerMobile;
	
	private String ownerEmail;
		
	private Long totFlights;
	
	private Long activeFlights;
	
	private String status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerMobile() {
		return ownerMobile;
	}

	public void setOwnerMobile(String ownerMobile) {
		this.ownerMobile = ownerMobile;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public Long getTotFlights() {
		return totFlights;
	}

	public void setTotFlights(Long totFlights) {
		this.totFlights = totFlights;
	}

	public Long getActiveFlights() {
		return activeFlights;
	}

	public void setActiveFlights(Long activeFlights) {
		this.activeFlights = activeFlights;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
