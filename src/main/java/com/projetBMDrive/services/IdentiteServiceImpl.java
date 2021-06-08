package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.TIdentite;
import com.projetBMDrive.repositories.IdentiteRepository;

@Service
@Transactional
public class IdentiteServiceImpl implements IdentiteService{

	@Autowired
	private IdentiteRepository identiteRepo;
	
	@Override
	public void addIdentite(TIdentite identite) {
		// TODO Auto-generated method stub
		identiteRepo.save(identite);
	}

	@Override
	public void deleteIdentite(TIdentite identite) {
		// TODO Auto-generated method stub
		identiteRepo.delete(identite);
	}

	@Override
	public void updateIdentite(TIdentite identite) {
		// TODO Auto-generated method stub
		identiteRepo.save(identite);
	}

	@Override
	public List<TIdentite> findAllIdentite() {
		// TODO Auto-generated method stub
		return identiteRepo.findAll();
	}

	@Override
	public TIdentite findByIdIdentite(BigDecimal idIdentite) {
		// TODO Auto-generated method stub
		return identiteRepo.findById(idIdentite).get();
	}



}
