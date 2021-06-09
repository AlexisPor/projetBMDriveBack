package com.projetBMDrive.controller;

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

import com.projetBMDrive.entities.TCategorie;
import com.projetBMDrive.service.CategorieServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/ca")
public class CategorieController {

	@Autowired
	CategorieServiceImpl categorieService;
	
	@GetMapping("/catMap") 
	public List<TCategorie> findAllCategorie()
	{
		return categorieService.findAllCategorie();
	}
	
	@GetMapping("/catMap/{catId}") 
	public TCategorie findCategorieById(@PathVariable("catId") BigDecimal catId, TCategorie cat)
	{
		return categorieService.findCategorieById(catId);
	}
	
	@PostMapping("/catMap")
	public void addCategorie(@RequestBody TCategorie cat) 
	{
		categorieService.addCategorie(cat);
	}
	
	@PutMapping("/catMap/{catId}")
	public void updateCategorie(@RequestBody TCategorie cat)
	{
		 categorieService.updateCategorie(cat);
	}
	
	@DeleteMapping("/catMap/{catId}")
	public void deleteCategorie(@PathVariable("catId") BigDecimal catId, TCategorie cat) 
	{
		categorieService.deleteCategorie(cat);
	}
}
