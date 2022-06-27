package com.rekest.feature.impl;

import java.util.ArrayList;
import java.util.List;

import com.rekest.dao.impl.HibernateDao;
import com.rekest.entities.Produit;
import com.rekest.entities.employes.Utilisateur;
import com.rekest.feature.IFeatureProduit;

public class FeatureProduit implements IFeatureProduit {

	private static FeatureProduit instance = null;
	
	private FeatureProduit () {}

	public static FeatureProduit getCurrentInstance  () {
		if  (instance == null) instance = new FeatureProduit ();
		return instance;
	}
	
	@Override
	public List<Produit> listerProduits () throws Exception {

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Produit.class);
		List<Produit> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Produit) {
				objs.add ( (Produit) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public List<Produit> listerProduits (String whereClause) throws Exception{

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Produit.class, whereClause);
		List<Produit> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Produit) {
				objs.add (  (Produit) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public void supprimerProduit (Produit produit) throws Exception{
	
		HibernateDao.getCurrentInstance ().delete ( produit);
		
	}

	@Override
	public void modifierProduit (Produit produit) throws Exception{


		 HibernateDao.getCurrentInstance ().update ( produit);
		
	}

	@Override
	public void creerProduit (Produit produit) throws Exception{

		HibernateDao.getCurrentInstance ().save ( produit);
		
	}

	@Override
	public Produit rechercherProduit (String whereClause) throws Exception{

		return   (Produit) HibernateDao.getCurrentInstance ().find ( Produit.class, whereClause);
	}

	@Override
	public Produit rechercherProduit (Integer primaryKey) throws Exception {

		return   (Produit) HibernateDao.getCurrentInstance ().find ( Produit.class, primaryKey);
	}

}
