package com.projetBMDrive.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetBMDrive.entities.BmdArticle;

public interface ArticleRepository extends JpaRepository<BmdArticle, BigDecimal>{

}
