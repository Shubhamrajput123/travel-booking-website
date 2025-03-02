package com.travel.travelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.travelBooking.entity.Traveler;
@Repository
public interface TravelRepo extends JpaRepository<Traveler, Integer>{

}
