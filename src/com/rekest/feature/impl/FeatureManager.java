package com.rekest.feature.impl;

import java.util.ArrayList;
import java.util.List;

import com.rekest.dao.impl.HibernateDao;

import com.rekest.entities.employes.Manager;
import com.rekest.feature.IFeatureManager;

public class FeatureManager implements IFeatureManager {

	private static FeatureManager instance = null;
	
	private FeatureManager () {}

	public static FeatureManager getCurrentInstance  () {
		if  (instance == null) instance = new FeatureManager ();
		return instance;
	}
	
	@Override
	public List<Manager> listerManagers () {

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Manager.class);
		List<Manager> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Manager) {
				objs.add (  (Manager) obj);
			}
		}
		
		return objs;
	}

	@Override
	public List<Manager> listerManagers (String whereClause) {

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Manager.class, whereClause);
		List<Manager> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Manager) {
				objs.add (  (Manager) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public boolean supprimerManager (Manager manager) {
		
		return  HibernateDao.getCurrentInstance ().delete ( manager);
		
	}

	@Override
	public boolean modifierManager (Manager manager) {
		
		return  HibernateDao.getCurrentInstance ().update ( manager);
	}

	@Override
	public boolean creerManager (Manager manager) {

		return  HibernateDao.getCurrentInstance ().save ( manager);
		
	}

	@Override
	public Manager rechercherManager (String whereClause) {
		
		return   (Manager) HibernateDao.getCurrentInstance ().find ( Manager.class, whereClause);
	}

	@Override
	public Manager rechercherManager (Integer primaryKey) {


		return   (Manager) HibernateDao.getCurrentInstance ().find ( Manager.class, primaryKey);
	}
}
