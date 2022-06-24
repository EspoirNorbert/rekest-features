package com.rekest.feature.impl;

import java.util.ArrayList;
import java.util.List;

import com.rekest.dao.impl.HibernateDao;
import com.rekest.entities.Produit;
import com.rekest.entities.employes.Utilisateur;
import com.rekest.feature.IFeatureProduit;

public class FeatureProduit implements IFeatureProduit {

	private static FeatureProduit instance = null;
	
	private FeatureProduit() {}

	public static FeatureProduit getCurrentInstance () {
		if (instance == null) instance = new FeatureProduit();
		return instance;
	}
	
	@Override
	public List<Produit> listerProduits() {

		List<Object> objects = HibernateDao.getCurrentInstance().list( Produit.class);
		List<Produit> objs = new ArrayList<>();
		for (Object obj : objects) {
			if (obj instanceof Produit) {
				objs.add( (Produit) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public List<Produit> listerProduits(String whereClause) {

		List<Object> objects = HibernateDao.getCurrentInstance().list( Produit.class, whereClause);
		List<Produit> objs = new ArrayList<>();
		for (Object obj : objects) {
			if (obj instanceof Produit) {
				objs.add( (Produit) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public boolean supprimerProduit(Produit produit) {
	
		return  HibernateDao.getCurrentInstance().delete( produit);
		
	}

	@Override
	public boolean modifierProduit(Produit produit) {


		return  HibernateDao.getCurrentInstance().update( produit);
		
	}

	@Override
	public boolean creerProduit(Produit produit) {

		return  HibernateDao.getCurrentInstance().save( produit);
		
	}

	@Override
	public Produit rechercherProduit(String whereClause) {

		return  (Produit) HibernateDao.getCurrentInstance().find( Produit.class, whereClause);
	}

	@Override
	public Produit rechercherProduit(Integer primaryKey) {

		return  (Produit) HibernateDao.getCurrentInstance().find( Produit.class, primaryKey);
	}

}
