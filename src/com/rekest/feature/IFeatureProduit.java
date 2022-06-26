package com.rekest.feature;

import java.util.List;

import com.rekest.entities.Produit;

import com.rekest.dao.impl.HibernateDao;

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
	//public boolean rafraichirProduit  (Produit produit);


	/**
	 * Return a list of all 'produits'.
	 * 
	 * @param persons
	 * @return
	 */
	public List<Produit> listerProduits  ();

	/**
	 * Return a list of all 'produits' according to the filters.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public List<Produit> listerProduits  ( String whereClause) ;
	
	/**
	 * Delete the 'produit' set in parameter. 
	 * Return true if it succeeded, else false.
	 *  
	 * @param produit
	 */
	public boolean supprimerProduit  (Produit produit);

	/**
	 * Update the 'produit' set in parameter. 
	 * Return true if it succeeded, else false. 
	 * 
	 * 
	 * @param produit
	 */
	public boolean modifierProduit  (Produit produit);

	/**
	 * Save the 'produit' set in parameter. 
	 * Return true if it succeeded, else false. 
	 * 
	 * @param produit
	 */
	public boolean creerProduit  (Produit produit);


	/**
	 * Find and return the 'produit' set in parameter if it exist, else null.
	 * 
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Produit rechercherProduit ( String whereClause) ;

	/**
	 * Find and return the 'produit' set in parameter if it exist, else null.
	 * 
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Produit rechercherProduit ( Integer primaryKey) ;	

	 
	
	
}
