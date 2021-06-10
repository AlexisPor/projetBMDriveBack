package com.projetBMDrive.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetBMDrive.entities.TArticle;

public interface ArticleRepository extends JpaRepository<TArticle, BigDecimal>{

}
