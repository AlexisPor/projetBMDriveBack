package com.projetBMDrive.Repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetBMDrive.entities.TPanier;

@Repository
public interface PanierRepository extends JpaRepository<TPanier, BigDecimal> {

}
