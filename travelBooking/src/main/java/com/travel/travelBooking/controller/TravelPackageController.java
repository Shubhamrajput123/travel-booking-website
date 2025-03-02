package com.travel.travelBooking.controller;

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
		public TravelPackage savePackage(TravelPackage tPack) {
			return travelPackageService.savePackage(tPack);
		}
//		@GetMapping("/findall")
//		public 
}
