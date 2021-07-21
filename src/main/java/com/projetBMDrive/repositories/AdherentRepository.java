package com.projetBMDrive.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetBMDrive.entities.BmdAdherent;
import com.projetBMDrive.entities.BmdIdentite;
import java.util.List;

public interface AdherentRepository extends JpaRepository<BmdAdherent, BigDecimal> {

	List<BmdAdherent> findByBmdIdentiteIdeNomContains(String ideNom);
}
