package com.example.criteria.controller;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RestController;

import com.example.criteria.entity.TPolicy;
import com.example.criteria.entity.TPolicyHolder;
import com.example.criteria.repository.BaseReposiotry;

@RestController
@PropertySource({ "classpath:application.properties" })
@Transactional
public class CriteriaRestController {

	@Autowired
	private BaseReposiotry rep;

	@PostConstruct
	public void saveData() {
		TPolicyHolder pol = new TPolicyHolder();
		pol.setName("David Morales");
		pol.setPolicyHolderId(1016);
		
		TPolicy one = new TPolicy();
		one.setPolicyId(1555);
		one.setFederalEntity("ACAPULCO");
		one.setPromotoria("AB");
		
		pol.setPolicy(one);
		rep.save(pol);
	}
}
