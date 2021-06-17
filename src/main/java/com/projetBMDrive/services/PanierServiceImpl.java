package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.BmdPanier;
import com.projetBMDrive.repositories.PanierRepository;

@Service
@Transactional
public class PanierServiceImpl implements PanierService{
	
	@Autowired
	private PanierRepository panierRepository;

	@Override
	public void add(BmdPanier pan) {
		panierRepository.save(pan);
	}

	@Override
	public List<BmdPanier> findAll() {
		return panierRepository.findAll();
	}

	@Override
	public void update(BmdPanier pan) {
		panierRepository.save(pan);
	}

	@Override
	public void delete(BmdPanier pan) {
		panierRepository.delete(pan);
	}

	@Override
	public BmdPanier findById(BigDecimal panId) {
		return panierRepository.findById(panId).get();
	}

}
