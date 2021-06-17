package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.BmdCategorie;

public interface CategorieService {
	
	public void addCategorie(BmdCategorie categorie);

    public List<BmdCategorie> findAllCategorie();

    public void updateCategorie(BmdCategorie categorie);

    public void deleteCategorie(BmdCategorie categorie);

    public BmdCategorie findCategorieById(BigDecimal id);

}
