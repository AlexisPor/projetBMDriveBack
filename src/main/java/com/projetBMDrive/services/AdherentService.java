package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.BmdAdherent;

public interface AdherentService  {
	
	public void addAdherent(BmdAdherent adherent);
	
	public void deleteAdherent(BmdAdherent adherent);
	
	public void updateAdherent(BmdAdherent adherent);
	
	public List<BmdAdherent> findAllAdherent();
	
	BmdAdherent findByIdAdherent(BigDecimal adhIdLecteur);
}
