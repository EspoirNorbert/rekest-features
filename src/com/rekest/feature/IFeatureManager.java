package com.rekest.feature ;

import java.util.List ;

import com.rekest.entities.employes.Manager ;
public interface IFeatureManager {

	

	

	/**
	 * TODO
	 * @param manager
	 * @return
	 */
	//public void rafraichirManager (Manager manager) throws Exception 



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
	 * Return true if it succeeded, else false.
	 * 
	 * @param service
	 */
	public void supprimerManager (Manager manager) throws Exception ;

	/**
	 * Update the 'manager' set in parameter. 
	 * Return true if it succeeded, else false. 
	 * 
	 * @param service
	 */
	public void modifierManager (Manager manager) throws Exception ;

	/**
	 * Save the 'manager' set in parameter. 
	 * Return true if it succeeded, else false. 
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

}
