package com.rekest.runtime;


import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rekest.dao.impl.HibernateDao;
import com.rekest.entities.Departement;
import com.rekest.entities.Produit;
import com.rekest.entities.Role;
import com.rekest.entities.Service;
import com.rekest.entities.employes.Employe;
import com.rekest.entities.employes.Manager;
import com.rekest.entities.employes.Utilisateur;
import com.rekest.feature.impl.Feature;
import com.rekest.utils.ErrorLogFileManager;
import com.rekest.utils.FileDemandeManager;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Logger logger = LogManager.getLogger(HibernateDao.class);
		
		  System.out.println("Bienvenue dans mon application Hibernate 5 !!!");
		  
		  
		  Feature feat = Feature.getCurrentInstance();
		  
		  
		  
		  try {
			
			  
			  
			  FileDemandeManager.newCell(new File("Javatpoint.xls"));;

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Blem "+e.getMessage());
		}


		  
		  HibernateDao.closeSession();
		  System.out.println("Session Hibernate fermée !!!");

		  
		  System.out.println("Bienvenue dans mon application Hibernate 5 !!!");
		  
		  
			
		  


	}


}
