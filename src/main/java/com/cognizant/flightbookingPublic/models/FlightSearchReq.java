package com.cognizant.flightbookingPublic.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FlightSearchReq {

	private long from;
	private long to;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate journeyDate;
	private String bookingClass;
	public long getFrom() {
		return from;
	}
	public void setFrom(long from) {
		this.from = from;
	}
	public long getTo() {
		return to;
	}
	public void setTo(long to) {
		this.to = to;
	}
	public LocalDate getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getBookingClass() {
		return bookingClass;
	}
	public void setBookingClass(String bookingClass) {
		this.bookingClass = bookingClass;
	}
}
