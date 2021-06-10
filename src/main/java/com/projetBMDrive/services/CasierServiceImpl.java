package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.TCasier;
import com.projetBMDrive.repositories.CasierRepository;

@Service
@Transactional
public class CasierServiceImpl implements CasierService{
	
	@Autowired
	private CasierRepository casierRepository;

	@Override
	public void add(TCasier cas) {
		casierRepository.save(cas);
	}

	@Override
	public List<TCasier> findAll() {
		return casierRepository.findAll();
	}

	@Override
	public void update(TCasier cas) {
		casierRepository.save(cas);
	}

	@Override
	public void delete(TCasier cas) {
		casierRepository.delete(cas);
	}

	@Override
	public TCasier findById(BigDecimal casId) {
		return casierRepository.findById(casId).get();
	}

}
