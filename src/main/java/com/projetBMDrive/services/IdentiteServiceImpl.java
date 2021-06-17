package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.BmdIdentite;
import com.projetBMDrive.repositories.IdentiteRepository;

@Service
@Transactional
public class IdentiteServiceImpl implements IdentiteService{

	@Autowired
	private IdentiteRepository identiteRepo;
	
	@Override
	public void addIdentite(BmdIdentite identite) {
		identiteRepo.save(identite);
	}

	@Override
	public void deleteIdentite(BmdIdentite identite) {
		identiteRepo.delete(identite);
	}

	@Override
	public void updateIdentite(BmdIdentite identite) {
		identiteRepo.save(identite);
	}

	@Override
	public List<BmdIdentite> findAllIdentite() {
		return identiteRepo.findAll();
	}

	@Override
	public BmdIdentite findByIdIdentite(BigDecimal idIdentite) {
		return identiteRepo.findById(idIdentite).get();
	}



}
