package com.projetBMDrive.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetBMDrive.entities.TSupportmedia;

public interface SupportmediaRepository extends JpaRepository<TSupportmedia, BigDecimal>{

}
