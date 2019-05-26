package com.example.criteria.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TPolicy.class)
public abstract class TPolicy_ {

	public static volatile SingularAttribute<TPolicy, Integer> policyId;
	public static volatile SingularAttribute<TPolicy, String> promotoria;
	public static volatile SingularAttribute<TPolicy, String> federalEntity;

	public static final String POLICY_HOLDER = "policyId";
	public static final String PROMOTORIA = "promotoria";
	public static final String FEDERAL_ENTITY = "federalEntity";

}

