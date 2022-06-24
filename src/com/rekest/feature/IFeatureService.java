package com.rekest.feature;

import java.util.List;

import com.rekest.entities.Service;
import com.rekest.dao.impl.HibernateDao;

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
	//public boolean rafraichirService (Service service);



	/**
	 * Return a list of all 'services'.
	 * 
	 * @return
	 */
	public List<Service> listerServices ();

	/**
	 * Return a list of all 'services' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Service> listerServices ( String whereClause) ;
	
	/**
	 * Delete the 'service' set in parameter.
	 * Return true if it succeeded, else false.
	 * 
	 * @param service
	 */
	public boolean supprimerService (Service service);

	/**
	 * Update the 'produit' set in parameter. 
	 * Return true if it succeeded, else false. 
	 * 
	 * @param service
	 */
	public boolean modifierService (Service service);

	/**
	 * Save the 'produit' set in parameter. 
	 * Return true if it succeeded, else false. 
	 * 
	 * @param service
	 */
	public boolean creerService (Service service);
	


	/**
	 * Find and return the 'service' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Service rechercherService( String whereClause) ;

	/**
	 * Find and return the 'service' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Service rechercherService( Integer primaryKey) ;	

	 
	
	
}
