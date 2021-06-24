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

import com.projetBMDrive.entities.BmdCasier;
import com.projetBMDrive.services.CasierService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("casier")
public class CasierRestController {
	
			
			@Autowired
			private CasierService casierService;
			
			/**
			 * Ajout d'un casier.
			 * @param cas
			 */
			@PostMapping("/casMap")
			public void add(@RequestBody BmdCasier cas) {

				casierService.add(cas);
			}

			/**
			 * Afficher la liste des casiers.
			 * @return
			 */
			@GetMapping("/casMap")
			public List<BmdCasier> findAll() {

				return casierService.findAll();
			}
			
			/**
			 * Chercher un casier par son id.
			 * @param casId
			 * @return
			 */
			@GetMapping("/casMap/{casId}")
			public BmdCasier findById(@PathVariable BigDecimal casId) {
				return casierService.findById(casId);
			}

			/**
			 * Supprimer un casier.
			 * @param casId
			 * @param cas
			 */
			@DeleteMapping("/casMap/{casId}")
			public void delete(@PathVariable BigDecimal casId, BmdCasier cas) {

				casierService.delete(cas);
			}

			/**
			 * Modifier les infos d'un casier.
			 * @param cas
			 */
			@PutMapping("/casMap")
			public void updateCasier(@RequestBody BmdCasier cas) {

				casierService.update(cas);
			}


}
