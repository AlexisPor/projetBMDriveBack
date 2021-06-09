package com.projetBMDrive.Repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetBMDrive.entities.TCasier;

@Repository
public interface CasierRepository extends JpaRepository<TCasier, BigDecimal> {

}
