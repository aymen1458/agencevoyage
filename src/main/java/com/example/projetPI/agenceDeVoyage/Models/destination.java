package com.example.projetPI.agenceDeVoyage.Models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class destination {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DESTINATION_ID")
	private Long id ;
	@Column(name="nom")
	private String name;
	private String pays;
	
	
	
	public destination() {
		
	}

	public destination(Long id, String name, String pays) {
		this.id = id;
		this.name = name;
		this.pays = pays;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "destination [id=" + id + ", name=" + name + ", pays=" + pays + "]";
	}
	
	
	
}
