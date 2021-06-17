package com.projetBMDrive.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetBMDrive.entities.BmdAdresse;

public interface AdresseRepository extends JpaRepository<BmdAdresse, BigDecimal>{

}
