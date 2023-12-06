package com.example.projetPI.agenceDeVoyage.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetPI.agenceDeVoyage.Models.offre;


public interface offreRepository extends JpaRepository<offre, Long> {
    List<offre> findByName(String name);


}
