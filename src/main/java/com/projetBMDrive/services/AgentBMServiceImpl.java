package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.TAgentbm;
import com.projetBMDrive.repositories.AgentBMRepository;


@Service
@Transactional
public class AgentBMServiceImpl implements AgentBMService {

	@Autowired
	AgentBMRepository agentBMRepo;
	
	@Override
	public void add(TAgentbm abm) {
		agentBMRepo.save(abm);
	}

	@Override
	public List<TAgentbm> findAll() {
		return agentBMRepo.findAll();
	}

	@Override
	public void update(TAgentbm abm) {
		agentBMRepo.save(abm);
	}

	@Override
	public void delete(TAgentbm abm) {
		agentBMRepo.delete(abm);
	}

	@Override
	public TAgentbm findById(BigDecimal abmId) {
		return agentBMRepo.findById(abmId).get();
	}

	

}
