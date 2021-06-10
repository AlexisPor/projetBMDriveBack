package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.TPanier;

public interface PanierService {
	
	public void add(TPanier pan);

	public List<TPanier> findAll();

	public void update(TPanier pan);

	public void delete(TPanier pan);

	public TPanier findById(BigDecimal panId);

}
