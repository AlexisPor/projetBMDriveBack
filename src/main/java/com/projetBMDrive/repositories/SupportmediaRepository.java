package com.projetBMDrive.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetBMDrive.entities.BmdSupportmedia;

public interface SupportmediaRepository extends JpaRepository<BmdSupportmedia, BigDecimal>{

}
