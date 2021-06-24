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

import com.projetBMDrive.entities.BmdArticle;
import com.projetBMDrive.services.ArticleServiceImpl;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/ar")
public class ArticleRestController {

	@Autowired
	private ArticleServiceImpl articleService;
	
	/**
	 * Afficher la liste des articles.
	 * @return
	 */
	@GetMapping("/artMap") 
	public List<BmdArticle> findAllArticle()
	{
		return articleService.findAllArticle();
	}
	
	/**
	 * Chercher un article par son id.
	 * @param artIdObjet
	 * @param article
	 * @return
	 */
	@GetMapping("/artMap/{artIdObjet}") 
	public BmdArticle findArticleById(@PathVariable("artIdObjet") BigDecimal artIdObjet, BmdArticle article)
	{
		return articleService.findArticleById(artIdObjet);
	}
	
	/**
	 * Ajout d'un article.
	 * @param article
	 */
	@PostMapping("/artMap")
	public void addArticle(@RequestBody BmdArticle article) 
	{
		System.out.println("Article= "+article);
		articleService.addArticle(article);
	}
	
	/**
	 * Modifier les infos d'un article.
	 * @param article
	 */
	@PutMapping("/artMap/{artIdObjet}")
	public void updateArticle(@RequestBody BmdArticle article)
	{
		 articleService.updateArticle(article);
	}
	
	/**
	 * Supprimer un article.
	 * @param artIdObjet
	 * @param article
	 */
	@DeleteMapping("/artMap/{artIdObjet}")
	public void deleteArticle(@PathVariable("artIdObjet") BigDecimal artIdObjet, BmdArticle article) 
	{
		articleService.deleteArticle(article);
	}
	
}
