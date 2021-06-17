package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.BmdLivre;

public interface LivreService {
	
	public void addLivre(BmdLivre livre);

    public List<BmdLivre> findAllLivre();

    public void updateLivre(BmdLivre livre);

    public void deleteLivre(BmdLivre livre);

    public BmdLivre findLivreById(BigDecimal id);

}
