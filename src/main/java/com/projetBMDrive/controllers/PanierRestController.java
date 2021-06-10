package com.projetBMDrive.controllers;

import java.math.BigDecimal;
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

import com.projetBMDrive.entities.TPanier;
import com.projetBMDrive.services.PanierService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("panier")
public class PanierRestController {

		
		@Autowired
		PanierService panierService;
		
		@PostMapping("/panMap")
		public void add(@RequestBody TPanier pan) {

			panierService.add(pan);
		}

		@GetMapping("/panMap")
		public List<TPanier> findAll() {

			return panierService.findAll();
		}
		
		@GetMapping("/panMap/{panId}")
		public TPanier findById(@PathVariable BigDecimal panId) {
			return panierService.findById(panId);
		}

		@DeleteMapping("/panMap/{panId}")
		public void delete(@PathVariable BigDecimal panId,TPanier pan) {

			panierService.delete(pan);
		}

		@PutMapping("/panMap/{panId}")
		public void updatePanier(@RequestBody TPanier pan) {

			panierService.update(pan);
		}

}
