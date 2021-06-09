package com.projetBMDrive.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetBMDrive.entities.TCategorie;

public interface CategorieRepository extends JpaRepository<TCategorie, BigDecimal>{

}
