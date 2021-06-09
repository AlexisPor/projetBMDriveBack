package com.projetBMDrive.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.TSupportmedia;
import com.projetBMDrive.repository.SupportmediaRepository;

@Service
@Transactional
public class SupportmediaServiceImpl  implements SupportmediaService{

	@Autowired
	SupportmediaRepository supmedRepos;

	@Override
	public void addSupportmedia(TSupportmedia supmed) {
		supmedRepos.save(supmed);
	}

	@Override
	public List<TSupportmedia> findAllSupportmedia() {
		return supmedRepos.findAll();
	}

	@Override
	public void updateSupportmedia(TSupportmedia supmed) {
		supmedRepos.save(supmed);
	}

	@Override
	public void deleteSupportmedia(TSupportmedia supmed) {
		supmedRepos.delete(supmed);
	}

	@Override
	public TSupportmedia findSupportmediaById(BigDecimal id) {
		return supmedRepos.getOne(id);
	}


	
}
