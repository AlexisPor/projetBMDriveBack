package com.projetBMDrive.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetBMDrive.entities.TIdentite;

public interface IdentiteRepository extends JpaRepository<TIdentite, BigDecimal> {

}
