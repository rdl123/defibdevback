package com.formationback.services;

import org.springframework.stereotype.Service;

import com.formationback.entities.Formation;
import com.formationback.repository.FormationRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class FormationService {
	private final FormationRepository FormationRepo;
	public Formation findbyId(long id) {
		return  FormationRepo.findById(id);	}
}
