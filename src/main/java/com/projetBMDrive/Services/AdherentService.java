package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.TAdherent;

public interface AdherentService  {
	
	public void addAdherent(TAdherent adherent);
	
	public void deleteAdherent(TAdherent adherent);
	
	public void updateAdherent(TAdherent adherent);
	
	public List<TAdherent> findAllAdherent();
	
	TAdherent findByIdAdherent(BigDecimal adhIdLecteur);
}
