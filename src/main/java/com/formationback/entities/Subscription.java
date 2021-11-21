package com.formationback.entities;

import java.util.Date;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "subscription")
public class Subscription {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true,nullable = false)
    private long id;
	@Column(name = "date_debut")
    private Date date_debut;
	@Column(name = "date_fin")
    private Date date_fin;
	@ManyToOne
	private Formation formation;
	
	@ManyToOne
	private Formateur formateur;
	@ManyToOne
	private Client client;
	
}