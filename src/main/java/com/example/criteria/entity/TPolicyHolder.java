package com.example.criteria.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "T_POL_HLD")
public class TPolicyHolder {

	@Id
	@Column(name = "POL_HLD_ID")
	private Integer policyHolderId;
	
	@Column(name = "First_Name")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "POL_ID",referencedColumnName = "POL_ID")
	private TPolicy policy;

}
