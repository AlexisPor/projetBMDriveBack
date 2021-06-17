package com.projetBMDrive.services;



import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.BmdVisiteur;

public interface VisiteurService {
	
	public void addVisiteur(BmdVisiteur visiteur);
	
	public void deleteVisiteur(BmdVisiteur visiteur);
	
	public void updateVisiteur(BmdVisiteur visiteur);
	
	public List<BmdVisiteur> findAllVisiteur();
	
	BmdVisiteur findByIdVisiteur(BigDecimal visIdVisiteur);
}
