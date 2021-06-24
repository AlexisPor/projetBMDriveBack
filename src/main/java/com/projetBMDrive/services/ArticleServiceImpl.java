package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.BmdArticle;
import com.projetBMDrive.repositories.ArticleRepository;

@Service
@Transactional
public class ArticleServiceImpl  implements ArticleService{

	@Autowired
	private ArticleRepository articleRepos;

	@Override
	public void addArticle(BmdArticle article) {
		articleRepos.save(article);
	}

	@Override
	public List<BmdArticle> findAllArticle() {
		return articleRepos.findAll();
	}

	@Override
	public void updateArticle(BmdArticle article) {
		articleRepos.save(article);
	}

	@Override
	public void deleteArticle(BmdArticle article) {
		articleRepos.delete(article);
	}

	@Override
	public BmdArticle findArticleById(BigDecimal id) {
		return articleRepos.findById(id).get();
	}

	
}
