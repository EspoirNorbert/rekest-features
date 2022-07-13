package com.rekest.runtime;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rekest.dao.impl.HibernateDao;
import com.rekest.entities.Demande;
import com.rekest.entities.Departement;
import com.rekest.entities.Produit;
import com.rekest.entities.Role;
import com.rekest.entities.Service;
import com.rekest.entities.employes.Employe;
import com.rekest.entities.employes.Manager;
import com.rekest.entities.employes.Utilisateur;
import com.rekest.exeptions.DAOException;
import com.rekest.feature.impl.Feature;
import com.rekest.utils.FileDemandeManager;

import javafx.collections.ObservableList;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Logger logger = LogManager.getLogger(HibernateDao.class);
		
		  System.out.println("Bienvenue dans mon application Hibernate 5 !!!");
		  
		  HibernateDao dao = HibernateDao.getCurrentInstance();
		  
		  Feature feat = Feature.getCurrentInstance();
		  
		  
		  
		  try {

			  
			ObservableList<Demande> employes =  feat.loadDemandesObservableList();
			File file = new File("C:\\Users\\DELL\\Desktop\\test.xml");
			
			FileDemandeManager manaf= new FileDemandeManager();
			
			manaf.saveDemandeDataToFile(file);
			

			
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			System.err.println("Blem "+e.getMessage());
		}


		  
		  HibernateDao.closeSession();
		  System.out.println("Session Hibernate fermée !!!");

		  
		  System.out.println("Bienvenue dans mon application Hibernate 5 !!!");
		  
		  
			
		  


	}
	
	
	private static void testUser(Feature feat) {
		
		Utilisateur user = new Utilisateur("nomtest","prenomTest", "loginTest", "pastest");
		
		
		try {
			feat.creerUtilisateur(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			feat.desactiverUtilisateur(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Utilisateur user1 = new Utilisateur();
		
		try {
			 user1 = feat.rechercherUtilisateur("WHERE login = 'loginTest' ");
			System.out.println("User "+user1.getNom()+" found, enabled:"+user1.isEnable());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		user1.setLogin("changedLogin");
		
		try {
			feat.modifierUtilisateur(user1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 user1 = feat.rechercherUtilisateur("WHERE nom = 'nomtest' ");
			System.out.println("User "+user1.getLogin()+" found, enabled:"+user1.isEnable());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			feat.supprimerUtilisateur(user1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	
	private static void testManager(Feature feat) {
		
		Manager user = new Manager("nomtest","prenomTest", "loginTest", "pastest");
		
		
		try {
			feat.creerManager(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		Manager user1 = new Manager();
		
		try {
			 user1 = feat.rechercherManager("WHERE login = 'loginTest' ");
			System.out.println("User "+user1.getNom()+" found, enabled:"+user1.isEnable());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		user1.setLogin("changedLogin");
		
		try {
			feat.modifierManager(user1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 user1 = feat.rechercherManager("WHERE nom = 'nomtest' ");
			System.out.println("User "+user1.getLogin()+" found, enabled:"+user1.isEnable());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			feat.supprimerManager(user1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void testEmploye(Feature feat) {
		
		Employe user = new Employe("nomtest","prenomTest");
		
		
		try {
			feat.creerEmploye(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		Employe user1 = new Employe();
		
		try {
			 user1 = feat.rechercherEmploye("WHERE nom = 'nomtest' ");
			System.out.println("User "+user1.getNom());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		user1.setPrenom("changedPrenom");
		
		try {
			feat.modifierEmploye(user1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			 user1 = feat.rechercherEmploye("WHERE nom = 'nomtest' ");
			System.out.println("User "+user1.getPrenom());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			feat.supprimerEmploye(user1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	
	private static void testRole(Feature feat) {
		
		Role role = new Role("intituleTest");
		
		
		try {
			feat.creerRole(role);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		Role role1 = new Role();
		
		try {
			role1 = feat.rechercherRole("WHERE nom = 'intituleTest' ");
			System.out.println("Role "+role1.getIntitule()+" found");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		role1.setIntitule("changedIntitule");
		
		try {
			feat.modifierRole(role1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			role1 = feat.rechercherRole("WHERE nom = 'changedIntitule' ");
			System.out.println("Role "+role1.getIntitule());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			feat.supprimerRole(role1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	
	private static void testService(Feature feat) {
		
		Service service = new Service("intituleTest");
		
		
		try {
			feat.creerService(service);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		Service service1 = new Service();
		
		try {
			service1 = feat.rechercherService("WHERE nom = 'intituleTest' ");
			System.out.println("Service "+service1.getNom()+" found");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		service1.setNom("changedIntitule");
		
		try {
			feat.modifierService(service1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			service1 = feat.rechercherService("WHERE nom = 'changedIntitule' ");
			System.out.println("Service "+service1.getNom());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			feat.supprimerService(service1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	
	
	private static void testProduit(Feature feat) {
		
		Produit produit = new Produit("intituleTest");
		
		
		try {
			feat.creerProduit(produit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		Produit produit1 = new Produit();
		
		try {
			produit1 = feat.rechercherProduit("WHERE nom = 'intituleTest' ");
			System.out.println("Produit "+produit1.getNom()+" found");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		produit1.setNom("changedIntitule");
		
		try {
			feat.modifierProduit(produit1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			produit1 = feat.rechercherProduit("WHERE nom = 'changedIntitule' ");
			System.out.println("Produit "+produit1.getNom());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			feat.supprimerProduit(produit1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	
	
	private static void testDepartement(Feature feat) {
		
		Departement departement = new Departement("intituleTest");
		
		
		try {
			feat.creerDepartement(departement);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		Departement departement1 = new Departement();
		
		try {
			departement1 = feat.rechercherDepartement("WHERE nom = 'intituleTest' ");
			System.out.println("Departement "+departement1.getNom()+" found");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		departement1.setNom("changedIntitule");
		
		try {
			feat.modifierDepartement(departement1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			departement1 = feat.rechercherDepartement("WHERE nom = 'changedIntitule' ");
			System.out.println("Departement "+departement1.getNom());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			feat.supprimerDepartement(departement1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
