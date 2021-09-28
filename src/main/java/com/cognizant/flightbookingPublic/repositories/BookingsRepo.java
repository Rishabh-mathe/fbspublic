package com.cognizant.flightbookingPublic.repositories;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognizant.flightbookingPublic.models.BookFlightTicket;

@Repository
public interface BookingsRepo extends JpaRepository<BookFlightTicket, Long>{
	
	@Query("select SUM(b.totTickets) from BookFlightTicket b where b.dateOfJourney = :jurneyDate and bookingClass = :bookingClass")
	Long getTotalBookings(@Param("jurneyDate") LocalDate jurneyDate,@Param("bookingClass") String bookingClass);
}
