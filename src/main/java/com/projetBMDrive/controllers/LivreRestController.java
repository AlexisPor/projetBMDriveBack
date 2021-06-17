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

import com.projetBMDrive.entities.BmdLivre;
import com.projetBMDrive.services.LivreServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/li")
public class LivreRestController {

	@Autowired
	private LivreServiceImpl livreService;
	
	/**
	 * Afficher la liste des livres.
	 * @return
	 */
	@GetMapping("/livMap") 
	public List<BmdLivre> findAllLivre()
	{
		return livreService.findAllLivre();
	}
	
	/**
	 * Chercher un livre par son id.
	 * @param livId
	 * @param livre
	 * @return
	 */
	@GetMapping("/livMap/{livId}") 
	public BmdLivre findLivreById(@PathVariable("livId") BigDecimal livId, BmdLivre livre)
	{
		return livreService.findLivreById(livId);
	}
	
	/**
	 * Ajout d'un livre.
	 * @param livre
	 */
	@PostMapping("/livMap")
	public void addLivre(@RequestBody BmdLivre livre) 
	{
		livreService.addLivre(livre);
	}
	
	/**
	 * Modifier les infos d'un livre.
	 * @param livre
	 */
	@PutMapping("/livMap/{livId}")
	public void updateLivre(@RequestBody BmdLivre livre)
	{
		 livreService.updateLivre(livre);
	}
	
	/**
	 * Supprimer un livre.
	 * @param livId
	 * @param livre
	 */
	@DeleteMapping("/livMap/{livId}")
	public void deleteLivre(@PathVariable("livId") BigDecimal livId, BmdLivre livre) 
	{
		livreService.deleteLivre(livre);
	}
}
