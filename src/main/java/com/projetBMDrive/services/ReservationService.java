package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import com.projetBMDrive.entities.TReservation;

public interface ReservationService {
	
	public void add(TReservation res);

	public List<TReservation> findAll();

	public void update(TReservation res);

	public void delete(TReservation res);

	public TReservation findById(BigDecimal resIdReservation);

}
