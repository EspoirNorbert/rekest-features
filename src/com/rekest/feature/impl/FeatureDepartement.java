package com.rekest.feature.impl;

import java.util.ArrayList;
import java.util.List;

import com.rekest.dao.impl.HibernateDao;
import com.rekest.entities.Departement;
import com.rekest.feature.IFeatureDepartement;

public class FeatureDepartement implements IFeatureDepartement {

	private static FeatureDepartement instance = null;
	
	private FeatureDepartement () {}

	public static FeatureDepartement getCurrentInstance  () {
		if (instance == null) instance = new FeatureDepartement ();
		return instance;
	}
	
	@Override
	public List<Departement> listerDepartements () throws Exception   {

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Departement.class);
		List<Departement> objs = new ArrayList<> ();
		for (Object obj : objects) {
			if  (obj instanceof Departement) {
				objs.add ( (Departement) obj);
			}
		}
		
		return objs;
	}

	@Override
	public List<Departement> listerDepartements (String whereClause) throws Exception  {

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Departement.class, whereClause);
		List<Departement> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Departement) {
				objs.add (  (Departement) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public void supprimerDepartement (Departement departement) throws Exception {
		
		  HibernateDao.getCurrentInstance ().delete ( departement);
		
	}

	@Override
	public void modifierDepartement (Departement departement) throws Exception {
		
		  HibernateDao.getCurrentInstance ().update ( departement);
	}

	@Override
	public void creerDepartement (Departement departement) throws Exception  {

		  HibernateDao.getCurrentInstance ().save ( departement);
		
	}

	@Override
	public Departement rechercherDepartement (String whereClause) throws Exception {
		
		return   (Departement) HibernateDao.getCurrentInstance ().find ( Departement.class, whereClause);
	}

	@Override
	public Departement rechercherDepartement (Integer primaryKey) throws Exception  {


		return   (Departement) HibernateDao.getCurrentInstance ().find ( Departement.class, primaryKey);
	}

}
