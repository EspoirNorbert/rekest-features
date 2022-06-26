package com.rekest.feature.impl;

import java.util.ArrayList;
import java.util.List;

import com.rekest.dao.impl.HibernateDao;
import com.rekest.entities.employes.Utilisateur;
import com.rekest.exeption.DAOException;
import com.rekest.feature.IFeatureUtilisateur;
import com.rekest.utils.HibernateSession;

public class FeatureUtilisateur implements IFeatureUtilisateur {

	private static FeatureUtilisateur instance = null;
	
	private FeatureUtilisateur() {}

	public static FeatureUtilisateur getCurrentInstance () {
		if (instance == null) instance = new FeatureUtilisateur();
		return instance;
	}
	
	@Override
	public boolean activerUtilisateur (Utilisateur utilisateur) {
		
		return HibernateDao.getCurrentInstance().enableAccount(utilisateur);
	
		
	}

	@Override
	public boolean desactiverUtilisateur (Utilisateur utilisateur) {
		
		return HibernateDao.getCurrentInstance().disableAccount(utilisateur);
	}

	/*
	@Override
	public boolean rafraichirUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return HibernateDao.getCurrentInstance().;
	}
	*/

	@Override
	public List<Utilisateur> listerUtilisateurs() {

		List<Object> objects = HibernateDao.getCurrentInstance().list( Utilisateur.class);
		List<Utilisateur> objs = new ArrayList<>();
		for (Object obj : objects) {
			if (obj instanceof Utilisateur) {
				objs.add((Utilisateur) obj);
			}
		}
		
		return objs;
	}

	@Override
	public List<Utilisateur> listerUtilisateurs(String whereClause) {
		
		List<Object> objects = HibernateDao.getCurrentInstance().list( Utilisateur.class, whereClause);
		List<Utilisateur> objs = new ArrayList<>();
		for (Object obj : objects) {
			if (obj instanceof Utilisateur) {
				objs.add((Utilisateur) obj);
			}
		}
		
		return objs;
	}

	@Override
	public boolean supprimerUtilisateur(Utilisateur utilisateur) {
		return HibernateDao.getCurrentInstance().delete( utilisateur);
		
	}

	@Override
	public boolean modifierUtilisateur(Utilisateur utilisateur) {

		return HibernateDao.getCurrentInstance().update( utilisateur);
	}

	@Override
	public boolean creerUtilisateur(Utilisateur utilisateur) {
	
		return HibernateDao.getCurrentInstance().save( utilisateur);
		
	}


	@Override
	public Utilisateur rechercherUtilisateur(String whereClause) {
		
		return (Utilisateur) HibernateDao.getCurrentInstance().find( Utilisateur.class, whereClause);
	}

	@Override
	public Utilisateur rechercherUtilisateur(Integer primaryKey) {
		
		return (Utilisateur) HibernateDao.getCurrentInstance().find( Utilisateur.class, primaryKey);
	}

	@Override
	public String getTheDaoImplementationClassname() {
		// TODO Auto-generated method stub
		return null;
	}

}
