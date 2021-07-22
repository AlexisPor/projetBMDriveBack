package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.BmdArticle;

public interface ArticleService {
	
	public void addArticle(BmdArticle article);

    public List<BmdArticle> findAllArticle();

    public void updateArticle(BmdArticle article);

    public void deleteArticle(BmdArticle article);

    public BmdArticle findArticleById(BigDecimal id);
    
    List<BmdArticle> findByArtAuteurOrArtTitre(String artAuteur, String artTitre);

}
