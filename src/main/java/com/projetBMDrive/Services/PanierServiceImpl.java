package com.projetBMDrive.Services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.Repositories.PanierRepository;
import com.projetBMDrive.entities.TPanier;

@Service
@Transactional
public class PanierServiceImpl implements PanierService{
	
	@Autowired
	PanierRepository panierRepository;

	@Override
	public void add(TPanier pan) {
		panierRepository.save(pan);
	}

	@Override
	public List<TPanier> findAll() {
		return panierRepository.findAll();
	}

	@Override
	public void update(TPanier pan) {
		panierRepository.save(pan);
	}

	@Override
	public void delete(TPanier pan) {
		panierRepository.delete(pan);
	}

	@Override
	public TPanier findById(BigDecimal panId) {
		return panierRepository.findById(panId).get();
	}

}
