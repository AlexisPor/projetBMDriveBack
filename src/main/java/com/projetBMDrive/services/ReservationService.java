package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.BmdReservation;

public interface ReservationService {
	
	public void add(BmdReservation res);

	public List<BmdReservation> findAll();

	public void update(BmdReservation res);

	public void delete(BmdReservation res);

	public BmdReservation findById(BigDecimal resIdReservation);

}
