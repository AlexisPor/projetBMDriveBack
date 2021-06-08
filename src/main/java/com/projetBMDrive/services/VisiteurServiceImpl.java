package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.TVisiteur;
import com.projetBMDrive.repositories.VisiteurRepository;

@Service
@Transactional
public class VisiteurServiceImpl implements VisiteurService {

	@Autowired
	private VisiteurRepository visiteurRepo;
	
	@Override
	public void addVisiteur(TVisiteur visiteur) {
		// TODO Auto-generated method stub
		visiteurRepo.save(visiteur);
	}

	@Override
	public void deleteVisiteur(TVisiteur visiteur) {
		// TODO Auto-generated method stub
		visiteurRepo.delete(visiteur);
	}

	@Override
	public void updateVisiteur(TVisiteur visiteur) {
		// TODO Auto-generated method stub
		visiteurRepo.save(visiteur);
	}

	@Override
	public List<TVisiteur> findAllVisiteur() {
		// TODO Auto-generated method stub
		return visiteurRepo.findAll();
	}

	@Override
	public TVisiteur findByIdVisiteur(BigDecimal visIdVisiteur) {
		// TODO Auto-generated method stub
		return visiteurRepo.findById(visIdVisiteur).get();
	}

	
}
