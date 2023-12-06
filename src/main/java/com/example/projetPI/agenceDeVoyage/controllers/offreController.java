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

import com.example.projetPI.agenceDeVoyage.services.offreService;
import com.example.projetPI.agenceDeVoyage.Models.destination;
import com.example.projetPI.agenceDeVoyage.Models.offre;
import com.example.projetPI.agenceDeVoyage.services.destinationService;


@RequestMapping("api/offres")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class offreController {

	@Autowired
	private offreService offreService;
	
	@Autowired
	private destinationService destinationService;
	
	@GetMapping
	public List<offre> getAlloffrees(){
		return offreService.getAlloffres();
	}
	
	@GetMapping("/{id}")
	public offre getoffre(@PathVariable Long id) {
		return offreService.getoffreById(id);
	}
	
	@GetMapping("offre/{name}")
	public List<offre> getoffreByName(@PathVariable String name) {
		return offreService.getoffreByName(name);
	}
	
	@DeleteMapping("/{x}")
	public void deleteoffreById(@PathVariable Long x) {
	 offreService.deleteoffre(x);}
	
	@PostMapping("/{DestinationId}")
	public offre addoffre(@RequestBody offre o , @PathVariable Long DestinationId) {	
		destination d = destinationService.getdestinationById(DestinationId);
		o.setDestination(d);
		return offreService.addoffre(o);
	}
	
	
	@PutMapping
	public offre Editoffre(@RequestBody offre m) {
		return offreService.updateoffre(m);
	}
}
