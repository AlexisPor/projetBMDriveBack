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
		// TODO Auto-generated method stub
		adherentRepo.save(adherent);
	}

	@Override
	public void deleteAdherent(TAdherent adherent) {
		// TODO Auto-generated method stub
		adherentRepo.delete(adherent);
	}

	@Override
	public void updateAdherent(TAdherent adherent) {
		// TODO Auto-generated method stub
		adherentRepo.save(adherent);
	}

	@Override
	public List<TAdherent> findAllAdherent() {
		// TODO Auto-generated method stub
		return adherentRepo.findAll();
	}

	@Override
	public TAdherent findByIdAdherent(BigDecimal adhIdLecteur) {
		// TODO Auto-generated method stub
		return adherentRepo.findById(adhIdLecteur).get();
	}
	
	
}
