package com.rekest.administrateur.dao;

import com.rekest.entities.Service;
import com.rekest.entities.employes.Employe;
import com.rekest.entities.employes.Utilisateur;

public interface IDaoAdministrateur {
	
	public default Object validateCredential(String login, String password) {return null;};
	
	public default boolean enableAccount(Utilisateur entity) {
		return false;};
		
	public default boolean disableAccount(Utilisateur entity) {
		return false;};
		
	public default boolean associateService(Employe employe, Service service) {
		return false;};
}
