package com.travel.travelBooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.travel.travelBooking")
@ComponentScan(" com.travel.travelBooking.repository.BookingRepo")
public class TravelBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelBookingApplication.class, args);
	}

}
