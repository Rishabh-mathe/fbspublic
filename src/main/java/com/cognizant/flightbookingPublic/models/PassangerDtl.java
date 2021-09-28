package com.cognizant.flightbookingPublic.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PassangerDtl {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long passangerId;
	private String passangerName;
	private long passangerAge;
	private String foodType;
	private Character gender;
	@ManyToOne
	private BookFlightTicket bookFlightTicket;
	private String ticketStatus;
	private long book_flight_fk;
	public long getBook_flight_fk() {
		return book_flight_fk;
	}
	public void setBook_flight_fk(long book_flight_fk) {
		this.book_flight_fk = book_flight_fk;
	}
	public long getPassangerId() {
		return passangerId;
	}
	public void setPassangerId(long passangerId) {
		this.passangerId = passangerId;
	}
	public String getPassangerName() {
		return passangerName;
	}
	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}
	public long getPassangerAge() {
		return passangerAge;
	}
	public void setPassangerAge(long passangerAge) {
		this.passangerAge = passangerAge;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	public BookFlightTicket getBookFlightTicket() {
		return bookFlightTicket;
	}
	public void setBookFlightTicket(BookFlightTicket bookFlightTicket) {
		this.bookFlightTicket = bookFlightTicket;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
}
