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

import com.projetBMDrive.entities.BmdAdherent;
import com.projetBMDrive.services.AdherentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/adherent")
public class AdherentRestController {
	
	@Autowired
	private AdherentService adhService;
	
	/**
	 * Afficher la liste des adherents.
	 * @return
	 */
	@GetMapping("/adhMap")
	public List<BmdAdherent> findAllAdherent() {
		return adhService.findAllAdherent();
	}
	
	/**
	 * Ajout d'un adherent.
	 * @param adherent
	 */
	@PostMapping("/adhMap")
	public void addAdherent(@RequestBody BmdAdherent adherent) {
		adhService.addAdherent(adherent);
	}
	
	/**
	 * Modifier les infos de l'adherent.
	 * @param adherent
	 */
	@PutMapping("/adhMap")
	public void updateAdherent(@RequestBody BmdAdherent adherent) {
		adhService.updateAdherent(adherent);
	}
	
	/**
	 * Supprimer un adherent.
	 * @param adhIdLecteur
	 */
	@DeleteMapping("/adhMap/{adhId}")
	public void deleteAdherent(@PathVariable(name="adhId") BigDecimal adhId) {
		BmdAdherent adh = adhService.findByIdAdherent(adhId);
		adhService.deleteAdherent(adh);
	}
	
	/**
	 * Chercher un adherent par son id.
	 * @param adhIdLecteur
	 * @return
	 */
	@GetMapping("/adhMap/{adhId}")
	public BmdAdherent findByIdAdherent(@PathVariable(name="adhId") BigDecimal adhId) {
		System.err.println(adhId);
		return adhService.findByIdAdherent(adhId);
	}
}
