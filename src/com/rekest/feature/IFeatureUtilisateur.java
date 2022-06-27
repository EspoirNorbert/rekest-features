package com.rekest.feature ;

import java.util.List ;

import com.rekest.dao.impl.HibernateDao ;

import com.rekest.entities.employes.Utilisateur ;

import javafx.collections.ObservableList ;

/**
 * @author DELL
 *
 */
/**
 * @author DELL
 *
 */
public interface IFeatureUtilisateur {
	
	/**
	 * @return
	 */
	//public List<Utilisateur> chargerListeUtilisateur () throws Exception;

	
	/**
	 * Enable the user set in parameter.
	 * Return true if it succeeded, else false. 
	 * 
	 * @param utilisateur
	 * @return
	 */
	public void activerUtilisateur  (Utilisateur utilisateur) throws Exception;	
	
	/**
	 * Disable the user set in parameter.
	 * Return true if it succeeded, else false. 
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
	 * Return true if it succeeded, else false.
	 * 
	 * @param utilisateur
	 */
	public void supprimerUtilisateur  (Utilisateur utilisateur) throws Exception;

	/**
	 * Update the 'utilisateur' set in parameter. 
	 * Return true if it succeeded, else false.
	 * 
	 * @param utilisateur
	 */
	public void modifierUtilisateur  (Utilisateur utilisateur) throws Exception;

	/**
	 * Save the 'utilisateur' set in parameter. 
	 * Return true if it succeeded, else false.
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


	 
	
	
}
