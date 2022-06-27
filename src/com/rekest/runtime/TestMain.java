package com.rekest.runtime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rekest.dao.impl.HibernateDao;
import com.rekest.entities.Demande;
import com.rekest.entities.employes.Utilisateur;
import com.rekest.feature.impl.FeatureDepartement;
import com.rekest.feature.impl.FeatureManager;
import com.rekest.feature.impl.FeatureService;
import com.rekest.feature.impl.FeatureUtilisateur;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Logger logger = LogManager.getLogger(HibernateDao.class);
		
		  System.out.println("Bienvenue dans mon application Hibernate 5 !!!");
		  
		  HibernateDao dao = HibernateDao.getCurrentInstance();
			
		  FeatureUtilisateur feature = FeatureUtilisateur.getCurrentInstance();
		  FeatureService features = FeatureService.getCurrentInstance();
		  FeatureDepartement featured = FeatureDepartement.getCurrentInstance();
		  FeatureManager featurem  = FeatureManager.getCurrentInstance();
		  
		  Utilisateur user;
		  Demande demande = new Demande();
		try {
			
			user = feature.rechercherUtilisateur(1);
			
			feature.activerUtilisateur(user);
			System.out.println(user.getNom());
			
			
		  

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		   ;
			
		  HibernateDao.closeSession();
		  System.out.println("Session Hibernate fermée !!!");

		  
		  System.out.println("Bienvenue dans mon application Hibernate 5 !!!");
		  
		  
			
		  


	}

}
