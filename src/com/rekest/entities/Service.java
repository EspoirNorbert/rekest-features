package com.rekest.entities;

import java.util.ArrayList;
import java.util.List;

import com.rekest.entities.employes.ChefService;
import com.rekest.entities.employes.Employe;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Service {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id_service")
	private int id;
	
	private String nom;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="service_id")
	private List<Employe> employes = new ArrayList<>();

	@OneToOne(targetEntity=ChefService.class)
	private ChefService chefService;
	
	public Service(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void addEmploye(Employe employe) {
		employes.add(employe);
		
		//employe.setService(this);
	}
	
	public ChefService getChefService() {
		return chefService;
	}
	
	public void setChefService(ChefService chefService) {
		this.chefService = chefService;
		
		//chefService.setService(this);
	}
}
