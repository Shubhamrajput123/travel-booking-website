package com.travel.travelBooking.services;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.travelBooking.entity.TravelPackage;
import com.travel.travelBooking.repository.PackageRepo;
@Service
public class TravelPackageService {
			@Autowired
			private PackageRepo packageRepo;
			
			public TravelPackage savePackage(TravelPackage pack) {
				return packageRepo.save(pack);
			}
			public void deletePackage() {
				packageRepo.deleteAll();
			}
			public void deleteById(Integer id) {
				packageRepo.deleteById(id);
			}
			public List<TravelPackage> findAll() {
				return packageRepo.findAll();
			}
			public TravelPackage findById(Integer id) {
				return packageRepo.findById(id).orElse(null);
			}
			
			public TravelPackage updateById(Integer id, TravelPackage pack ) {
				TravelPackage tPack = packageRepo.findById(id).orElse(null);
				if(tPack != null) {
					tPack.setPrice(pack.getPrice());
					tPack.setAvilavleSeats(pack.getAvilavleSeats());
					tPack.setDescription(pack.getDescription());
					return packageRepo.save(tPack);
				}
				else throw new RuntimeException("this id "+id+"is not present");
			}
			
}
