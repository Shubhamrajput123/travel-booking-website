package com.travel.travelBooking.entity;

import org.hibernate.annotations.*;

import jakarta.persistence.Entity;
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
}
