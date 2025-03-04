package com.travel.travelBooking.entity;

import jakarta.persistence.*;

@Entity
@Table(name="travel_packages")
public class TravelPackage {
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private int id;
			

			private String description;
			private double price;
			private int avilableSeats;
			public TravelPackage() {
				super();
				// TODO Auto-generated constructor stub
			}
			public TravelPackage(int id, String description, double price, int avilableSeats) {
				super();
				this.id = id;
				this.description = description;
				this.price = price;
				this.avilableSeats = avilableSeats;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			public double getPrice() {
				return price;
			}
			public void setPrice(double price) {
				this.price = price;
			}
			public int getAvilavleSeats() {
				return avilableSeats;
			}
			public void setAvilavleSeats(int avilableSeats) {
				this.avilableSeats = avilableSeats;
			}
			
}
