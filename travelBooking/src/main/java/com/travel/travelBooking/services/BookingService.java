package com.travel.travelBooking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.travelBooking.entity.BookingEntity;
import com.travel.travelBooking.repository.BookingRepo;

@Service
public class BookingService {
			@Autowired
			private BookingRepo bookingRepo;
			
			public BookingEntity saveBooking(BookingEntity booking) {
				return bookingRepo.save(booking);
			}
			
			public List<BookingEntity> findAllBooking(){
				return bookingRepo.findAll();
			}
			
			public BookingEntity findById(Integer id) {
				return bookingRepo.findById(id).orElse(null);
			}
			public BookingEntity updateById(Integer id, BookingEntity booking) {
				BookingEntity bookingEntity = bookingRepo.findById(id).orElse(null);
				if(bookingEntity != null) {
					bookingEntity.setStatus(booking.getStatus());
					return bookingRepo.save(bookingEntity);
				}
				else throw new RuntimeException("this id is "+id+"not in data");
			}
			public void deleteAll() {
				bookingRepo.deleteAll();
			}
			public void deleteById(Integer id) {
				bookingRepo.deleteById(id);
			}
}
