package com.cognizant.flightbookingPublic.models;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class BookFlightTicket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(targetEntity = BookFlightTicket.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="book_flight_fk",referencedColumnName = "id")
	private Set<PassangerDtl> passangerDlt;
	private long loggedInUserId;
	private long flightId;
	private LocalDate dateOfJourney;
	private String bookingClass;
	private long totTickets;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Set<PassangerDtl> getPassangerDlt() {
		return passangerDlt;
	}
	public void setPassangerDlt(Set<PassangerDtl> passangerDlt) {
		this.passangerDlt = passangerDlt;
	}
	public long getLoggedInUserId() {
		return loggedInUserId;
	}
	public void setLoggedInUserId(long loggedInUserId) {
		this.loggedInUserId = loggedInUserId;
	}
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
	public LocalDate getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(LocalDate dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public String getBookingClass() {
		return bookingClass;
	}
	public void setBookingClass(String bookingClass) {
		this.bookingClass = bookingClass;
	}
	public long getTotTickets() {
		return totTickets;
	}
	public void setTotTickets(long totTickets) {
		this.totTickets = totTickets;
	}
}
