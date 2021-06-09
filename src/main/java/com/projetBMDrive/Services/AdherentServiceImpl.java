package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.TAdherent;
import com.projetBMDrive.repositories.AdherentRepository;

@Service
@Transactional
public class AdherentServiceImpl implements AdherentService {
	
	@Autowired
	private AdherentRepository adherentRepo;
	
	@Override
	public void addAdherent(TAdherent adherent) {
		adherentRepo.save(adherent);
	}

	@Override
	public void deleteAdherent(TAdherent adherent) {
		adherentRepo.delete(adherent);
	}

	@Override
	public void updateAdherent(TAdherent adherent) {
		adherentRepo.save(adherent);
	}

	@Override
	public List<TAdherent> findAllAdherent() {
		return adherentRepo.findAll();
	}

	@Override
	public TAdherent findByIdAdherent(BigDecimal adhIdLecteur) {
		return adherentRepo.findById(adhIdLecteur).get();
	}
	
	
}
