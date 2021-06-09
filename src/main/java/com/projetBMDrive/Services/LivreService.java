package com.projetBMDrive.service;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.TLivre;

public interface LivreService {
	
	public void addLivre(TLivre livre);

    public List<TLivre> findAllLivre();

    public void updateLivre(TLivre livre);

    public void deleteLivre(TLivre livre);

    public TLivre findLivreById(BigDecimal id);

}
