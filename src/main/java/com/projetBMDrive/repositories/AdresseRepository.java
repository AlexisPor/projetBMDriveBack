package com.projetBMDrive.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetBMDrive.entities.TAdresse;

public interface AdresseRepository extends JpaRepository<TAdresse, BigDecimal>{

}
