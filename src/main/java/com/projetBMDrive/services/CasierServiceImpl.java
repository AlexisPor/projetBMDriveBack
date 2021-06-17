package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.BmdCasier;
import com.projetBMDrive.repositories.CasierRepository;

@Service
@Transactional
public class CasierServiceImpl implements CasierService{
	
	@Autowired
	private CasierRepository casierRepository;

	@Override
	public void add(BmdCasier cas) {
		casierRepository.save(cas);
	}

	@Override
	public List<BmdCasier> findAll() {
		return casierRepository.findAll();
	}

	@Override
	public void update(BmdCasier cas) {
		casierRepository.save(cas);
	}

	@Override
	public void delete(BmdCasier cas) {
		casierRepository.delete(cas);
	}

	@Override
	public BmdCasier findById(BigDecimal casId) {
		return casierRepository.findById(casId).get();
	}

}
