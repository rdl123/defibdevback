package com.formationback.controllers;

import org.springframework.web.bind.annotation.*;

import com.formationback.entities.Formation;
import com.formationback.services.FormationService;

import lombok.*;

@CrossOrigin(origins = "*")
@RequestMapping(value = "Formation")
@AllArgsConstructor
@RestController
public class FormationController {

	private final FormationService formationservice;
	
	 @GetMapping(value = "/find/{id}")
	    public Formation findById(@PathVariable long id  ){
	        return  formationservice.findbyId(id);
	    }
}
