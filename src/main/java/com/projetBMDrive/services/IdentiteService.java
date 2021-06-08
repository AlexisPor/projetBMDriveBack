package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.TIdentite;

public interface IdentiteService {

	public void addIdentite(TIdentite identite);
	
	public void deleteIdentite(TIdentite identite);
	
	public void updateIdentite(TIdentite identite);
	
	public List<TIdentite> findAllIdentite();
	
	TIdentite findByIdIdentite(BigDecimal idIdentite);
}
