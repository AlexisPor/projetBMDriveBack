package com.projetBMDrive.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetBMDrive.entities.BmdAdherent;

public interface AdherentRepository extends JpaRepository<BmdAdherent, BigDecimal> {

}
