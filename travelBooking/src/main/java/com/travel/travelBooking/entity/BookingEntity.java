package com.travel.travelBooking.entity;

import org.hibernate.annotations.*;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "Booking")
public class BookingEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private int id;
		@ManyToOne
		@JoinColumn(name="user_id", nullable=false)
		
		private Traveler traveler;
		@ManyToOne
	    @JoinColumn(name = "package_id", nullable = false)
	    private TravelPackage travelPackage;
		
	    @Enumerated(EnumType.STRING)
	    private BookingStatus status;

		
		  
}
