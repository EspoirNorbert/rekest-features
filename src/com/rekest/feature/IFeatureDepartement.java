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
	//public void rafraichirDepartement (Departement departement);


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
	 * Return true if it succeeded, else false.
	 * 
	 * @param departement
	 */
	public void supprimerDepartement (Departement departement) throws Exception ;

	/**
	 * Update the 'departement' set in parameter.
	 * Return true if it succeeded, else false.
	 * 
	 * @param departement
	 */
	public void modifierDepartement (Departement departement) throws Exception ;

	/**
	 * Save the 'departement' set in parameter.
	 * Return true if it succeeded, else false.
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

	 
	
	
}
