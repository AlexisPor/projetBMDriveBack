package com.projetBMDrive.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetBMDrive.entities.BmdCasier;

@Repository
public interface CasierRepository extends JpaRepository<BmdCasier, BigDecimal> {

}
