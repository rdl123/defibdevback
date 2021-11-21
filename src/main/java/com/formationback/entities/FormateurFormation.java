package com.formationback.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class FormateurFormation {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true,nullable = false)
	 private long id;
	  @ManyToOne
			private Formateur formateur;
	  @ManyToOne
			private Formation formation;
  
}
