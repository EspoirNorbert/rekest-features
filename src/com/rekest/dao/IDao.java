package com.rekest.dao;

import java.util.List;

import com.rekest.administrateur.dao.IDaoAdministrateur;

/**
 * @author Illiassou
 *
 */
public interface IDao extends IDaoAdministrateur {

	/**
	 * @param obj
	 * @ 
	 */
	public boolean save(Object obj) ;

	/**
	 * @param obj
	 * @ 
	 */
	public boolean delete(Object obj) ;

	/**
	 * @param entityClass
	 * @param primaryKey
	 * @return
	 * @ 
	 */
	public Object find(Class<?> entityClass, Integer primaryKey) ;
	
	/**
	 * @param entityClass
	 * @return
	 * @ 
	 */
	public List<Object> list(Class<?> entityClass) ;
	
	/**
	 * @param entityClass
	 * @return
	 * @ 
	 */
	public List<Object> list(Class<?> entityClass, String whereClause) ;
	
	/**
	 * @param entity
	 * @ 
	 */
	public boolean update(Object entity) ;

	/**
	 * @param entityClass
	 * @param whereClause
	 * @return
	 * @ 
	 */
	public Object find(Class<?> entityClass, String whereClause) ;
	
	/**
	 *@param login
	 * @param password
	 * @return
	 */
	public Object validateCredential(String login, String password);
}
//Test du GIT avec eclipse