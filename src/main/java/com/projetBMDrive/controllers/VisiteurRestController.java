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

import com.projetBMDrive.entities.TVisiteur;
import com.projetBMDrive.services.VisiteurService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/visiteur")
public class VisiteurRestController {

	@Autowired
	private VisiteurService visService;
	
	@GetMapping("/visMap")
	public List<TVisiteur> findAllVisiteur(){
		return visService.findAllVisiteur();
	}
	
	@PostMapping("/visMap")
	public void addVisiteur(@RequestBody TVisiteur visiteur) {
		visService.addVisiteur(visiteur);
		
	}
	
	@PutMapping("/visMap/{visIdVisiteur}")
	public void updateVisiteur(@RequestBody TVisiteur visiteur) {
		visService.updateVisiteur(visiteur);
	}
	
	@DeleteMapping("/visMap/{visIdVisiteur}")
	public void deleteVisiteur(BigDecimal visIdVisiteur) {
		TVisiteur visiteur = visService.findByIdVisiteur(visIdVisiteur);
		visService.deleteVisiteur(visiteur);
	}
	
	 @GetMapping("/visMap/{visIdVisiteur}")
		public TVisiteur findByIdVisiteur(BigDecimal visIdVisiteur) {
			
			return visService.findByIdVisiteur(visIdVisiteur);
		}
}
