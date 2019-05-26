package com.example.criteria.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TPolicyHolder.class)
public abstract class TPolicyHolder_ {

	public static volatile SingularAttribute<TPolicyHolder, Integer> policyHolderId;
	public static volatile SingularAttribute<TPolicyHolder, String> name;
	public static volatile SingularAttribute<TPolicyHolder, TPolicy> policyHolder;

	public static final String POLICY_HOLDER_ID = "policyHolderId";
	public static final String NAME = "name";
	public static final String POLICY_HOLDER = "policyId";

}

