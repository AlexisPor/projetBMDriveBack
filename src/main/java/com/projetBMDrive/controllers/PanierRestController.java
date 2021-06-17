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

import com.projetBMDrive.entities.BmdPanier;
import com.projetBMDrive.services.PanierService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("panier")
public class PanierRestController {

		
		@Autowired
		private PanierService panierService;
		
		/**
		 * Ajout d'un panier
		 * @param pan
		 */
		@PostMapping("/panMap")
		public void add(@RequestBody BmdPanier pan) {

			panierService.add(pan);
		}

		/**
		 * Afficher la liste des paniers.
		 * @return
		 */
		@GetMapping("/panMap")
		public List<BmdPanier> findAll() {

			return panierService.findAll();
		}
		
		/**
		 * Chercher un panier par son id.
		 * @param panId
		 * @return
		 */
		@GetMapping("/panMap/{panId}")
		public BmdPanier findById(@PathVariable BigDecimal panId) {
			return panierService.findById(panId);
		}

		/**
		 * Supprimer un panier.
		 * @param panId
		 * @param pan
		 */
		@DeleteMapping("/panMap/{panId}")
		public void delete(@PathVariable BigDecimal panId,BmdPanier pan) {

			panierService.delete(pan);
		}

		/**
		 * Modifier les infos du panier.
		 * @param pan
		 */
		@PutMapping("/panMap/{panId}")
		public void updatePanier(@RequestBody BmdPanier pan) {

			panierService.update(pan);
		}

}
