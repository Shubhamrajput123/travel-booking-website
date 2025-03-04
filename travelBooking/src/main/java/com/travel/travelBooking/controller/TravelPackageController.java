package com.travel.travelBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.travel.travelBooking.entity.TravelPackage;
import com.travel.travelBooking.services.TravelPackageService;

@RestController
@RequestMapping("/package")
public class TravelPackageController {
		@Autowired
		private TravelPackageService travelPackageService;
		
		@PostMapping("/savepackage")
		public TravelPackage savePackage(@RequestBody TravelPackage tPack) {
			return travelPackageService.savePackage(tPack);
		}
		@GetMapping("/findallpackage")
		public List<TravelPackage> findAllPackage(){
			return travelPackageService.findAll();
		}
		
		@GetMapping("/findpackageby/{id}")
		public TravelPackage findById(@PathVariable Integer id) {
			return travelPackageService.findById(id);
			
		}
		
		@DeleteMapping("/deleteallpackage")
		public String deleteAllPackage() {
			travelPackageService.deletePackage();
			return "All data cleared !";
		}
		
		@DeleteMapping("/deletepackageby/{id}")
		public String deletePackByID(@PathVariable Integer id) {
			travelPackageService.deleteById(id);
			return "Data deleted";
		}
		
		@PutMapping("/updatepackage/{id)")
		public TravelPackage updatePackById(@PathVariable Integer id,@RequestBody TravelPackage travelPackage) {
			return travelPackageService.updateById(id, travelPackage);
		}
		
		
		
}
