package com.projetBMDrive.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetBMDrive.entities.BmdCategorie;

public interface CategorieRepository extends JpaRepository<BmdCategorie, BigDecimal>{

}
