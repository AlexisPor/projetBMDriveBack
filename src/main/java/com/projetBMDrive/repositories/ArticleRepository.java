package com.projetBMDrive.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetBMDrive.entities.BmdArticle;
import java.lang.String;
import java.util.List;

public interface ArticleRepository extends JpaRepository<BmdArticle, BigDecimal>{
	
	List<BmdArticle> findByArtAuteurOrArtTitre(String artAuteur, String artTitre);

}
