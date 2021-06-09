package com.projetBMDrive.Services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.TAgentbm;

public interface AgentBMService {
	
	public void add(TAgentbm abm);

	public List<TAgentbm> findAll();

	public void update(TAgentbm abm);

	public void delete(TAgentbm abm);

	public TAgentbm findById(BigDecimal abmId);

}
