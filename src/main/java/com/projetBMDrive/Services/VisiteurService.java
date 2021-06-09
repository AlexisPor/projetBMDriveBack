package com.projetBMDrive.services;



import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.TVisiteur;

public interface VisiteurService {
	
	public void addVisiteur(TVisiteur visiteur);
	
	public void deleteVisiteur(TVisiteur visiteur);
	
	public void updateVisiteur(TVisiteur visiteur);
	
	public List<TVisiteur> findAllVisiteur();
	
	TVisiteur findByIdVisiteur(BigDecimal visIdVisiteur);
}
