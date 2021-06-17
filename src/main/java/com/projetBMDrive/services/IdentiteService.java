package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.BmdIdentite;

public interface IdentiteService {

	public void addIdentite(BmdIdentite identite);
	
	public void deleteIdentite(BmdIdentite identite);
	
	public void updateIdentite(BmdIdentite identite);
	
	public List<BmdIdentite> findAllIdentite();
	
	BmdIdentite findByIdIdentite(BigDecimal idIdentite);
}
