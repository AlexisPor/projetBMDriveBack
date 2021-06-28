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

import com.projetBMDrive.entities.BmdCategorie;
import com.projetBMDrive.services.CategorieServiceImpl;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/ca")
public class CategorieRestController {

	@Autowired
	private CategorieServiceImpl categorieService;
	
	/**
	 * Afficher la liste des catégories.
	 * @return
	 */
	@GetMapping("/catMap") 
	public List<BmdCategorie> findAllCategorie()
	{
		return categorieService.findAllCategorie();
	}
	
	/**
	 * Chercher une catégorie par son id.
	 * @param catId
	 * @param cat
	 * @return
	 */
	@GetMapping("/catMap/{catId}") 
	public BmdCategorie findCategorieById(@PathVariable("catId") BigDecimal catId, BmdCategorie cat)
	{
		return categorieService.findCategorieById(catId);
	}
	
	/**
	 * Ajout d'une catégorie.
	 * @param cat
	 */
	@PostMapping("/catMap")
	public void addCategorie(@RequestBody BmdCategorie cat) 
	{
		categorieService.addCategorie(cat);
	}
	
	/**
	 * Modifier les infos d'une catégorie.
	 * @param cat
	 */
	@PutMapping("/catMap")
	public void updateCategorie(@RequestBody BmdCategorie cat)
	{
		 categorieService.updateCategorie(cat);
	}
	
	/**
	 * Supprimer une catégorie.
	 * @param catId
	 * @param cat
	 */
	@DeleteMapping("/catMap/{catId}")
	public void deleteCategorie(@PathVariable("catId") BigDecimal catId) 
	{
		BmdCategorie cat= categorieService.findCategorieById(catId);
		categorieService.deleteCategorie(cat);
	}
}
