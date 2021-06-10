package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.TCategorie;

public interface CategorieService {
	
	public void addCategorie(TCategorie categorie);

    public List<TCategorie> findAllCategorie();

    public void updateCategorie(TCategorie categorie);

    public void deleteCategorie(TCategorie categorie);

    public TCategorie findCategorieById(BigDecimal id);

}
