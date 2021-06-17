package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.BmdVisiteur;
import com.projetBMDrive.repositories.VisiteurRepository;

@Service
@Transactional
public class VisiteurServiceImpl implements VisiteurService {

	@Autowired
	private VisiteurRepository visiteurRepo;
	
	@Override
	public void addVisiteur(BmdVisiteur visiteur) {
		visiteurRepo.save(visiteur);
	}

	@Override
	public void deleteVisiteur(BmdVisiteur visiteur) {
		visiteurRepo.delete(visiteur);
	}

	@Override
	public void updateVisiteur(BmdVisiteur visiteur) {
		visiteurRepo.save(visiteur);
	}

	@Override
	public List<BmdVisiteur> findAllVisiteur() {
		return visiteurRepo.findAll();
	}

	@Override
	public BmdVisiteur findByIdVisiteur(BigDecimal visIdVisiteur) {
		return visiteurRepo.findById(visIdVisiteur).get();
	}

	
}
