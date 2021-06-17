package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.BmdAdherent;
import com.projetBMDrive.repositories.AdherentRepository;
import com.projetBMDrive.repositories.IdentiteRepository;

@Service
@Transactional
public class AdherentServiceImpl implements AdherentService {
	
	@Autowired
	private AdherentRepository adherentRepo;
	
	@Autowired
	private IdentiteService ideRepo;
	
	
	
	@Override
	public void addAdherent(BmdAdherent adherent) {
		ideRepo.addIdentite(adherent.getBmdIdentite());
		adherentRepo.save(adherent);
	}

	@Override
	public void deleteAdherent(BmdAdherent adherent) {
		ideRepo.deleteIdentite(adherent.getBmdIdentite());
		adherentRepo.delete(adherent);
	}

	@Override
	public void updateAdherent(BmdAdherent adherent) {
		ideRepo.updateIdentite(adherent.getBmdIdentite());
		adherentRepo.save(adherent);
	}

	@Override
	public List<BmdAdherent> findAllAdherent() {
		return adherentRepo.findAll();
	}

	@Override
	public BmdAdherent findByIdAdherent(BigDecimal adhIdLecteur) {
		return adherentRepo.findById(adhIdLecteur).get();
	}
	
	
}
