package com.rekest.test;

import java.util.List;

import com.rekest.entities.Demande;
import com.rekest.entities.Departement;
import com.rekest.entities.Note;
import com.rekest.entities.Produit;
import com.rekest.entities.Role;
import com.rekest.entities.Service;
import com.rekest.entities.employes.Employe;
import com.rekest.entities.employes.Manager;
import com.rekest.entities.employes.Utilisateur;

import javafx.collections.ObservableList;

/**
 * @author DELL
 *
 */
public interface IFeatureTests {

	
	
	
	
	
	/**
	 * Test activerUtilisateur and desactiverUtilisateur.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testActiverDesactiverUtilisateur  ()  ;	






	/**
	 * Test testSupprimerDemande.
	 * Returns true if it works, else false.
	 */
	public void  testListerDemandes  ()  ;

	/**
	 * Test testSupprimerDemande.
	 * Returns true if it works, else false.
	 */
	public  void testListerDemandes2  ( )   ;
	
	/**
	 * Test SupprimerDemande.
	 * Returns true if it works, else false.
	 */
	public void testSupprimerDemande  ()  ;

	/**
	 * Test ModifierDemande.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testModifierDemande  ()  ;

	/**
	 * Test CreerDemande .
	 * Returns true if it works, else false.

	 */
	public void testCreerDemande  ()  ;


	/**
	 * Test RechercherDemande.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testRechercherDemande ( )   ;


	
	/**
	 * Test RechercherDemandeId.
	 * Returns true if it works, else false.
	 * 
	 * 
	 */
	public void testRechercherDemandeId ( )   ;	


	/**
	 * Test testSupprimerService.
	 * Returns true if it works, else false.
	 */
	public void  testListerServices  ()  ;

	/**
	 * Test testSupprimerService.
	 * Returns true if it works, else false.
	 */
	public  void testListerServices2  ( )   ;
	
	/**
	 * Test SupprimerService.
	 * Returns true if it works, else false.
	 */
	public void testSupprimerService  ()  ;

	/**
	 * Test ModifierService.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testModifierService  ()  ;

	/**
	 * Test CreerService .
	 * Returns true if it works, else false.

	 */
	public void testCreerService  ()  ;


	/**
	 * Test RechercherService.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testRechercherService ( )   ;


	
	/**
	 * Test RechercherServiceId.
	 * Returns true if it works, else false.
	 * 
	 * 
	 */
	public void testRechercherServiceId ( )   ;	


	/**
	 * Test testSupprimerDepartement.
	 * Returns true if it works, else false.
	 */
	public void  testListerDepartements  ()  ;

	/**
	 * Test testSupprimerDepartement.
	 * Returns true if it works, else false.
	 */
	public  void testListerDepartements2  ( )   ;
	
	/**
	 * Test SupprimerDepartement.
	 * Returns true if it works, else false.
	 */
	public void testSupprimerDepartement  ()  ;

	/**
	 * Test ModifierDepartement.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testModifierDepartement  ()  ;

	/**
	 * Test CreerDepartement .
	 * Returns true if it works, else false.

	 */
	public void testCreerDepartement  ()  ;


	/**
	 * Test RechercherDepartement.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testRechercherDepartement ( )   ;


	
	/**
	 * Test RechercherDepartementId.
	 * Returns true if it works, else false.
	 * 
	 * 
	 */
	public void testRechercherDepartementId ( )   ;	


	/**
	 * Test testSupprimerNote.
	 * Returns true if it works, else false.
	 */
	public void  testListerNotes  ()  ;

	/**
	 * Test testSupprimerNote.
	 * Returns true if it works, else false.
	 */
	public  void testListerNotes2  ( )   ;
	
	/**
	 * Test SupprimerNote.
	 * Returns true if it works, else false.
	 */
	public void testSupprimerNote  ()  ;

	/**
	 * Test ModifierNote.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testModifierNote  ()  ;

	/**
	 * Test CreerNote .
	 * Returns true if it works, else false.

	 */
	public void testCreerNote  ()  ;


	/**
	 * Test RechercherNote.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testRechercherNote ( )   ;


	
	/**
	 * Test RechercherNoteId.
	 * Returns true if it works, else false.
	 * 
	 * 
	 */
	public void testRechercherNoteId ( )   ;	


	/**
	 * Test testSupprimerRole.
	 * Returns true if it works, else false.
	 */
	public void  testListerRoles  ()  ;

	/**
	 * Test testSupprimerRole.
	 * Returns true if it works, else false.
	 */
	public  void testListerRoles2  ( )   ;
	
	/**
	 * Test SupprimerRole.
	 * Returns true if it works, else false.
	 */
	public void testSupprimerRole  ()  ;

	/**
	 * Test ModifierRole.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testModifierRole  ()  ;

	/**
	 * Test CreerRole .
	 * Returns true if it works, else false.

	 */
	public void testCreerRole  ()  ;


	/**
	 * Test RechercherRole.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testRechercherRole ( )   ;


	
	/**
	 * Test RechercherRoleId.
	 * Returns true if it works, else false.
	 * 
	 * 
	 */
	public void testRechercherRoleId ( )   ;	


	/**
	 * Test testSupprimerManager.
	 * Returns true if it works, else false.
	 */
	public void  testListerManagers  ()  ;

	/**
	 * Test testSupprimerManager.
	 * Returns true if it works, else false.
	 */
	public  void testListerManagers2  ( )   ;
	
	/**
	 * Test SupprimerManager.
	 * Returns true if it works, else false.
	 */
	public void testSupprimerManager  ()  ;

	/**
	 * Test ModifierManager.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testModifierManager  ()  ;

	/**
	 * Test CreerManager .
	 * Returns true if it works, else false.

	 */
	public void testCreerManager  ()  ;


	/**
	 * Test RechercherManager.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testRechercherManager ( )   ;


	
	/**
	 * Test RechercherManagerId.
	 * Returns true if it works, else false.
	 * 
	 * 
	 */
	public void testRechercherManagerId ( )   ;	


	/**
	 * Test testSupprimerEmploye.
	 * Returns true if it works, else false.
	 */
	public void  testListerEmployes  ()  ;

	/**
	 * Test testSupprimerEmploye.
	 * Returns true if it works, else false.
	 */
	public  void testListerEmployes2  ( )   ;
	
	/**
	 * Test SupprimerEmploye.
	 * Returns true if it works, else false.
	 */
	public void testSupprimerEmploye  ()  ;

	/**
	 * Test ModifierEmploye.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testModifierEmploye  ()  ;

	/**
	 * Test CreerEmploye .
	 * Returns true if it works, else false.

	 */
	public void testCreerEmploye  ()  ;


	/**
	 * Test RechercherEmployeId.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testRechercherEmploye ( )   ;


	
	/**
	 * Test RechercherEmploye.
	 * Returns true if it works, else false.
	 * 
	 * 
	 */
	public void testRechercherEmployeId ( )   ;	


	/**
	 * Test testSupprimerUtilisateur.
	 * Returns true if it works, else false.
	 */
	public void  testListerUtilisateurs  ()  ;

	/**
	 * Test testSupprimerUtilisateur.
	 * Returns true if it works, else false.
	 */
	public  void testListerUtilisateurs2  ( )   ;
	
	/**
	 * Test SupprimerUtilisateur.
	 * Returns true if it works, else false.
	 */
	public void testSupprimerUtilisateur  ()  ;

	/**
	 * Test ModifierUtilisateur.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testModifierUtilisateur  ()  ;

	/**
	 * Test CreerUtilisateur .
	 * Returns true if it works, else false.

	 */
	public void testCreerUtilisateur  ()  ;


	/**
	 * Test RechercherUtilisateur.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testRechercherUtilisateur ( )   ;


	
	/**
	 * Test RechercherUtilisateurId.
	 * Returns true if it works, else false.
	 * 
	 * 
	 */
	public void testRechercherUtilisateurId ( )   ;	


	/**
	 * Test testSupprimerProduit.
	 * Returns true if it works, else false.
	 */
	public void  testListerProduits  ()  ;

	/**
	 * Test testSupprimerProduit.
	 * Returns true if it works, else false.
	 */
	public  void testListerProduits2  ( )   ;
	
	/**
	 * Test SupprimerProduit.
	 * Returns true if it works, else false.
	 */
	public void testSupprimerProduit  ()  ;

	/**
	 * Test ModifierProduit.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testModifierProduit  ()  ;

	/**
	 * Test CreerProduit .
	 * Returns true if it works, else false.

	 */
	public void testCreerProduit  ()  ;


	/**
	 * Test RechercherProduitId.
	 * Returns true if it works, else false.
	 * 
	 */
	public void testRechercherProduit ( )   ;


	
	/**
	 * Test RechercherProduitId.
	 * Returns true if it works, else false.
	 * 
	 * 
	 */
	public void testRechercherProduitId ( )   ;	

	



	/**
	 * Test LoadProduitsObservableList.
	 * Returns true if it works, else false.
	 */
	public void testLoadProduitsObservableList ()  ;



	/**
	 * Test LoadDemandesObservableList.
	 * Returns true if it works, else false.
	 */
	public void testLoadDemandesObservableList ()  ;



	/**
	 * Test LoadEmployesObservableList.
	 * Returns true if it works, else false.
	 */
	public void testLoadEmployesObservableList ()  ;


	/**
	 * Test LoadUtilisateursObservableList.
	 * Returns true if it works, else false.
	 */
	public void testLoadUtilisateursObservableList ()  ;


	/**
	 * Test LoadManagersObservableList.
	 * Returns true if it works, else false.
	 */
	public void testLoadManagersObservableList ()  ;


	/**
	 * Test LoadNotesObservableList.
	 * Returns true if it works, else false.
	 */
	public void testLoadNotesObservableList ()  ;



	/**
	 * Test LoadRolesObservableList.
	 * Returns true if it works, else false.
	 */
	public void testLoadRolesObservableList ()  ;


	/**
	 * Test LoadServicesObservableList.
	 * Returns true if it works, else false.
	 */
	public void testLoadServicesObservableList ()  ;


	/**
	 * Test LoadDepartementsObservableList.
	 * Returns true if it works, else false.
	 */
	public void testLoadDepartementsObservableList ()  ;


	
	 
	/**
	 * Test loadDemandesByServiceObservableList.
	 * Returns true if it works, else false.
	 *
	 */
	public void loadDemandesByServiceObservableList ()  ;



	 
	/**

	 * Test LoadDemandesByDirectionObservableList.
	 * Returns true if it works, else false.
	 */
	public void testLoadDemandesByDirectionObservableList ()  ;




	/**
	 * Test validerIdentifiants.
	 * Returns true if it works, else false.
	 */
	public  void testValiderIdentifiants()  ;
	
	/**
	 * Test repondreDemande.
	 * Returns true if it works, else false. 
	 */
	public void testRepondreDemande()  ; 
	
	
	/**
	 * Test associerService.
	 * Returns true if it works, else false.
	 */
	public void testAssocierService()  ;
	
	
	
}
