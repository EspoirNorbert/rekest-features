package com.rekest.entities.employes;

import java.util.ArrayList;
import java.util.List;

import com.rekest.entities.Demande;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Gestionnaire extends Utilisateur {
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="gestionnaire_id")
	private List<Demande> demandes_assignees = new ArrayList<>();

	public Gestionnaire(String nom, String prenom, String login, String password) {
		super(nom, prenom, login, password);		
	}
}
