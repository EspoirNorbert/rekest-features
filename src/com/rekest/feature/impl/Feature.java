package com.rekest.feature.impl;

import java.util.ArrayList;
import java.util.List;

import com.rekest.dao.impl.HibernateDao;
import com.rekest.entities.Demande;
import com.rekest.entities.Departement;
import com.rekest.entities.Note;
import com.rekest.entities.Produit;
import com.rekest.entities.Role;
import com.rekest.entities.Service;
import com.rekest.entities.employes.Employe;
import com.rekest.entities.employes.Manager;
import com.rekest.entities.employes.Utilisateur;
import com.rekest.feature.IFeature;

public class Feature implements IFeature {

	
	private static Feature instance = null;
	
	private Feature () {}

	public static Feature getCurrentInstance  () {
		if  (instance == null) instance = new Feature ();
		return instance;
	}
	
	@Override
	public List<Role> listerRoles () throws Exception {

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Role.class);
		List<Role> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Role) {
				objs.add ( (Role) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public List<Role> listerRoles (String whereClause) throws Exception{

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Role.class, whereClause);
		List<Role> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Role) {
				objs.add (  (Role) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public void supprimerRole (Role role) throws Exception{
	
		HibernateDao.getCurrentInstance ().delete ( role);
		
	}

	@Override
	public void modifierRole (Role role) throws Exception{


		 HibernateDao.getCurrentInstance ().update ( role);
		
	}

	@Override
	public void creerRole (Role role) throws Exception{

		HibernateDao.getCurrentInstance ().save ( role);
		
	}

	@Override
	public Role rechercherRole (String whereClause) throws Exception{

		return   (Role) HibernateDao.getCurrentInstance ().find ( Role.class, whereClause);
	}

	@Override
	public Role rechercherRole (Integer primaryKey) throws Exception {

		Role role = new Role();
		return   (Role) HibernateDao.getCurrentInstance ().find ( role, primaryKey);
	}
	
	
	@Override
	public List<Departement> listerDepartements () throws Exception   {

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Departement.class);
		List<Departement> objs = new ArrayList<> ();
		for (Object obj : objects) {
			if  (obj instanceof Departement) {
				objs.add ( (Departement) obj);
			}
		}
		
		return objs;
	}

	@Override
	public List<Departement> listerDepartements (String whereClause) throws Exception  {

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Departement.class, whereClause);
		List<Departement> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Departement) {
				objs.add (  (Departement) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public void supprimerDepartement (Departement departement) throws Exception {
		
		  HibernateDao.getCurrentInstance ().delete ( departement);
		
	}

	@Override
	public void modifierDepartement (Departement departement) throws Exception {
		
		  HibernateDao.getCurrentInstance ().update ( departement);
	}

	@Override
	public void creerDepartement (Departement departement) throws Exception  {

		  HibernateDao.getCurrentInstance ().save ( departement);
		
	}

	@Override
	public Departement rechercherDepartement (String whereClause) throws Exception {
		
		return   (Departement) HibernateDao.getCurrentInstance ().find ( Departement.class, whereClause);
	}

	@Override
	public Departement rechercherDepartement (Integer primaryKey) throws Exception  {

		Departement dep   = new Departement();
		return   (Departement) HibernateDao.getCurrentInstance ().find ( dep, primaryKey);
	}
	
	@Override
	public List<Manager> listerManagers () throws Exception  {

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Manager.class);
		List<Manager> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Manager) {
				objs.add (  (Manager) obj);
			}
		}
		
		return objs;
	}

	@Override
	public List<Manager> listerManagers (String whereClause) throws Exception {

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Manager.class, whereClause);
		List<Manager> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Manager) {
				objs.add (  (Manager) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public void supprimerManager (Manager manager) throws Exception {
		
		HibernateDao.getCurrentInstance ().delete ( manager);
		
	}

	@Override
	public void modifierManager (Manager manager) throws Exception {
		
		 HibernateDao.getCurrentInstance ().update ( manager);
	}

	@Override
	public void creerManager (Manager manager) throws Exception {

		 HibernateDao.getCurrentInstance ().save ( manager);
		
	}

	@Override
	public Manager rechercherManager (String whereClause) throws Exception {
		
		return   (Manager) HibernateDao.getCurrentInstance ().find ( Manager.class, whereClause);
	}

	@Override
	public Manager rechercherManager (Integer primaryKey) throws Exception {

		Manager manager = new Manager();
		return   (Manager) HibernateDao.getCurrentInstance ().find ( manager, primaryKey);
	}
	
	@Override
	public List<Produit> listerProduits () throws Exception {

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Produit.class);
		List<Produit> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Produit) {
				objs.add ( (Produit) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public List<Produit> listerProduits (String whereClause) throws Exception{

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Produit.class, whereClause);
		List<Produit> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Produit) {
				objs.add (  (Produit) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public void supprimerProduit (Produit produit) throws Exception{
	
		HibernateDao.getCurrentInstance ().delete ( produit);
		
	}

	@Override
	public void modifierProduit (Produit produit) throws Exception{


		 HibernateDao.getCurrentInstance ().update ( produit);
		
	}

	@Override
	public void creerProduit (Produit produit) throws Exception{

		HibernateDao.getCurrentInstance ().save ( produit);
		
	}

	@Override
	public Produit rechercherProduit (String whereClause) throws Exception{

		return   (Produit) HibernateDao.getCurrentInstance ().find ( Produit.class, whereClause);
	}

	@Override
	public Produit rechercherProduit (Integer primaryKey) throws Exception {

		Produit prod = new Produit();
		return   (Produit) HibernateDao.getCurrentInstance ().find ( prod, primaryKey);
	}
	
	@Override
	public List<Employe> listerEmployes () throws Exception {

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Employe.class);
		List<Employe> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Employe) {
				objs.add ( (Employe) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public List<Employe> listerEmployes (String whereClause) throws Exception{

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Employe.class, whereClause);
		List<Employe> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Employe) {
				objs.add (  (Employe) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public void supprimerEmploye (Employe employe) throws Exception{
	
		HibernateDao.getCurrentInstance ().delete ( employe);
		
	}

	@Override
	public void modifierEmploye (Employe employe) throws Exception{


		 HibernateDao.getCurrentInstance ().update ( employe);
		
	}

	@Override
	public void creerEmploye (Employe employe) throws Exception{

		HibernateDao.getCurrentInstance ().save ( employe);
		
	}

	@Override
	public Employe rechercherEmploye (String whereClause) throws Exception{

		return   (Employe) HibernateDao.getCurrentInstance ().find ( Employe.class, whereClause);
	}

	@Override
	public Employe rechercherEmploye (Integer primaryKey) throws Exception {

		Employe prod = new Employe();
		return   (Employe) HibernateDao.getCurrentInstance ().find ( prod, primaryKey);
	}
	
	
	
	@Override
	public List<Service> listerServices () throws Exception{

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Service.class);
		List<Service> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Service) {
				objs.add (  (Service) obj);
			}
		}
		
		return objs;
	}

	@Override
	public List<Service> listerServices (String whereClause) throws Exception{

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Service.class, whereClause);
		List<Service> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Service) {
				objs.add (  (Service) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public void supprimerService (Service service) throws Exception{
		
		 HibernateDao.getCurrentInstance ().delete ( service);
		
	}

	@Override
	public void modifierService (Service service) throws Exception {
		
		HibernateDao.getCurrentInstance ().update ( service);
	}

	@Override
	public void creerService (Service service) throws Exception{

		 HibernateDao.getCurrentInstance ().save ( service);
		
	}

	@Override
	public Service rechercherService (String whereClause) throws Exception {
		
		return   (Service) HibernateDao.getCurrentInstance ().find ( Service.class, whereClause);
	}

	@Override
	public Service rechercherService (Integer primaryKey) throws Exception {

		Service serv = new Service();
		return   (Service) HibernateDao.getCurrentInstance ().find ( serv, primaryKey);
	}

	@Override
	public void activerUtilisateur  (Utilisateur utilisateur) throws Exception {
		
		HibernateDao.getCurrentInstance ().enableAccount (utilisateur);
	
		
	}

	@Override
	public void desactiverUtilisateur  (Utilisateur utilisateur) throws Exception {
		
		HibernateDao.getCurrentInstance ().disableAccount (utilisateur);
	}

	/*
	@Override
	public void rafraichirUtilisateur (Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return HibernateDao.getCurrentInstance ().;
	}
	*/

	@Override
	public List<Utilisateur> listerUtilisateurs () throws Exception {

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Utilisateur.class);
		List<Utilisateur> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Utilisateur) {
				objs.add ( (Utilisateur) obj);
			}
		}
		
		return objs;
	}

	@Override
	public List<Utilisateur> listerUtilisateurs (String whereClause) throws Exception{
		
		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Utilisateur.class, whereClause);
		List<Utilisateur> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Utilisateur) {
				objs.add ( (Utilisateur) obj);
			}
		}
		
		return objs;
	}

	@Override
	public void supprimerUtilisateur (Utilisateur utilisateur) throws Exception {
		 HibernateDao.getCurrentInstance ().delete ( utilisateur);
		
	}

	@Override
	public void modifierUtilisateur (Utilisateur utilisateur) throws Exception {

		HibernateDao.getCurrentInstance ().update ( utilisateur);
	}

	@Override
	public void creerUtilisateur (Utilisateur utilisateur) throws Exception {
	
		HibernateDao.getCurrentInstance ().save ( utilisateur);
		
	}


	@Override
	public Utilisateur rechercherUtilisateur (String whereClause) throws Exception {
		
		return  (Utilisateur) HibernateDao.getCurrentInstance ().find (  Utilisateur.class, whereClause);
	}

	@Override
	public Utilisateur rechercherUtilisateur (Integer primaryKey) throws Exception{
		
		Utilisateur user = new Utilisateur( null, null, null, null);
		return  (Utilisateur) HibernateDao.getCurrentInstance ().find ( user , primaryKey);
	}

	@Override
	public String getTheDaoImplementationClassname () {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public List<Note> listerNotes () throws Exception  {

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Note.class);
		List<Note> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Note) {
				objs.add (  (Note) obj);
			}
		}
		
		return objs;
	}

	@Override
	public List<Note> listerNotes (String whereClause) throws Exception {

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Note.class, whereClause);
		List<Note> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Note) {
				objs.add (  (Note) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public void supprimerNote (Note note) throws Exception {
		
		HibernateDao.getCurrentInstance ().delete ( note);
		
	}

	@Override
	public void modifierNote (Note note) throws Exception {
		
		 HibernateDao.getCurrentInstance ().update ( note);
	}

	@Override
	public void creerNote (Note note) throws Exception {

		 HibernateDao.getCurrentInstance ().save ( note);
		
	}

	@Override
	public Note rechercherNote (String whereClause) throws Exception {
		
		return   (Note) HibernateDao.getCurrentInstance ().find ( Note.class, whereClause);
	}

	@Override
	public Note rechercherNote (Integer primaryKey) throws Exception {


		return   (Note) HibernateDao.getCurrentInstance ().find ( Note.class, primaryKey);
	}

	

	
	
	@Override
	public List<Demande> listerDemandes () throws Exception  {

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Demande.class);
		List<Demande> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Demande) {
				objs.add (  (Demande) obj);
			}
		}
		
		return objs;
	}

	@Override
	public List<Demande> listerDemandes (String whereClause) throws Exception {

		List<Object> objects = HibernateDao.getCurrentInstance ().list ( Demande.class, whereClause);
		List<Demande> objs = new ArrayList<> ();
		for  (Object obj : objects) {
			if  (obj instanceof Demande) {
				objs.add (  (Demande) obj);
			}
		}
		
		return objs;
		
	}

	@Override
	public void supprimerDemande (Demande demande) throws Exception {
		
		HibernateDao.getCurrentInstance ().delete ( demande);
		
	}

	@Override
	public void modifierDemande (Demande demande) throws Exception {
		
		 HibernateDao.getCurrentInstance ().update ( demande);
	}

	@Override
	public void creerDemande (Demande demande) throws Exception {

		 HibernateDao.getCurrentInstance ().save ( demande);
		
	}

	@Override
	public Demande rechercherDemande (String whereClause) throws Exception {
		
		return   (Demande) HibernateDao.getCurrentInstance ().find ( Demande.class, whereClause);
	}

	@Override
	public Demande rechercherDemande (Integer primaryKey) throws Exception {


		return   (Demande) HibernateDao.getCurrentInstance ().find ( Demande.class, primaryKey);
	}
	
	
}
