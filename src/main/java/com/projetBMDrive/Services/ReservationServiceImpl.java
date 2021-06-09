package com.projetBMDrive.Services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projetBMDrive.Repositories.ReservationRepository;
import com.projetBMDrive.entities.TReservation;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	ReservationRepository reservationRepository;

	@Override
	public void add(TReservation res) {
		reservationRepository.save(res);
	}

	@Override
	public List<TReservation> findAll() {
		return reservationRepository.findAll();
	}

	@Override
	public void update(TReservation res) {
		reservationRepository.save(res);
	}

	@Override
	public void delete(TReservation res) {
		reservationRepository.delete(res);
	}

	@Override
	public TReservation findById(BigDecimal resIdReservation) {
		return reservationRepository.findById(resIdReservation).get();
	}

}
