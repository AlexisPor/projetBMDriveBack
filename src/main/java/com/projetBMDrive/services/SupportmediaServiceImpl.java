package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.BmdSupportmedia;
import com.projetBMDrive.repositories.ArticleRepository;
import com.projetBMDrive.repositories.SupportmediaRepository;

@Service
@Transactional
public class SupportmediaServiceImpl  implements SupportmediaService{

	@Autowired
	private SupportmediaRepository supmedRepos;
	@Autowired
	private ArticleRepository articleRepos;

	@Override
	public void addSupportmedia(BmdSupportmedia supmed) {
		articleRepos.save(supmed.getBmdArticle());
		supmedRepos.save(supmed);
	}

	@Override
	public List<BmdSupportmedia> findAllSupportmedia() {
		return supmedRepos.findAll();
	}

	@Override
	public void updateSupportmedia(BmdSupportmedia supmed) {
		articleRepos.save(supmed.getBmdArticle());
		supmedRepos.save(supmed);
	}

	@Override
	public void deleteSupportmedia(BmdSupportmedia supmed) {
		supmedRepos.delete(supmed);
	}

	@Override
	public BmdSupportmedia findSupportmediaById(BigDecimal id) {
		return supmedRepos.getOne(id);
	}


	
}
