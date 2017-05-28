package com.springboot.modules.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.modules.model.Hello;

@Repository
public interface HelloRepository extends JpaRepository<Hello, Integer> {

	List<Hello> findById(Integer l);
	
}
