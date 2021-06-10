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

import com.projetBMDrive.entities.TArticle;
import com.projetBMDrive.services.ArticleServiceImpl;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/ar")
public class ArticleController {

	@Autowired
	ArticleServiceImpl articleService;
	
	/**
	 * Liste des articles
	 * @return
	 */
	@GetMapping("/artMap") 
	public List<TArticle> findAllArticle()
	{
		return articleService.findAllArticle();
	}
	
	@GetMapping("/artMap/{artIdObjet}") 
	public TArticle findArticleById(@PathVariable("artIdObjet") BigDecimal artIdObjet, TArticle article)
	{
		return articleService.findArticleById(artIdObjet);
	}
	
	@PostMapping("/artMap")
	public void addArticle(@RequestBody TArticle article) 
	{
		articleService.addArticle(article);
	}
	
	@PutMapping("/artMap/{artIdObjet}")
	public void updateArticle(@RequestBody TArticle article)
	{
		 articleService.updateArticle(article);
	}
	
	@DeleteMapping("/artMap/{artIdObjet}")
	public void deleteArticle(@PathVariable("artIdObjet") BigDecimal artIdObjet, TArticle article) 
	{
		articleService.deleteArticle(article);
	}
	
}
