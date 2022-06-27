package com.rekest.feature.impl;

import java.util.ArrayList;
import java.util.List;

import com.rekest.dao.impl.HibernateDao;
import com.rekest.entities.Service;
import com.rekest.feature.IFeatureService;

public class FeatureService implements IFeatureService {

	private static FeatureService instance = null;
	
	private FeatureService () {}

	public static FeatureService getCurrentInstance () {
		if  (instance == null) instance = new FeatureService ();
		return instance;
	}
	
	@Override
	public List<Service> listerServices () throws Exception{

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Service.class);
		List<Service> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Service) {
				objs.add (  (Service) obj);
			}
		}
		
		return objs;
	}

	@Override
	public List<Service> listerServices (String whereClause) throws Exception{

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Service.class, whereClause);
		List<Service> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Service) {
				objs.add (  (Service) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public void supprimerService (Service service) throws Exception{
		
		 HibernateDao.getCurrentInstance ().delete ( service);
		
	}

	@Override
	public void modifierService (Service service) throws Exception {
		
		HibernateDao.getCurrentInstance ().update ( service);
	}

	@Override
	public void creerService (Service service) throws Exception{

		 HibernateDao.getCurrentInstance ().save ( service);
		
	}

	@Override
	public Service rechercherService (String whereClause) throws Exception {
		
		return   (Service) HibernateDao.getCurrentInstance ().find ( Service.class, whereClause);
	}

	@Override
	public Service rechercherService (Integer primaryKey) throws Exception {


		return   (Service) HibernateDao.getCurrentInstance ().find ( Service.class, primaryKey);
	}

}
