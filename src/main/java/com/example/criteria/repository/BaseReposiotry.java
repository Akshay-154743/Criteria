package com.example.criteria.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.criteria.entity.TPolicyHolder;

@Primary
@Repository
public interface BaseReposiotry extends JpaRepository<TPolicyHolder, Integer> {

	
}
