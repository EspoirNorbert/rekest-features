package com.rekest.entities.employes;

import jakarta.persistence.Entity;

@Entity
public class Directeur extends Manager {
	
	public Directeur(String nom, String prenom, String telephone, String email, String adresse) {
		super(nom, prenom, telephone, email, adresse);
	}

	
	public Directeur(String nom, String prenom, String login, String password) {
		super(nom, prenom, login, password);
	}
	
	
	public Directeur()
	{
		super();
	}
}
