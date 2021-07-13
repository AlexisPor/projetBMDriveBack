package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.BmdAdherent;
import com.projetBMDrive.repositories.AdherentRepository;


@Service
@Transactional
public class AdherentServiceImpl implements AdherentService {
	
	@Autowired
	private AdherentRepository adherentRepo;
	
	@Autowired
	private IdentiteService ideService;
	
	@Override
	public void addAdherent(BmdAdherent adherent) {
		ideService.addIdentite(adherent.getBmdIdentite());
		adherent.setAdhId(adherent.getBmdIdentite().getIdeId());
		adherentRepo.save(adherent);
	}

	@Override
	public void deleteAdherent(BmdAdherent adherent) {
		adherentRepo.delete(adherent);
	}

	@Override
	public void updateAdherent(BmdAdherent adherent) {
		adherent.getBmdIdentite().setIdeId(adherent.getAdhId());
		ideService.updateIdentite(adherent.getBmdIdentite());
		adherentRepo.save(adherent);
	}

	@Override
	public List<BmdAdherent> findAllAdherent() {
		return adherentRepo.findAll();
	}

	@Override
	public BmdAdherent findByIdAdherent(BigDecimal adhId) {
		return adherentRepo.findById(adhId).get();
	}
	
}
