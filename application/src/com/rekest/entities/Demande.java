package com.rekest.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rekest.entities.employes.Employe;
import com.rekest.entities.employes.Utilisateur;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
public class Demande {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id_demande")
	private int id;
	
	private String etat;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_At", columnDefinition="TIMESTAMP")
	private Date  createdAt;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_At", columnDefinition="TIMESTAMP")
	private Date updatedAt;
	
	@OneToOne(targetEntity=Produit.class)
	@JoinColumn(name = "id_produit")
	private Produit produit;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_demande")
	private List<Note> notes = new ArrayList<>();

	@Transient
	private Utilisateur utilisateur;
	
	@Transient
	private Employe employe;

	

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_demande")
	private List<Notification> notifications = new ArrayList<>();
	
	
	
	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	
	public Demande() {
		  this.createdAt = new java.util.Date();
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
		this.updatedAt = new java.util.Date();
	}
	
	public void setProduit(Produit produit) {
		this.produit = produit;
		this.updatedAt = new java.util.Date();
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
		this.updatedAt = new java.util.Date();
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Produit getProduit() {
		return produit;
	}

	public void addNote(Note note) {
		this.notes.add(note);
		this.updatedAt = new java.util.Date();
	}
	public void addNotification(Notification notification) {
		this.notifications.add(notification);
	}
	
	public void removeNotification(Notification notification) {
		this.notifications.remove(notification);
	}
}
