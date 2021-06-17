package com.projetBMDrive.entities;
// Generated 17 juin 2021 � 10:20:52 by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * BmdReservation generated by hbm2java
 */
@Entity
@Table(name = "BMD_RESERVATION", schema = "BMDRIVE")
public class BmdReservation implements java.io.Serializable {

	private BigDecimal resId;
	private BmdCasier bmdCasier;
	private Date resDateReservation;
	private Set<BmdAgentbm> bmdAgentbms = new HashSet<BmdAgentbm>(0);
	private Set<BmdPanier> bmdPaniers = new HashSet<BmdPanier>(0);

	public BmdReservation() {
	}

	public BmdReservation(BigDecimal resId, Date resDateReservation) {
		this.resId = resId;
		this.resDateReservation = resDateReservation;
	}

	public BmdReservation(BigDecimal resId, BmdCasier bmdCasier, Date resDateReservation, Set<BmdAgentbm> bmdAgentbms,
			Set<BmdPanier> bmdPaniers) {
		this.resId = resId;
		this.bmdCasier = bmdCasier;
		this.resDateReservation = resDateReservation;
		this.bmdAgentbms = bmdAgentbms;
		this.bmdPaniers = bmdPaniers;
	}

	@Id
	@SequenceGenerator(name="BMD_RESERVATION_SEQ", sequenceName = "BMD_RESERVATION_SEQ", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BMD_RESERVATION_SEQ")
	@Column(name = "RES_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getResId() {
		return this.resId;
	}

	public void setResId(BigDecimal resId) {
		this.resId = resId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RES_ID_CASIER")
	public BmdCasier getBmdCasier() {
		return this.bmdCasier;
	}

	public void setBmdCasier(BmdCasier bmdCasier) {
		this.bmdCasier = bmdCasier;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "RES_DATE_RESERVATION", nullable = false, length = 7)
	public Date getResDateReservation() {
		return this.resDateReservation;
	}

	public void setResDateReservation(Date resDateReservation) {
		this.resDateReservation = resDateReservation;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bmdReservation")
	public Set<BmdAgentbm> getBmdAgentbms() {
		return this.bmdAgentbms;
	}

	public void setBmdAgentbms(Set<BmdAgentbm> bmdAgentbms) {
		this.bmdAgentbms = bmdAgentbms;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bmdReservation")
	public Set<BmdPanier> getBmdPaniers() {
		return this.bmdPaniers;
	}

	public void setBmdPaniers(Set<BmdPanier> bmdPaniers) {
		this.bmdPaniers = bmdPaniers;
	}

}
