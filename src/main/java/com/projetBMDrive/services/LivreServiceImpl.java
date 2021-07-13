package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.BmdLivre;
import com.projetBMDrive.repositories.ArticleRepository;
import com.projetBMDrive.repositories.LivreRepository;

@Service
@Transactional
public class LivreServiceImpl  implements LivreService{

	@Autowired
	private LivreRepository livreRepos;
	
	@Autowired
	private ArticleRepository artRepo;
	
	@Override
	public void addLivre(BmdLivre livre) {
		artRepo.save(livre.getBmdArticle());
		livre.setLivId(livre.getBmdArticle().getArtId());
		livreRepos.save(livre);
	}

	@Override
	public List<BmdLivre> findAllLivre() {
		return livreRepos.findAll();
	}

	@Override
	public void updateLivre(BmdLivre livre) {
		livre.getBmdArticle().setArtId(livre.getLivId());
		artRepo.save(livre.getBmdArticle());
		livreRepos.save(livre);
	}

	@Override
	public void deleteLivre(BmdLivre livre) {
		livreRepos.delete(livre);
		
	}

	@Override
	public BmdLivre findLivreById(BigDecimal id) {
		return livreRepos.findById(id).get();
	}

	
}
