package com.formationback.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formationback.entities.Categorie;
import com.formationback.services.CategorieService;

import lombok.AllArgsConstructor;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "Categorie")
@AllArgsConstructor

public class CategorieController {

	private final CategorieService Categorieservice;
	
	 @GetMapping(value = "/find/{id}")
	    public Categorie findById(@PathVariable long id  ){
	        return  Categorieservice.findbyId(id);
	    }
	 
	 @GetMapping(value = "/find/all")
	    public List<Categorie> findAll(){
	        return Categorieservice.findAll();
	    }
}
