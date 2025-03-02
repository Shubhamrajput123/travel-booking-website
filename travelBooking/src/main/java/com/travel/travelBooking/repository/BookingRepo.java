package com.travel.travelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.travelBooking.entity.BookingEntity;

public interface BookingRepo extends JpaRepository<BookingEntity, Integer>{

}
