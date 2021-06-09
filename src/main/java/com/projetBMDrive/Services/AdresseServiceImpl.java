package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.TAdresse;
import com.projetBMDrive.repositories.AdresseRepository;

@Service
@Transactional
public class AdresseServiceImpl implements AdresseService {
	
	@Autowired
	private AdresseRepository adresseRepo;
	
	@Override
	public void addAdresse(TAdresse adresse) {
		adresseRepo.save(adresse);
	}

	@Override
	public void deleteAdresse(TAdresse adresse) {
		adresseRepo.delete(adresse);
	}

	@Override
	public void updateAdresse(TAdresse adresse) {
		adresseRepo.save(adresse);
	}

	@Override
	public List<TAdresse> findAllAdresse() {
		return adresseRepo.findAll();
	}

	@Override
	public TAdresse findByIdAdresse(BigDecimal adrId) {
		return adresseRepo.findById(adrId).get();
	}

}
