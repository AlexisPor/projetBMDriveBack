package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.BmdAgentbm;

public interface AgentBMService {
	
	public void add(BmdAgentbm abm);

	public List<BmdAgentbm> findAll();

	public void update(BmdAgentbm abm);

	public void delete(BmdAgentbm abm);

	public BmdAgentbm findById(BigDecimal abmId);

}
