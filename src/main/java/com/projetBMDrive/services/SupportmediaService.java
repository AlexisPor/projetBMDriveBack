package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.BmdSupportmedia;

public interface SupportmediaService {
	
	public void addSupportmedia(BmdSupportmedia supmed);

    public List<BmdSupportmedia> findAllSupportmedia();

    public void updateSupportmedia(BmdSupportmedia supmed);

    public void deleteSupportmedia(BmdSupportmedia supmed);

    public BmdSupportmedia findSupportmediaById(BigDecimal id);

}
