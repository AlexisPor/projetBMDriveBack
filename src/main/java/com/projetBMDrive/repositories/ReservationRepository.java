package com.projetBMDrive.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetBMDrive.entities.TReservation;

@Repository
public interface ReservationRepository extends JpaRepository<TReservation, BigDecimal> {

}
