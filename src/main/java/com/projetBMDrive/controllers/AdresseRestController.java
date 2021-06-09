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

import com.projetBMDrive.entities.TAdresse;
import com.projetBMDrive.services.AdresseService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/adresse")
public class AdresseRestController {
	
	@Autowired
	AdresseService adrService;
	
	@GetMapping("/adrMap")
	public List<TAdresse> findAllAdresse() {
		return adrService.findAllAdresse();
		
	}
	
	@PostMapping("/adrMap")
	public void addAdresse(@RequestBody TAdresse adresse) {
		adrService.addAdresse(adresse);
	}
	
	@PutMapping("/adrMap/{adrId}")
	public void updateAdresse(@RequestBody TAdresse adresse) {
		adrService.updateAdresse(adresse);
	}
	
	@DeleteMapping("/adrMap/{adrId}")
	public void deleteAdresse(BigDecimal adrId) {
		TAdresse adr = adrService.findByIdAdresse(adrId);
		adrService.deleteAdresse(adr);
	}
	
	@GetMapping("/adrMap/{adrId}")
	public TAdresse findByIdAdresse(BigDecimal adrId) {
		return adrService.findByIdAdresse(adrId);
	}
}