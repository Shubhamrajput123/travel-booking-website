package com.travel.travelBooking.entity;

import jakarta.persistence.*;

@Entity
public class Traveler {
		@Id 
		@GeneratedValue
		private int id;
		@Column
		private String name;
		@Column
		private long ph;
		@Column 
		private long adhar;
}
