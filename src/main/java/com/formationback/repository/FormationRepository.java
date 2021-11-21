package com.formationback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formationback.entities.Formation;

public interface FormationRepository extends JpaRepository<Formation,Long> {
	public Formation findById(long id);
	

}