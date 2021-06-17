package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.BmdPanier;

public interface PanierService {
	
	public void add(BmdPanier pan);

	public List<BmdPanier> findAll();

	public void update(BmdPanier pan);

	public void delete(BmdPanier pan);

	public BmdPanier findById(BigDecimal panId);

}
