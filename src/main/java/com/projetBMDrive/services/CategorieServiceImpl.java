package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.TCategorie;
import com.projetBMDrive.repositories.CategorieRepository;

@Service
@Transactional
public class CategorieServiceImpl  implements CategorieService{

	@Autowired
	CategorieRepository categorieRepos;

	@Override
	public void addCategorie(TCategorie categorie) {
		categorieRepos.save(categorie);
	}

	@Override
	public List<TCategorie> findAllCategorie() {
		return categorieRepos.findAll();
	}

	@Override
	public void updateCategorie(TCategorie categorie) {
		categorieRepos.save(categorie);
	}

	@Override
	public void deleteCategorie(TCategorie categorie) {
		categorieRepos.delete(categorie);
		
	}

	@Override
	public TCategorie findCategorieById(BigDecimal id) {
		return categorieRepos.getOne(id);
	}
	
	

	
}
