package com.rekest.feature;

import java.util.List;

import com.rekest.entities.employes.Manager;

public interface IFeatureManager {

	

	

	/**
	 * TODO
	 * @param service
	 * @return
	 */
	//public boolean rafraichirManager (Manager service);



	/**
	 * Return a list of all 'services'.
	 * 
	 * @return
	 */
	public List<Manager> listerManagers ();

	/**
	 * Return a list of all 'manager' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Manager> listerManagers ( String whereClause) ;
	
	/**
	 * Delete the 'manager' set in parameter.
	 * Return true if it succeeded, else false.
	 * 
	 * @param service
	 */
	public boolean supprimerManager (Manager manager);

	/**
	 * Update the 'manager' set in parameter. 
	 * Return true if it succeeded, else false. 
	 * 
	 * @param service
	 */
	public boolean modifierManager (Manager manager);

	/**
	 * Save the 'manager' set in parameter. 
	 * Return true if it succeeded, else false. 
	 * 
	 * @param service
	 */
	public boolean creerManager (Manager manager);
	


	/**
	 * Find and return the 'manager' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Manager rechercherManager( String whereClause) ;

	/**
	 * Find and return the 'manager' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Manager rechercherManager( Integer primaryKey) ;	

}
