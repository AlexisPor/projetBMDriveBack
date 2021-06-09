package com.projetBMDrive.service;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.TSupportmedia;

public interface SupportmediaService {
	
	public void addSupportmedia(TSupportmedia supmed);

    public List<TSupportmedia> findAllSupportmedia();

    public void updateSupportmedia(TSupportmedia supmed);

    public void deleteSupportmedia(TSupportmedia supmed);

    public TSupportmedia findSupportmediaById(BigDecimal id);

}
