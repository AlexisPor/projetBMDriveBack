package com.projetBMDrive.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetBMDrive.entities.BmdVisiteur;
import com.projetBMDrive.services.VisiteurService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/visiteur")
public class VisiteurRestController {

	@Autowired
	private VisiteurService visService;
	
	/**
	 * Afficher la liste des visiteurs.
	 * @return
	 */
	@GetMapping("/visMap")
	public List<BmdVisiteur> findAllVisiteur(){
		return visService.findAllVisiteur();
	}
	
	/**
	 * Ajout d'un visiteur.
	 * @param visiteur
	 */
	@PostMapping("/visMap")
	public void addVisiteur(@RequestBody BmdVisiteur visiteur) {
		visService.addVisiteur(visiteur);
		
	}
	
	/**
	 * Modifier les infos d'un visiteur.
	 * @param visiteur
	 */
	@PutMapping("/visMap/{visIdVisiteur}")
	public void updateVisiteur(@RequestBody BmdVisiteur visiteur) {
		visService.updateVisiteur(visiteur);
	}
	
	/**
	 * Supprimer un visiteur.
	 * @param visIdVisiteur
	 */
	@DeleteMapping("/visMap/{visIdVisiteur}")
	public void deleteVisiteur(BigDecimal visIdVisiteur) {
		BmdVisiteur visiteur = visService.findByIdVisiteur(visIdVisiteur);
		visService.deleteVisiteur(visiteur);
	}
	
	/**
	 * Chercher un visiteur par son id.
	 * @param visIdVisiteur
	 * @return
	 */
	 @GetMapping("/visMap/{visIdVisiteur}")
		public BmdVisiteur findByIdVisiteur(BigDecimal visIdVisiteur) {
			
			return visService.findByIdVisiteur(visIdVisiteur);
		}
}
