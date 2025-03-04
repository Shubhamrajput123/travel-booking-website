package com.travel.travelBooking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.*;
import java.util.List;

import com.travel.travelBooking.entity.Traveler;
import com.travel.travelBooking.repository.TravelRepo;
@Service
public class TravlerService {
			@Autowired
			private TravelRepo travelRepo;
//			String url = "jdbc:mysql://localhost:3306/travel";
//			String Uname = "root";
//			String pass = "Rohit@123";
		 
			
			public Traveler saveTravler(Traveler travler) {
				return travelRepo.save(travler);
			}
			public void deleteById(Integer id) {
				travelRepo.deleteById(id);
			}
			public void deleteAll() {
				travelRepo.deleteAll();
				
			}
			public List<Traveler> findAll(){
				return travelRepo.findAll();
			}
			public Traveler findById(Integer id) {
				return travelRepo.findById(id).orElse(null);
			}
			public Traveler updateById(Integer id, Traveler trav) {
				Traveler traveler = travelRepo.findById(id).orElse(null);
				if(traveler != null) {
					traveler.setName(trav.getName());
					traveler.setPh(trav.getPh());
					traveler.setAdhar(trav.getAdhar());
					return travelRepo.save(traveler);
				}
				else {
					throw new RuntimeException("this id"+id+" is not present");
				}
				
			}

}