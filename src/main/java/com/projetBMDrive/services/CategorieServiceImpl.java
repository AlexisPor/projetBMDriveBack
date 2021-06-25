package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.BmdCategorie;
import com.projetBMDrive.repositories.CategorieRepository;

@Service
@Transactional
public class CategorieServiceImpl  implements CategorieService{

	@Autowired
	private CategorieRepository categorieRepos;

	@Override
	public void addCategorie(BmdCategorie categorie) {
		categorieRepos.save(categorie);
	}

	@Override
	public List<BmdCategorie> findAllCategorie() {
		return categorieRepos.findAll();
	}

	@Override
	public void updateCategorie(BmdCategorie categorie) {
		categorieRepos.save(categorie);
	}

	@Override
	public void deleteCategorie(BmdCategorie categorie) {
		categorieRepos.delete(categorie);
		
	}

	@Override
	public BmdCategorie findCategorieById(BigDecimal id) {
		return categorieRepos.findById(id).get();
	}
	
	

	
}
