package com.travel.travelBooking.entity;

import jakarta.persistence.*;

@Entity

public class Traveler {
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@Column
		private String name;
		@Column
		private long ph;
		@Column 
		private long adhar;
			public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getPh() {
			return ph;
		}
		public void setPh(long ph) {
			this.ph = ph;
		}
		public long getAdhar() {
			return adhar;
		}
		public void setAdhar(long adhar) {
			this.adhar = adhar;
		}
		public Traveler() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Traveler(int id, String name, long ph, long adhar) {
			super();
			this.id = id;
			this.name = name;
			this.ph = ph;
			this.adhar = adhar;
		}
	
}
