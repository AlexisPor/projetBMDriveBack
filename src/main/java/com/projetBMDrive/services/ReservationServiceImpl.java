package com.projetBMDrive.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.entities.BmdReservation;
import com.projetBMDrive.repositories.ReservationRepository;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private ReservationRepository reservationRepository;

	@Override
	public void add(BmdReservation res) {
		reservationRepository.save(res);
	}

	@Override
	public List<BmdReservation> findAll() {
		return reservationRepository.findAll();
	}

	@Override
	public void update(BmdReservation res) {
		reservationRepository.save(res);
	}

	@Override
	public void delete(BmdReservation res) {
		reservationRepository.delete(res);
	}

	@Override
	public BmdReservation findById(BigDecimal resIdReservation) {
		return reservationRepository.findById(resIdReservation).get();
	}

}
