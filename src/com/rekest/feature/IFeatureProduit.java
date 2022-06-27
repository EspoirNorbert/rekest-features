package com.rekest.feature ;

import java.util.List ;

import com.rekest.entities.Produit ;

import com.rekest.dao.impl.HibernateDao ;

/**
 * @author DELL
 *
 */
/**
 * @author DELL
 *
 */
public interface IFeatureProduit {
	

	
	/**
	 * TODO
	 */
	//public void rafraichirProduit  (Produit produit) throws Exception;


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
	 * Return true if it succeeded, else false.
	 *  
	 * @param produit
	 */
	public void supprimerProduit  (Produit produit) throws Exception;

	/**
	 * Update the 'produit' set in parameter. 
	 * Return true if it succeeded, else false. 
	 * 
	 * 
	 * @param produit
	 */
	public void modifierProduit  (Produit produit) throws Exception;

	/**
	 * Save the 'produit' set in parameter. 
	 * Return true if it succeeded, else false. 
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

	 
	
	
}
