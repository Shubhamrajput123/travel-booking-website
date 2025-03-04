package com.travel.travelBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.travel.travelBooking.entity.BookingEntity;
import com.travel.travelBooking.services.BookingService;

@RestController
@RequestMapping("/bookingtravel")
public class BookingController {
	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/savebooking")
	public BookingEntity saveBooking(@RequestBody BookingEntity bookingEntity) {
		return bookingService.saveBooking(bookingEntity);
	}
	
	@GetMapping("/findallbooking")
	public List<BookingEntity> findAllBooking(){
		return bookingService.findAllBooking();
	}
	
	@GetMapping("/findbooking/{id}")
	public BookingEntity findBookingById(Integer id) {
		return bookingService.findById(id);
	}
	
	@DeleteMapping("/deleteallbooking")
	public String deleteAllBookings() {
		 bookingService.deleteAll();
		 return "All Booking Deleted";
	}
	
	@DeleteMapping("/deletebookingby/{id}")
	public String deleteBookingById(Integer id) {
		bookingService.deleteById(id);
		return "Booking is deleted";
	}
	
	@PutMapping("/updatebookingby/{id}")
	public BookingEntity updateById(@PathVariable Integer id, @RequestBody BookingEntity bookingEntity) {
		return bookingService.updateById(id, bookingEntity);
	}

}
