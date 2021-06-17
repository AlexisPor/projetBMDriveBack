package com.projetBMDrive.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetBMDrive.entities.BmdLivre;

public interface LivreRepository extends JpaRepository<BmdLivre, BigDecimal>{

}
