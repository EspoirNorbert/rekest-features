package com.rekest.entities;

import java.util.ArrayList;
import java.util.List;

import com.rekest.entities.employes.ChefService;
import com.rekest.entities.employes.Employe;
import com.rekest.feature.impl.Feature;

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
	
	@Column(unique=true)
	private String nom;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_service")
	private List<Employe> employes = new ArrayList<>();

	@OneToOne(targetEntity=ChefService.class)
	@JoinColumn(name = "id_chefservice")
	private ChefService chefService;
	

	
	public Service() {}

	public Service(String nom) {
		this.nom = nom;
	}

	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
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
	}

	public void removeEmploye(Employe employe) {
		employes.remove(employe);
	}
	public ChefService getChefService() {
		return chefService;
	}

	public void setChefService(ChefService chefService) {
		this.chefService = chefService;
	}

	public static void copy(Service service, Service entity) {
		
	}
}
