package com.rekest.feature;

import java.util.List;

<<<<<<< HEAD

=======
>>>>>>> 525d8a4180204715af19c3f6fc7bbe6d65793e7b
import com.rekest.entities.Demande;
import com.rekest.entities.Departement;
import com.rekest.entities.Note;
import com.rekest.entities.Produit;
import com.rekest.entities.Role;
import com.rekest.entities.Service;
import com.rekest.entities.employes.Employe;
import com.rekest.entities.employes.Manager;
import com.rekest.entities.employes.Utilisateur;
import com.rekest.exeptions.DAOException;

import javafx.collections.ObservableList;
import javafx.stage.Stage;

public interface IFeature {

	
	
	
	
	public void createEmptyAdressBook();

	/**
	 * @param primaryStage
	 */
	public void selectAnAddressBookToLoad(Stage primaryStage);

	/**
	 * @return
	 */
	public boolean saveCurrentOpenedDemandeFile();

	/**
	 * @param primaryStage
	 */
	public void selectDemandeFileToSaveAs(Stage primaryStage);

	
	public void setDemandeList(List<Demande> demandes) throws DAOException ;


	/**
	 * Return a list of all 'services'.
	 * 
	 * @return
	 */
	public List<Service> listerServices () throws DAOException;

	/**
	 * Return a list of all 'services' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Service> listerServices ( String whereClause)  throws DAOException;
	
	/**
	 * Delete the 'service' set in parameter.
	 * 
	 * 
	 * @param service
	 */
	public void supprimerService (Service service) throws DAOException;

	/**
	 * Update the 'service' set in parameter. 
	 * 
	 * 
	 * @param service
	 */
	public void modifierService (Service service) throws DAOException;

	/**
	 * Save the 'service' set in parameter. 
	 *  
	 * 
	 * @param service
	 */
	public void creerService (Service service) throws DAOException;
	


	/**
	 * Find and return the 'service' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Service rechercherService( String whereClause)  throws DAOException;

	/**
	 * Find and return the 'service' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Service rechercherService( Integer primaryKey)  throws DAOException;	
	
	
	


	/**
	 * Return a list of all 'departements'.
	 * 
	 * @param 
	 * @return
	 */
	public List<Departement> listerDepartements () throws DAOException ;

	/**
	 * 
	 * Return a list of 'departements' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Departement> listerDepartements ( String whereClause) throws DAOException ;
	
	/**
	 * Delete the 'departement' set in parameter.
	 * 
	 * 
	 * @param departement
	 */
	public void supprimerDepartement (Departement departement) throws DAOException ;

	/**
	 * Update the 'departement' set in parameter.
	 * 
	 * 
	 * @param departement
	 */
	public void modifierDepartement (Departement departement) throws DAOException ;

	/**
	 * Save the 'departement' set in parameter.
	 * 
	 * 
	 * @param departement
	 */
	public void creerDepartement (Departement departement) throws DAOException ;


	/**
	 * Find the 'departement' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Departement rechercherDepartement ( String whereClause) throws DAOException ;

	/**
	 * Find the 'departement' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Departement rechercherDepartement ( Integer primaryKey) throws DAOException ;	
	
	

	/**
	 * Return a list of all 'managers'.
	 * 
	 * @return
	 */
	public List<Manager> listerManagers () throws DAOException ;

	/**
	 * Return a list of all 'manager' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Manager> listerManagers ( String whereClause)  throws DAOException ;
	
	/**
	 * Delete the 'manager' set in parameter. 
	 * 
	 * 
	 * @param service
	 */
	public void supprimerManager (Manager manager) throws DAOException ;

	/**
	 * Update the 'manager' set in parameter. 
	 *  
	 * 
	 * @param service
	 */
	public void modifierManager (Manager manager) throws DAOException ;

	/**
	 * Save the 'manager' set in parameter. 
	 *  
	 * 
	 * @param service
	 */
	public void creerManager (Manager manager) throws DAOException ;
	


	/**
	 * Find and return the 'manager' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Manager rechercherManager( String whereClause)  throws DAOException ;

	/**
	 * Find and return the 'manager' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Manager rechercherManager( Integer primaryKey)  throws DAOException;
	
	
	
	/**
	 * Enable the user set in parameter.
	 *  
	 * 
	 * @param utilisateur
	 * @return
	 */
	public void activerUtilisateur  (Utilisateur utilisateur) throws DAOException;	
	
	/**
	 * Disable the user set in parameter.
	 * 
	 * 
	 * @param utilisateur
	 * @return
	 */
	public void desactiverUtilisateur  (Utilisateur utilisateur) throws DAOException;	
	
	/**
	 * 
	 */
	//public void rafraichirUtilisateur (Utilisateur utilisateur) throws DAOException;


	/**
	 * Return a list of all 'utilisteurs'.
	 * 
	 * @param persons
	 * @return
	 */
	public List<Utilisateur> listerUtilisateurs  () throws DAOException;

	/**
	 * Return a list of all 'utilisteurs' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Utilisateur> listerUtilisateurs  ( String whereClause)  throws DAOException;
	
	/**
	 * 
	 * Delete the 'utilisateur' set in parameter.
	 * 
	 * 
	 * @param utilisateur
	 */
	public void supprimerUtilisateur  (Utilisateur utilisateur) throws DAOException;

	/**
	 * Update the 'utilisateur' set in parameter. 
	 * 
	 * 
	 * @param utilisateur
	 */
	public void modifierUtilisateur  (Utilisateur utilisateur) throws DAOException;

	/**
	 * Save the 'utilisateur' set in parameter. 
	 * 
	 * 
	 * @param utilisateur
	 */
	public void creerUtilisateur  (Utilisateur utilisateur) throws DAOException;


	/**
	 * Find and return the 'utilisateur' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Utilisateur rechercherUtilisateur ( String whereClause)  throws DAOException;

	/**
	 * Find and return the 'utilisateur' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Utilisateur rechercherUtilisateur ( Integer primaryKey)  throws DAOException;	
	
	
	
	/**
	 * TODO
	 * 
	 * @return
	 */
	public String getTheDaoImplementationClassname () throws DAOException;
	
	/**
	 * @return
	 * @throws DAOException 
	 */
	//public ObservableList<Utilisateur> chargerUtilisateurObservableList () throws DAOException;

	/**
	 * @return
	 */
	//public ObservableList<Utilisateur> getCurrentUtilisateurObservableList () throws DAOException;


	/**
	 * Return a list of all 'produits'.
	 * 
	 * @param persons
	 * @return
	 */
	public List<Produit> listerProduits  () throws DAOException;

	/**
	 * Return a list of all 'produits' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Produit> listerProduits  ( String whereClause)  throws DAOException;
	
	/**
	 * Delete the 'produit' set in parameter. 
	 * 
	 *  
	 * @param produit
	 */
	public void supprimerProduit  (Produit produit) throws DAOException;

	/**
	 * Update the 'produit' set in parameter. 
	 *  
	 * 
	 * 
	 * @param produit
	 */
	public void modifierProduit  (Produit produit) throws DAOException;

	/**
	 * Save the 'produit' set in parameter. 
	 * 
	 * 
	 * @param produit
	 */
	public void creerProduit  (Produit produit) throws DAOException;


	/**
	 * Find and return the 'produit' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Produit rechercherProduit ( String whereClause)  throws DAOException;

	/**
	 * Find and return the 'produit' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Produit rechercherProduit ( Integer primaryKey)  throws DAOException;	

	
	
	

	
	/**
	 * TODO
	 */
	//public void rafraichirRole  (Role role) throws DAOException;


	/**
	 * Return a list of all 'roles'.
	 * 
	 * @param persons
	 * @return
	 */
	public List<Role> listerRoles  () throws DAOException;

	/**
	 * Return a list of all 'roles' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Role> listerRoles  ( String whereClause)  throws DAOException;
	
	/**
	 * Delete the 'role' set in parameter. 
	 * 
	 *  
	 * @param role
	 */
	public void supprimerRole  (Role role) throws DAOException;

	/**
	 * Update the 'role' set in parameter. 
	 * 
	 * 
	 * 
	 * @param role
	 */
	public void modifierRole  (Role role) throws DAOException;

	/**
	 * Save the 'role' set in parameter. 
	 * 
	 * 
	 * @param role
	 */
	public void creerRole  (Role role) throws DAOException;


	/**
	 * Find and return the 'role' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Role rechercherRole ( String whereClause)  throws DAOException;

	/**
	 * Find and return the 'role' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Role rechercherRole ( Integer primaryKey)  throws DAOException;	



	/**
	 * Return a list of all 'employes'.
	 * 
	 * @param persons
	 * @return
	 */
	public List<Employe> listerEmployes  () throws DAOException;

	/**
	 * Return a list of all 'employes' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Employe> listerEmployes  ( String whereClause)  throws DAOException;
	
	/**
	 * Delete the 'employe' set in parameter. 
	 * 
	 *  
	 * @param employe
	 */
	public void supprimerEmploye  (Employe employe) throws DAOException;

	/**
	 * Update the 'employe' set in parameter. 
	 * 
	 * 
	 * 
	 * @param employe
	 */
	public void modifierEmploye  (Employe employe) throws DAOException;

	/**
	 * Save the 'employe' set in parameter. 
	 * 
	 * 
	 * @param employe
	 */
	public void creerEmploye  (Employe employe) throws DAOException;


	/**
	 * Find and return the 'employe' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Employe rechercherEmploye ( String whereClause)  throws DAOException;

	/**
	 * Find and return the 'employe' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
<<<<<<< HEAD
	public Employe rechercherEmploye ( Integer primaryKey)  throws DAOException;	
	
	
=======
	public Employe rechercherEmploye ( Integer primaryKey)  throws Exception;	
	
	
	/**
	 * TODO
	 * @param Demande
	 * @return
	 */
	//public void rafraichirDemande (Demande Demande) throws Exception 


>>>>>>> 525d8a4180204715af19c3f6fc7bbe6d65793e7b

	/**
	 * Return a list of all 'Demandes'.
	 * 
	 * @return
	 */
<<<<<<< HEAD
	public List<Demande> listerDemandes () throws DAOException ;
=======
	public List<Demande> listerDemandes () throws Exception ;
>>>>>>> 525d8a4180204715af19c3f6fc7bbe6d65793e7b

	/**
	 * Return a list of all 'Demande' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
<<<<<<< HEAD
	public List<Demande> listerDemandes ( String whereClause)  throws DAOException ;
=======
	public List<Demande> listerDemandes ( String whereClause)  throws Exception ;
>>>>>>> 525d8a4180204715af19c3f6fc7bbe6d65793e7b
	
	/**
	 * Delete the 'Demande' set in parameter. 
	 * Return true if it succeeded, else false.
	 * 
	 * @param service
	 */
<<<<<<< HEAD
	public void supprimerDemande (Demande Demande) throws DAOException ;
=======
	public void supprimerDemande (Demande Demande) throws Exception ;
>>>>>>> 525d8a4180204715af19c3f6fc7bbe6d65793e7b

	/**
	 * Update the 'Demande' set in parameter. 
	 * Return true if it succeeded, else false. 
	 * 
	 * @param service
	 */
<<<<<<< HEAD
	public void modifierDemande (Demande Demande) throws DAOException ;
=======
	public void modifierDemande (Demande Demande) throws Exception ;
>>>>>>> 525d8a4180204715af19c3f6fc7bbe6d65793e7b

	/**
	 * Save the 'Demande' set in parameter. 
	 * Return true if it succeeded, else false. 
	 * 
	 * @param service
	 */
<<<<<<< HEAD
	public void creerDemande (Demande Demande) throws DAOException ;
=======
	public void creerDemande (Demande Demande) throws Exception ;
>>>>>>> 525d8a4180204715af19c3f6fc7bbe6d65793e7b
	


	/**
	 * Find and return the 'Demande' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
<<<<<<< HEAD
	public Demande rechercherDemande( String whereClause)  throws DAOException ;
=======
	public Demande rechercherDemande( String whereClause)  throws Exception ;
>>>>>>> 525d8a4180204715af19c3f6fc7bbe6d65793e7b

	/**
	 * Find and return the 'Demande' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
<<<<<<< HEAD
	public Demande rechercherDemande( Integer primaryKey)  throws DAOException;
=======
	public Demande rechercherDemande( Integer primaryKey)  throws Exception;
>>>>>>> 525d8a4180204715af19c3f6fc7bbe6d65793e7b
	
	
	/**
	 * TODO
	 * @param note
	 * @return
	 */
	

	/**
	 * Return a list of all 'notes'.
	 * 
	 * @return
	 */
<<<<<<< HEAD
	public List<Note> listerNotes () throws DAOException ;
=======
	public List<Note> listerNotes () throws Exception ;
>>>>>>> 525d8a4180204715af19c3f6fc7bbe6d65793e7b

	/**
	 * Return a list of all 'note' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
<<<<<<< HEAD
	public List<Note> listerNotes ( String whereClause)  throws DAOException ;
=======
	public List<Note> listerNotes ( String whereClause)  throws Exception ;
>>>>>>> 525d8a4180204715af19c3f6fc7bbe6d65793e7b
	
	/**
	 * Delete the 'note' set in parameter. 
	 * Return true if it succeeded, else false.
	 * 
	 * @param service
	 */
<<<<<<< HEAD
	public void supprimerNote (Note note) throws DAOException ;
=======
	public void supprimerNote (Note note) throws Exception ;
>>>>>>> 525d8a4180204715af19c3f6fc7bbe6d65793e7b

	/**
	 * Update the 'note' set in parameter. 
	 * Return true if it succeeded, else false. 
	 * 
	 * @param service
	 */
<<<<<<< HEAD
	public void modifierNote (Note note) throws DAOException ;
=======
	public void modifierNote (Note note) throws Exception ;
>>>>>>> 525d8a4180204715af19c3f6fc7bbe6d65793e7b

	/**
	 * Save the 'note' set in parameter. 
	 * Return true if it succeeded, else false. 
	 * 
	 * @param service
	 */
<<<<<<< HEAD
	public void creerNote (Note note) throws DAOException ;
=======
	public void creerNote (Note note) throws Exception ;
>>>>>>> 525d8a4180204715af19c3f6fc7bbe6d65793e7b
	


	/**
	 * Find and return the 'manager' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
<<<<<<< HEAD
	public Note rechercherNote( String whereClause)  throws DAOException ;
=======
	public Note rechercherNote( String whereClause)  throws Exception ;
>>>>>>> 525d8a4180204715af19c3f6fc7bbe6d65793e7b

	/**
	 * Find and return the 'note' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
<<<<<<< HEAD
	public Note rechercherNote( Integer primaryKey)  throws DAOException;
	
	/**
	 * @return
	 */
	public Integer RetournerNombreDemandesTotal ();
	
	/**
	 * @return
	 */
	public Integer RetournerNombreEmployesTotal ();
	
	/**
	 * @return
	 */
	public Integer RetournerNombreDepartementsTotal ();
	
	/**
	 * @return
	 */
	public Integer RetournerNombreServicesTotal ();
	
	/**
	 * @return
	 */
	public Integer RetournerNombreProduitsTotal();
	

	public ObservableList<Demande> loadDemandesObservableList () throws DAOException;


	public ObservableList<Demande> getCurrentDemandesObservableList () throws DAOException;
	
	
	public ObservableList<Employe> loadEmployesObservableList () throws DAOException;


	public ObservableList<Employe> getCurrentEmployesObservableList () throws DAOException;


	public ObservableList<Role> loadRoleObservableList () throws DAOException;


	public ObservableList<Role> getCurrentRolesObservableList () throws DAOException;


	public ObservableList<Produit> loadProduitsObservableList () throws DAOException;


	public ObservableList<Produit> getCurrentProduitsObservableList () throws DAOException;


	public ObservableList<Service> loadServicesObservableList () throws DAOException;


	public ObservableList<Service> getCurrentServicesObservableList () throws DAOException;


	public ObservableList<Departement> loadDepartementsObservableList () throws DAOException;


	public ObservableList<Departement> getCurrentDepartementsObservableList () throws DAOException;

	
	 
	/**
	 * @return
	 */
	public ObservableList<Demande> loadDemandesByServiceObservableList (Service service) throws DAOException;

	/**
	 * @return
	 */
	public ObservableList<Demande> getCurrentDemandesByServiceObservableList () throws DAOException;
=======
	public Note rechercherNote( Integer primaryKey)  throws Exception;
>>>>>>> 525d8a4180204715af19c3f6fc7bbe6d65793e7b

	 
	/**
	 * @return
	 */
	public ObservableList<Demande> loadDemandesByDirectionObservableList (Object direction) throws DAOException;




	/**
	 * Retourne l'utilisateur identifié, sinon null
	 * 
	 * @param login
	 * @param password
	 * @return
	 * @throws DAOException
	 */
	public  Object validerIdentifiants(String login, String password) throws DAOException;
	
	/**
	 * Method qui permet de definir la reponse de la demande (rejeter , cloturÃ©e ...)
	 *
	 * @param demande
	 * @param reponse
	 * @throws DAOException
	 */
	public void repondreDemande(Demande demande, String reponse) throws DAOException; 
	
}
