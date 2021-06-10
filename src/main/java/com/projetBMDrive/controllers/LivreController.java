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

import com.projetBMDrive.entities.TLivre;
import com.projetBMDrive.services.LivreServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/li")
public class LivreController {

	@Autowired
	LivreServiceImpl livreService;
	
	@GetMapping("/livMap") 
	public List<TLivre> findAllLivre()
	{
		return livreService.findAllLivre();
	}
	
	@GetMapping("/livMap/{livId}") 
	public TLivre findLivreById(@PathVariable("livId") BigDecimal livId, TLivre livre)
	{
		return livreService.findLivreById(livId);
	}
	
	@PostMapping("/livMap")
	public void addLivre(@RequestBody TLivre livre) 
	{
		livreService.addLivre(livre);
	}
	
	@PutMapping("/livMap/{livId}")
	public void updateLivre(@RequestBody TLivre livre)
	{
		 livreService.updateLivre(livre);
	}
	
	@DeleteMapping("/livMap/{livId}")
	public void deleteLivre(@PathVariable("livId") BigDecimal livId, TLivre livre) 
	{
		livreService.deleteLivre(livre);
	}
}
