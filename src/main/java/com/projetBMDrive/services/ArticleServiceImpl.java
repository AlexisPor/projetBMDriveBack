package com.projetBMDrive.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.TArticle;
import com.projetBMDrive.repository.ArticleRepository;

@Service
@Transactional
public class ArticleServiceImpl  implements ArticleService{

	@Autowired
	ArticleRepository articleRepos;

	@Override
	public void addArticle(TArticle article) {
		articleRepos.save(article);
	}

	@Override
	public List<TArticle> findAllArticle() {
		return articleRepos.findAll();
	}

	@Override
	public void updateArticle(TArticle article) {
		articleRepos.save(article);
	}

	@Override
	public void deleteArticle(TArticle article) {
		articleRepos.delete(article);
	}

	@Override
	public TArticle findArticleById(BigDecimal id) {
		return articleRepos.getOne(id);
	}

	
}
