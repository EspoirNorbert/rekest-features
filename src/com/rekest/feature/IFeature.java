package com.rekest.feature;

import java.util.List;

import com.rekest.entities.Departement;
import com.rekest.entities.Produit;
import com.rekest.entities.Role;
import com.rekest.entities.Service;
import com.rekest.entities.employes.Employe;
import com.rekest.entities.employes.Manager;
import com.rekest.entities.employes.Utilisateur;

public interface IFeature {

	
	
	


	/**
	 * Return a list of all 'services'.
	 * 
	 * @return
	 */
	public List<Service> listerServices () throws Exception;

	/**
	 * Return a list of all 'services' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Service> listerServices ( String whereClause)  throws Exception;
	
	/**
	 * Delete the 'service' set in parameter.
	 * 
	 * 
	 * @param service
	 */
	public void supprimerService (Service service) throws Exception;

	/**
	 * Update the 'service' set in parameter. 
	 * 
	 * 
	 * @param service
	 */
	public void modifierService (Service service) throws Exception;

	/**
	 * Save the 'service' set in parameter. 
	 *  
	 * 
	 * @param service
	 */
	public void creerService (Service service) throws Exception;
	


	/**
	 * Find and return the 'service' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Service rechercherService( String whereClause)  throws Exception;

	/**
	 * Find and return the 'service' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Service rechercherService( Integer primaryKey)  throws Exception;	
	
	
	


	/**
	 * Return a list of all 'departements'.
	 * 
	 * @param 
	 * @return
	 */
	public List<Departement> listerDepartements () throws Exception ;

	/**
	 * 
	 * Return a list of 'departements' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Departement> listerDepartements ( String whereClause) throws Exception ;
	
	/**
	 * Delete the 'departement' set in parameter.
	 * 
	 * 
	 * @param departement
	 */
	public void supprimerDepartement (Departement departement) throws Exception ;

	/**
	 * Update the 'departement' set in parameter.
	 * 
	 * 
	 * @param departement
	 */
	public void modifierDepartement (Departement departement) throws Exception ;

	/**
	 * Save the 'departement' set in parameter.
	 * 
	 * 
	 * @param departement
	 */
	public void creerDepartement (Departement departement) throws Exception ;


	/**
	 * Find the 'departement' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Departement rechercherDepartement ( String whereClause) throws Exception ;

	/**
	 * Find the 'departement' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Departement rechercherDepartement ( Integer primaryKey) throws Exception ;	
	
	

	/**
	 * Return a list of all 'managers'.
	 * 
	 * @return
	 */
	public List<Manager> listerManagers () throws Exception ;

	/**
	 * Return a list of all 'manager' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Manager> listerManagers ( String whereClause)  throws Exception ;
	
	/**
	 * Delete the 'manager' set in parameter. 
	 * 
	 * 
	 * @param service
	 */
	public void supprimerManager (Manager manager) throws Exception ;

	/**
	 * Update the 'manager' set in parameter. 
	 *  
	 * 
	 * @param service
	 */
	public void modifierManager (Manager manager) throws Exception ;

	/**
	 * Save the 'manager' set in parameter. 
	 *  
	 * 
	 * @param service
	 */
	public void creerManager (Manager manager) throws Exception ;
	


	/**
	 * Find and return the 'manager' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Manager rechercherManager( String whereClause)  throws Exception ;

	/**
	 * Find and return the 'manager' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Manager rechercherManager( Integer primaryKey)  throws Exception;
	
	
	
	/**
	 * Enable the user set in parameter.
	 *  
	 * 
	 * @param utilisateur
	 * @return
	 */
	public void activerUtilisateur  (Utilisateur utilisateur) throws Exception;	
	
	/**
	 * Disable the user set in parameter.
	 * 
	 * 
	 * @param utilisateur
	 * @return
	 */
	public void desactiverUtilisateur  (Utilisateur utilisateur) throws Exception;	
	
	/**
	 * 
	 */
	//public void rafraichirUtilisateur (Utilisateur utilisateur) throws Exception;


	/**
	 * Return a list of all 'utilisteurs'.
	 * 
	 * @param persons
	 * @return
	 */
	public List<Utilisateur> listerUtilisateurs  () throws Exception;

	/**
	 * Return a list of all 'utilisteurs' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Utilisateur> listerUtilisateurs  ( String whereClause)  throws Exception;
	
	/**
	 * 
	 * Delete the 'utilisateur' set in parameter.
	 * 
	 * 
	 * @param utilisateur
	 */
	public void supprimerUtilisateur  (Utilisateur utilisateur) throws Exception;

	/**
	 * Update the 'utilisateur' set in parameter. 
	 * 
	 * 
	 * @param utilisateur
	 */
	public void modifierUtilisateur  (Utilisateur utilisateur) throws Exception;

	/**
	 * Save the 'utilisateur' set in parameter. 
	 * 
	 * 
	 * @param utilisateur
	 */
	public void creerUtilisateur  (Utilisateur utilisateur) throws Exception;


	/**
	 * Find and return the 'utilisateur' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Utilisateur rechercherUtilisateur ( String whereClause)  throws Exception;

	/**
	 * Find and return the 'utilisateur' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Utilisateur rechercherUtilisateur ( Integer primaryKey)  throws Exception;	
	
	
	
	/**
	 * TODO
	 * 
	 * @return
	 */
	public String getTheDaoImplementationClassname () throws Exception;
	
	/**
	 * @return
	 * @throws Exception 
	 */
	//public ObservableList<Utilisateur> chargerUtilisateurObservableList () throws Exception;

	/**
	 * @return
	 */
	//public ObservableList<Utilisateur> getCurrentUtilisateurObservableList () throws Exception;


	/**
	 * Return a list of all 'produits'.
	 * 
	 * @param persons
	 * @return
	 */
	public List<Produit> listerProduits  () throws Exception;

	/**
	 * Return a list of all 'produits' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Produit> listerProduits  ( String whereClause)  throws Exception;
	
	/**
	 * Delete the 'produit' set in parameter. 
	 * 
	 *  
	 * @param produit
	 */
	public void supprimerProduit  (Produit produit) throws Exception;

	/**
	 * Update the 'produit' set in parameter. 
	 *  
	 * 
	 * 
	 * @param produit
	 */
	public void modifierProduit  (Produit produit) throws Exception;

	/**
	 * Save the 'produit' set in parameter. 
	 * 
	 * 
	 * @param produit
	 */
	public void creerProduit  (Produit produit) throws Exception;


	/**
	 * Find and return the 'produit' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Produit rechercherProduit ( String whereClause)  throws Exception;

	/**
	 * Find and return the 'produit' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Produit rechercherProduit ( Integer primaryKey)  throws Exception;	

	
	
	

	
	/**
	 * TODO
	 */
	//public void rafraichirRole  (Role role) throws Exception;


	/**
	 * Return a list of all 'roles'.
	 * 
	 * @param persons
	 * @return
	 */
	public List<Role> listerRoles  () throws Exception;

	/**
	 * Return a list of all 'roles' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Role> listerRoles  ( String whereClause)  throws Exception;
	
	/**
	 * Delete the 'role' set in parameter. 
	 * 
	 *  
	 * @param role
	 */
	public void supprimerRole  (Role role) throws Exception;

	/**
	 * Update the 'role' set in parameter. 
	 * 
	 * 
	 * 
	 * @param role
	 */
	public void modifierRole  (Role role) throws Exception;

	/**
	 * Save the 'role' set in parameter. 
	 * 
	 * 
	 * @param role
	 */
	public void creerRole  (Role role) throws Exception;


	/**
	 * Find and return the 'role' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Role rechercherRole ( String whereClause)  throws Exception;

	/**
	 * Find and return the 'role' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Role rechercherRole ( Integer primaryKey)  throws Exception;	



	/**
	 * Return a list of all 'employes'.
	 * 
	 * @param persons
	 * @return
	 */
	public List<Employe> listerEmployes  () throws Exception;

	/**
	 * Return a list of all 'employes' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Employe> listerEmployes  ( String whereClause)  throws Exception;
	
	/**
	 * Delete the 'employe' set in parameter. 
	 * 
	 *  
	 * @param employe
	 */
	public void supprimerEmploye  (Employe employe) throws Exception;

	/**
	 * Update the 'employe' set in parameter. 
	 * 
	 * 
	 * 
	 * @param employe
	 */
	public void modifierEmploye  (Employe employe) throws Exception;

	/**
	 * Save the 'employe' set in parameter. 
	 * 
	 * 
	 * @param employe
	 */
	public void creerEmploye  (Employe employe) throws Exception;


	/**
	 * Find and return the 'employe' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Employe rechercherEmploye ( String whereClause)  throws Exception;

	/**
	 * Find and return the 'employe' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Employe rechercherEmploye ( Integer primaryKey)  throws Exception;	

	 
	
}
