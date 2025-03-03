package com.travel.travelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.travelBooking.entity.BookingEntity;
@Repository
public interface BookingRepo extends JpaRepository<BookingEntity, Integer>{

}
