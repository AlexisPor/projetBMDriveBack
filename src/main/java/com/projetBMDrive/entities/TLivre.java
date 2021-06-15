package com.projetBMDrive.entities;
// Generated 14 juin 2021 � 17:47:08 by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * TLivre generated by hbm2java
 */
@Entity
@Table(name = "T_LIVRE", schema = "BMDRIVE")
public class TLivre implements java.io.Serializable {

	private BigDecimal livId;
	private TArticle TArticle;
	private BigDecimal livNbPages;

	public TLivre() {
	}

	public TLivre(BigDecimal livId, TArticle TArticle, BigDecimal livNbPages) {
		this.livId = livId;
		this.TArticle = TArticle;
		this.livNbPages = livNbPages;
	}

	@Id
	@SequenceGenerator(name="T_LIVRE_SEQ", sequenceName = "T_LIVRE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_LIVRE_SEQ")
	@Column(name = "LIV_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getLivId() {
		return this.livId;
	}

	public void setLivId(BigDecimal livId) {
		this.livId = livId;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LIV_ARTICLE_ID", nullable = false)
	public TArticle getTArticle() {
		return this.TArticle;
	}

	public void setTArticle(TArticle TArticle) {
		this.TArticle = TArticle;
	}

	@Column(name = "LIV_NB_PAGES", nullable = false, precision = 22, scale = 0)
	public BigDecimal getLivNbPages() {
		return this.livNbPages;
	}

	public void setLivNbPages(BigDecimal livNbPages) {
		this.livNbPages = livNbPages;
	}

}
