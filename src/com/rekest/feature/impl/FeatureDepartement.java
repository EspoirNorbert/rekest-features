package com.rekest.feature.impl;

import java.util.ArrayList;
import java.util.List;

import com.rekest.dao.impl.HibernateDao;
import com.rekest.entities.Departement;
import com.rekest.feature.IFeatureDepartement;

public class FeatureDepartement implements IFeatureDepartement {

	private static FeatureDepartement instance = null;
	
	private FeatureDepartement() {}

	public static FeatureDepartement getCurrentInstance () {
		if (instance == null) instance = new FeatureDepartement();
		return instance;
	}
	
	@Override
	public List<Departement> listerDepartements() {

		List<Object> objects = HibernateDao.getCurrentInstance().list( Departement.class);
		List<Departement> objs = new ArrayList<>();
		for (Object obj : objects) {
			if (obj instanceof Departement) {
				objs.add( (Departement) obj);
			}
		}
		
		return objs;
	}

	@Override
	public List<Departement> listerDepartements(String whereClause) {

		List<Object> objects = HibernateDao.getCurrentInstance().list( Departement.class, whereClause);
		List<Departement> objs = new ArrayList<>();
		for (Object obj : objects) {
			if (obj instanceof Departement) {
				objs.add( (Departement) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public boolean supprimerDepartement(Departement departement) {
		
		return  HibernateDao.getCurrentInstance().delete( departement);
		
	}

	@Override
	public boolean modifierDepartement(Departement departement) {
		
		return  HibernateDao.getCurrentInstance().update( departement);
	}

	@Override
	public boolean creerDepartement(Departement departement) {

		return  HibernateDao.getCurrentInstance().save( departement);
		
	}

	@Override
	public Departement rechercherDepartement(String whereClause) {
		
		return  (Departement) HibernateDao.getCurrentInstance().find( Departement.class, whereClause);
	}

	@Override
	public Departement rechercherDepartement(Integer primaryKey) {


		return  (Departement) HibernateDao.getCurrentInstance().find( Departement.class, primaryKey);
	}

}
