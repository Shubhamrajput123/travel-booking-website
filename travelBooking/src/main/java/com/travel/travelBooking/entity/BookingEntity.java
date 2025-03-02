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

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Traveler getTraveler() {
			return traveler;
		}

		public void setTraveler(Traveler traveler) {
			this.traveler = traveler;
		}

		public TravelPackage getTravelPackage() {
			return travelPackage;
		}

		public void setTravelPackage(TravelPackage travelPackage) {
			this.travelPackage = travelPackage;
		}

		public BookingStatus getStatus() {
			return status;
		}

		public void setStatus(BookingStatus status) {
			this.status = status;
		}

		public BookingEntity() {
			super();
			// TODO Auto-generated constructor stub
		}

		public BookingEntity(int id, Traveler traveler, TravelPackage travelPackage, BookingStatus status) {
			super();
			this.id = id;
			this.traveler = traveler;
			this.travelPackage = travelPackage;
			this.status = status;
		}
 
		
		  
}
