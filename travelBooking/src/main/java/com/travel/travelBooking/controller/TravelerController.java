package com.travel.travelBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.travelBooking.entity.Traveler;
import com.travel.travelBooking.services.TravlerService;

@RestController
@RequestMapping("/travel")
public class TravelerController {
		@Autowired
		private TravlerService travlerService;
		@PostMapping("/savetraveler")
		public Traveler addTraveler(@RequestBody Traveler trav) {
			return travlerService.saveTravler(trav);
		}
		
		@GetMapping("/findbyid/{id}")
		public Traveler findByID(@PathVariable Integer id) {
			return travlerService.findById(id);
		}
		
		@GetMapping("/findalltraveler")
		public List<Traveler> findAllTraveler(){
			return travlerService.findAll();
		}
		@PutMapping("/updatetraveler")
		public Traveler updateTravelerById(@PathVariable Integer id,@RequestBody Traveler trav) {
			return travlerService.updateById(id, trav);
			
		}
		@DeleteMapping("/deleteall")
		public String deleteAll() {
			travlerService.deleteAll();
			return "All data cleared.";
		}
		@DeleteMapping("/deletebyid/{id}")
		public String deleteById(@PathVariable Integer id) {
			travlerService.deleteById(id);
			return "this data with this id now deleted";
		}
		
}
