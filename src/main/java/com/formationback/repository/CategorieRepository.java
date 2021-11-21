package com.formationback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formationback.entities.Categorie;


public interface CategorieRepository extends JpaRepository<Categorie,Long>  {
	public Categorie findById(long id);
}
