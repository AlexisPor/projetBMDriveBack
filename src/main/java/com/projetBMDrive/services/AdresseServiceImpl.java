package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.BmdAdresse;
import com.projetBMDrive.repositories.AdresseRepository;

@Service
@Transactional
public class AdresseServiceImpl implements AdresseService {
	
	@Autowired
	private AdresseRepository adresseRepo;
	
	@Override
	public void addAdresse(BmdAdresse adresse) {
		adresseRepo.save(adresse);
	}

	@Override
	public void deleteAdresse(BmdAdresse adresse) {
		adresseRepo.delete(adresse);
	}

	@Override
	public void updateAdresse(BmdAdresse adresse) {
		adresseRepo.save(adresse);
	}

	@Override
	public List<BmdAdresse> findAllAdresse() {
		return adresseRepo.findAll();
	}

	@Override
	public BmdAdresse findByIdAdresse(BigDecimal adrId) {
		return adresseRepo.findById(adrId).get();
	}

}
