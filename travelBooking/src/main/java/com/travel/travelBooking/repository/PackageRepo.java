package com.travel.travelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.travelBooking.entity.TravelPackage;
@Repository
public interface PackageRepo extends JpaRepository<TravelPackage, Integer>{

}
