package com.rekest.feature;

import java.util.List;

import com.rekest.dao.impl.HibernateDao;

import com.rekest.entities.employes.Utilisateur;

import javafx.collections.ObservableList;

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
	//public List<Utilisateur> chargerListeUtilisateur ();

	
	/**
	 * Enable the user set in parameter.
	 * Return true if it succeeded, else false. 
	 * 
	 * @param utilisateur
	 * @return
	 */
	public boolean activerUtilisateur  (Utilisateur utilisateur);	
	
	/**
	 * Disable the user set in parameter.
	 * Return true if it succeeded, else false. 
	 * 
	 * @param utilisateur
	 * @return
	 */
	public boolean desactiverUtilisateur  (Utilisateur utilisateur);	
	
	/**
	 * 
	 */
	//public boolean rafraichirUtilisateur (Utilisateur utilisateur);


	/**
	 * Return a list of all 'utilisteurs'.
	 * 
	 * @param persons
	 * @return
	 */
	public List<Utilisateur> listerUtilisateurs  ();

	/**
	 * Return a list of all 'utilisteurs' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Utilisateur> listerUtilisateurs  ( String whereClause) ;
	
	/**
	 * 
	 * Delete the 'utilisateur' set in parameter.
	 * Return true if it succeeded, else false.
	 * 
	 * @param utilisateur
	 */
	public boolean supprimerUtilisateur  (Utilisateur utilisateur);

	/**
	 * Update the 'utilisateur' set in parameter. 
	 * Return true if it succeeded, else false.
	 * 
	 * @param utilisateur
	 */
	public boolean modifierUtilisateur  (Utilisateur utilisateur);

	/**
	 * Save the 'utilisateur' set in parameter. 
	 * Return true if it succeeded, else false.
	 * 
	 * @param utilisateur
	 */
	public boolean creerUtilisateur  (Utilisateur utilisateur);


	/**
	 * Find and return the 'utilisateur' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Utilisateur rechercherUtilisateur ( String whereClause) ;

	/**
	 * Find and return the 'utilisateur' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Utilisateur rechercherUtilisateur ( Integer primaryKey) ;	
	
	
	
	/**
	 * TODO
	 * 
	 * @return
	 */
	public String getTheDaoImplementationClassname ();
	
	/**
	 * @return
	 * @throws DAOException 
	 */
	//public ObservableList<Utilisateur> chargerUtilisateurObservableList ();

	/**
	 * @return
	 */
	//public ObservableList<Utilisateur> getCurrentUtilisateurObservableList ();


	 
	
	
}
