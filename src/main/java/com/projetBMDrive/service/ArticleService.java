package com.projetBMDrive.service;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.TArticle;

public interface ArticleService {
	
	public void addArticle(TArticle article);

    public List<TArticle> findAllArticle();

    public void updateArticle(TArticle article);

    public void deleteArticle(TArticle article);

    public TArticle findArticleById(BigDecimal id);

}
