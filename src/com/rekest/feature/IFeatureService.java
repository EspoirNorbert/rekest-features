package com.rekest.feature;

import java.util.List ;

import com.rekest.entities.Service ;
import com.rekest.dao.impl.HibernateDao ;

/**
 * @author DELL
 *
 */
/**
 * @author DELL
 *
 */
public interface IFeatureService {
	

	

	/**
	 * TODO
	 * @param service
	 * @return
	 */
	//public void rafraichirService (Service service) throws Exception;



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
	 * Return true if it succeeded, else false.
	 * 
	 * @param service
	 */
	public void supprimerService (Service service) throws Exception;

	/**
	 * Update the 'service' set in parameter. 
	 * Return true if it succeeded, else false. 
	 * 
	 * @param service
	 */
	public void modifierService (Service service) throws Exception;

	/**
	 * Save the 'service' set in parameter. 
	 * Return true if it succeeded, else false. 
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

	 
	
	
}
