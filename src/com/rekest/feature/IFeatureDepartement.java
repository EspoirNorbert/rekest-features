package com.rekest.feature;

import java.util.List;

import com.rekest.entities.Departement;
import com.rekest.dao.impl.HibernateDao;

/**
 * @author DELL
 *
 */
/**
 * @author DELL
 *
 */
public interface IFeatureDepartement {
	

	
	/**
	 * TODO
	 */
	//public boolean rafraichirDepartement (Departement departement);


	/**
	 * Return a list of all 'departements'.
	 * 
	 * @param 
	 * @return
	 */
	public List<Departement> listerDepartements ();

	/**
	 * 
	 * Return a list of 'departements' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Departement> listerDepartements ( String whereClause) ;
	
	/**
	 * Delete the 'departement' set in parameter.
	 * Return true if it succeeded, else false.
	 * 
	 * @param departement
	 */
	public boolean supprimerDepartement (Departement departement);

	/**
	 * Update the 'departement' set in parameter.
	 * Return true if it succeeded, else false.
	 * 
	 * @param departement
	 */
	public boolean modifierDepartement (Departement departement);

	/**
	 * Save the 'departement' set in parameter.
	 * Return true if it succeeded, else false.
	 * 
	 * @param departement
	 */
	public boolean creerDepartement (Departement departement);


	/**
	 * Find the 'departement' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Departement rechercherDepartement ( String whereClause) ;

	/**
	 * Find the 'departement' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Departement rechercherDepartement ( Integer primaryKey) ;	

	 
	
	
}
