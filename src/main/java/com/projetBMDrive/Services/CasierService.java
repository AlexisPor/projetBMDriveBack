package com.projetBMDrive.Services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.TCasier;


public interface CasierService {
	
	public void add(TCasier cas);

	public List<TCasier> findAll();

	public void update(TCasier cas);

	public void delete(TCasier cas);

	public TCasier findById(BigDecimal casId);

}
