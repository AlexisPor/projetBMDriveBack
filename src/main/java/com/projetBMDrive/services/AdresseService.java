package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.TAdresse;

public interface AdresseService  {
	
	public void addAdresse(TAdresse adresse);
	
	public void deleteAdresse(TAdresse adresse);
	
	public void updateAdresse(TAdresse adresse);
	
	public List<TAdresse> findAllAdresse();
	
	TAdresse findByIdAdresse(BigDecimal adrId);
}
