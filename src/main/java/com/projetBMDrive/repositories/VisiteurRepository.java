package com.projetBMDrive.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetBMDrive.entities.BmdVisiteur;

public interface VisiteurRepository extends JpaRepository<BmdVisiteur, BigDecimal>{

}
