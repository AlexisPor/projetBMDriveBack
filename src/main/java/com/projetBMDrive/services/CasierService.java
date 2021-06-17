package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.BmdCasier;


public interface CasierService {
	
	public void add(BmdCasier cas);

	public List<BmdCasier> findAll();

	public void update(BmdCasier cas);

	public void delete(BmdCasier cas);

	public BmdCasier findById(BigDecimal casId);

}
