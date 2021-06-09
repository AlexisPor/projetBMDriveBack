package com.projetBMDrive.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetBMDrive.entities.TAdherent;

public interface AdherentRepository extends JpaRepository<TAdherent, BigDecimal> {

}
