package com.formationback.services;

import org.springframework.stereotype.Service;

import java.util.List;
import com.formationback.entities.Categorie;
import com.formationback.repository.CategorieRepository;


import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategorieService {
	private final CategorieRepository CategorieRepo;
	
	public Categorie findbyId(long id) {
		return  CategorieRepo.findById(id);	}

	public List<Categorie> findAll() {
		// TODO Auto-generated method stub
		return  CategorieRepo.findAll();	
	}
}
