package com.projetBMDrive.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetBMDrive.entities.TIdentite;
import com.projetBMDrive.services.IdentiteService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/identite")
public class IdentiteRestController {

	IdentiteService idenService;
	
	@GetMapping("/ideMap")
	public List<TIdentite> findAllIdentite() {
		return idenService.findAllIdentite();
	}
	
	@PostMapping("/ideMap")
	public void addIdentite(@RequestBody TIdentite identite) {
		idenService.addIdentite(identite);
	}
	
	@PutMapping("/ideMap/{ideIdentite}")
	public void updateIdentite(@RequestBody TIdentite identite) {
		idenService.updateIdentite(identite);
	}
	
	@DeleteMapping("/ideMap/{idIdentite}")
	public void deleteIdentite(BigDecimal idIdentite) {
		TIdentite iden = idenService.findByIdIdentite(idIdentite);
		idenService.deleteIdentite(iden);
	}
	
	@GetMapping("/ideMap/{idIdentite}")
	public TIdentite findByIdIdentite(BigDecimal idIdentite) {
		return idenService.findByIdIdentite(idIdentite);
	}
}
