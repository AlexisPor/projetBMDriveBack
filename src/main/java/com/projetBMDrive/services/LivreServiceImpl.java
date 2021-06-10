package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.TLivre;
import com.projetBMDrive.repositories.LivreRepository;

@Service
@Transactional
public class LivreServiceImpl  implements LivreService{

	@Autowired
	private LivreRepository livreRepos;
	
	@Override
	public void addLivre(TLivre livre) {
		livreRepos.save(livre);
	}

	@Override
	public List<TLivre> findAllLivre() {
		return livreRepos.findAll();
	}

	@Override
	public void updateLivre(TLivre livre) {
		livreRepos.save(livre);
	}

	@Override
	public void deleteLivre(TLivre livre) {
		livreRepos.delete(livre);
		
	}

	@Override
	public TLivre findLivreById(BigDecimal id) {
		return livreRepos.findById(id).get();
	}

	
}
