package com.example.TodoProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TodoProject.entities.concretes.Executive;

public interface ExecutiveDao extends JpaRepository<Executive, Integer> {

	Executive getByUserId(Integer userId);
	
}
