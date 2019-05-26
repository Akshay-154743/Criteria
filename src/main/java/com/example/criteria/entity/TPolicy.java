package com.example.criteria.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
	
import lombok.Data;

@Data
@Entity
@Table(name = "T_POL")
public class TPolicy {
	
	@Id
	@Column(name = "POL_ID")
	private Integer policyId;
	
	@Column(name = "POL_HLD_ADR_ST_NM")
	private String federalEntity;
	
	@Column(name = "PROMO_OFC_CD")
	private String promotoria;

}
