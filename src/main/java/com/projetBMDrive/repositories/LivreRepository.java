package com.projetBMDrive.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetBMDrive.entities.TLivre;

public interface LivreRepository extends JpaRepository<TLivre, BigDecimal>{

}
