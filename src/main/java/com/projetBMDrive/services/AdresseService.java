package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.BmdAdresse;

public interface AdresseService  {
	
	public void addAdresse(BmdAdresse adresse);
	
	public void deleteAdresse(BmdAdresse adresse);
	
	public void updateAdresse(BmdAdresse adresse);
	
	public List<BmdAdresse> findAllAdresse();
	
	BmdAdresse findByIdAdresse(BigDecimal adrId);
}
