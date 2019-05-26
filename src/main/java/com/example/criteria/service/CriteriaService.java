package com.example.criteria.service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.example.criteria.entity.TPolicy;
import com.example.criteria.entity.TPolicyHolder;
import com.example.criteria.entity.TPolicyHolder_;
import com.example.criteria.entity.TPolicy_;

@Service
public class CriteriaService {

	 @Autowired
	 private EntityManager entityManager;
	 
	 
	 @EventListener
	 private void check(ApplicationReadyEvent aware) {
		 
		 CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		 CriteriaQuery<TPolicyHolder> createQuery = cb.createQuery(TPolicyHolder.class);
		 
		 Root<TPolicyHolder> root = createQuery.from(TPolicyHolder.class);
		 
		 Join<Object, Object> join = root.join("policy", JoinType.INNER);
		 Predicate lessThan = cb.gt(join.get("policyId"), 1000);
		 Predicate equal = cb.equal(join.get("promotoria"), "AB");
		 createQuery.select(root).where(lessThan, equal);
		 
		// 
		
		 
		 TypedQuery<TPolicyHolder> query = entityManager.createQuery(createQuery);
		 
		 query.getResultList().forEach(System.out::println);
		 
		 
	 }
	 
}
