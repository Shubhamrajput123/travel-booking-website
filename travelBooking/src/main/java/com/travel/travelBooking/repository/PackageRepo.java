package com.travel.travelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.travelBooking.entity.TravelPackage;

public interface PackageRepo extends JpaRepository<TravelPackage, Integer>{

}
