package com.example.projetPI.agenceDeVoyage.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetPI.agenceDeVoyage.Models.destination;
import com.example.projetPI.agenceDeVoyage.services.destinationService;


@RequestMapping("api/destinations")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class destinationController {
	
	@Autowired
	private destinationService destinationService;
	
	
	@GetMapping
	public List<destination> getAlldestinationes(){
		return destinationService.getAlldestinations();
	}
	
	@GetMapping("/{id}")
	public destination getdestination(@PathVariable Long id) {
		return destinationService.getdestinationById(id);
	}
	
	@GetMapping("destination/{name}")
	public List<destination> getdestinationByName(@PathVariable String name) {
		return destinationService.getdestinationByName(name);
	}
	
	@DeleteMapping("delete/{id}")
	public void deletedestinationById(@PathVariable Long id) {
	 destinationService.deletedestination(id);}
	
	
	
	@PutMapping
	public destination Editdestination(@RequestBody destination m) {
		return destinationService.updatedestination(m);
	}
	
	@PostMapping
	public destination adddestination(@RequestBody destination m) {
		return destinationService.addDestination(m);
	}

}
