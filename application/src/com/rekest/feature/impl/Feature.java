package com.rekest.feature.impl;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;
import com.rekest.dao.IDao;
import com.rekest.dao.impl.HibernateDao;
import com.rekest.entities.Demande;
import com.rekest.entities.Departement;
import com.rekest.entities.Note;
import com.rekest.entities.Notification;
import com.rekest.entities.Produit;
import com.rekest.entities.Role;
import com.rekest.entities.Service;
import com.rekest.entities.employes.Administrateur;
import com.rekest.entities.employes.ChefService;
import com.rekest.entities.employes.Directeur;
import com.rekest.entities.employes.DirecteurGeneral;
import com.rekest.entities.employes.Employe;
import com.rekest.entities.employes.Manager;
import com.rekest.entities.employes.Utilisateur;
import com.rekest.exeptions.DAOException;
import com.rekest.feature.IFeature;
import com.rekest.notificationmanager.impl.NotificationManager;
import com.rekest.observableList.impl.ObservableListDemande;
import com.rekest.observableList.impl.ObservableListDepartement;
import com.rekest.observableList.impl.ObservableListEmploye;
import com.rekest.observableList.impl.ObservableListManager;
import com.rekest.observableList.impl.ObservableListNote;
import com.rekest.observableList.impl.ObservableListNotification;
import com.rekest.observableList.impl.ObservableListProduit;
import com.rekest.observableList.impl.ObservableListRole;
import com.rekest.observableList.impl.ObservableListService;
import com.rekest.observableList.impl.ObservableListUtilisateur;
import com.rekest.utils.ErrorLogFileManager;
import com.rekest.utils.Utilitaire;

import javafx.collections.ObservableList;

public class Feature implements IFeature {

	private static Feature instance = null;
	private static IDao dao = HibernateDao.getCurrentInstance ();
	
	private ObservableListDepartement observableListDepartement;
	private ObservableListEmploye observableListEmploye ;
	private ObservableListProduit observableListProduit ;
	private ObservableListService observableListService ;
	private ObservableListRole observableListRole;
	private ObservableListDemande observableListDemande ;
	private ObservableListManager observableListManager ;
	private ObservableListNote observableListNote ;
	private ObservableListUtilisateur observableListUtilisateur;
	private ObservableListNotification observableListNotification;

	private static NotificationManager notifManager = new NotificationManager();
	
	private Feature () {
		observableListDepartement = new ObservableListDepartement ();
		observableListEmploye = new ObservableListEmploye ();
		observableListProduit = new ObservableListProduit ();
		observableListService = new ObservableListService ();
		observableListRole = new ObservableListRole ();
		observableListDemande = new ObservableListDemande ();
		observableListManager = new ObservableListManager ();
		observableListNote = new ObservableListNote ();
		observableListUtilisateur = new ObservableListUtilisateur ();
		observableListNotification = new ObservableListNotification ();
	}

	public static Feature getCurrentInstance () {
		if (instance == null) instance = new Feature ();
		return instance;
	}
	
	private Faker faker = new Faker ();

	
	private static void AlertError (Exception e,String context) {
	
		/*
		Utilitaire.alert (AlertType.ERROR, null,
				"Error", e.getClass () +
				"Error while "+context,
				e.getMessage ());
		*/
		e.printStackTrace ();
	
	}

	@Override
	public void initDepartement () {
		try {
			for (int i = 0; i <= 10; i++) {
				Departement department = 
						new Departement (faker.commerce ().department ());
				dao.save (department);
			}
		} catch (DAOException e) {
			System.err.println (e.getMessage ());
		}
	}

	@Override
	public void initEmploye () {
		try {
			for (int i = 0; i <= 10; i++) {
				Employe employe = new Employe (
						faker.name ().lastName (),
						faker.name ().firstName (),
						faker.phoneNumber ().cellPhone (), faker.internet ().emailAddress (), faker.address ().fullAddress ());
				dao.save (employe);
			}
		} catch (DAOException e) {
			System.err.println (e.getMessage ());
		}
	}

	@Override
	public void initAdmin () {
		try {
			dao.save (createDefaultAdmin ());
			for (int i = 0; i <= 3; i++) {
				Administrateur admin = new Administrateur (
						 faker.name ().lastName (),
						 faker.name ().firstName (),
						faker.phoneNumber ().cellPhone (), faker.internet ().emailAddress (), faker.address ().fullAddress ());

				dao.save (admin);
			}
		} catch (DAOException e) {
			e.printStackTrace ();
		}
	}
	
	@Override
	public void initManagers () {
		try {
			// List<Manager> managers = new ArrayList<> ();
			for (int i = 0; i <= 10; i++) {
				ChefService chefService = new ChefService (faker.name ().firstName (), faker.name ().lastName (),
						faker.phoneNumber ().cellPhone (), faker.internet ().emailAddress (), faker.address ().fullAddress ());
				Utilitaire.generateLoginAndPassword (chefService);
				dao.save (chefService);
				Directeur directeur = new Directeur (faker.name ().firstName (), faker.name ().lastName (),
						faker.phoneNumber ().cellPhone (), faker.internet ().emailAddress (), faker.address ().fullAddress ());
				Utilitaire.generateLoginAndPassword (directeur);
				dao.save (directeur);
				DirecteurGeneral directeurGeneral = new DirecteurGeneral (faker.name ().firstName (),
						faker.name ().lastName (), faker.phoneNumber ().cellPhone (), faker.internet ().emailAddress (),
						faker.address ().fullAddress ());
				Utilitaire.generateLoginAndPassword (directeurGeneral);
				dao.save (directeur);
			}
		} catch (DAOException e) {
			e.printStackTrace ();
		}
	}
	
	@Override
	public Administrateur createDefaultAdmin () {
		Administrateur admin =  new Administrateur ("Administrator", "System", "+221771234500", "rekest.app@rekest.sn",
				"Terrain foyer Rocade Fann Bel Air, BP 10 000 Dakar Liberté – SENEGAL");
		admin.setLogin ("admin");
		admin.setPassword ("admin");
		return admin;
	}

	@Override
	public void initAllEntity () {
		this.initAdmin ();
		this.initEmploye ();
		this.initManagers ();
		this.initDepartement ();
	}
	
	@Override
	public ObservableListDemande getObservableListDemande () {
		return observableListDemande;
	}
	
	@Override
	public ObservableListDepartement getObservableListDepartement () {
		return observableListDepartement;
	}
	
	@Override
	public ObservableListEmploye getObservableListEmploye () {
		return observableListEmploye;
	}
	
	@Override
	public ObservableListManager getObservableListManager () {
		return observableListManager;
	}
	
	@Override
	public ObservableListNote getObservableListNote () {
		return observableListNote;
	}
	
	@Override
	public ObservableListProduit getObservableListProduit () {
		return observableListProduit;
	}
	
	@Override
	public ObservableListRole getObservableListRole () {
		return observableListRole;
	}
	
	@Override
	public ObservableListNotification getObservableListNotification () {
		return observableListNotification;
	}
	
	@Override
	public ObservableListService getObservableListService () {
		return observableListService;
	}
	
	@Override
	public ObservableListUtilisateur getObservableListUtilisateur () {
		return observableListUtilisateur;
	}


	@Override
	public List<Departement> listDepartements ()   {

		List<Object> objects =  null;
		List<Departement> departements = new ArrayList<> ();
		try {
			objects = dao.list ( new Departement ());

			for (Object obj : objects) {
				if (obj instanceof Departement) {
					departements.add ( (Departement) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get departements");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return departements;
	}

	@Override
	public List<Departement> listDepartements (String whereClause)  {

		List<Object> objects;
		List<Departement> objs = new ArrayList<> ();
		try {
			objects = dao.list ( Departement.class, whereClause);
			for (Object obj : objects) {
				if (obj instanceof Departement) {
					objs.add ( (Departement) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get departements");
			ErrorLogFileManager.appendError (e.getMessage ());
		}

		return objs;
	}

	@Override
	public boolean deleteDepartement (Departement departement)   {
		try {
			dao.delete ( departement);
			loadDepartementsObservableList ();


			return true;
		} catch (DAOException e) {
			AlertError (e,"delete departement");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}

	}

	@Override
	public boolean updateDepartement (Departement departement)   {

		try {
			dao.update ( departement);
			loadDepartementsObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"update departement");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}
	}

	@Override
	public boolean createDepartement (Departement departement)   {

		try {
			dao.save ( departement);
			loadDepartementsObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"create departement");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}

	}



	@Override
	public Departement findDepartement (String whereClause)   {

		try {
			return (Departement) dao.find (  Departement.class, whereClause);
		} catch (DAOException e) {
			AlertError (e,"find departement");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}

	@Override
	public Departement findDepartement (Integer primaryKey)  {
		try {
			return (Departement) dao.find ( new Departement ( ) , primaryKey);
		} catch (DAOException e) {
			AlertError (e,"find departement");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}



	@Override
	public boolean enableUtilisateur (Utilisateur utilisateur)   {

		try {
			dao.enableAccount (utilisateur);
			loadUtilisateursObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"enabling user");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}
	}

	@Override
	public boolean disableUtilisateur (Utilisateur utilisateur)   {

		try {
			dao.disableAccount (utilisateur);
			loadUtilisateursObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"desabling user");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}
	}

	/*
	@Override
	public boolean rafraichirUtilisateur (Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return dao.;
	}
	 */

	@Override
	public List<Utilisateur> listUtilisateurs ()   {

		List<Object> objects;
		List<Utilisateur> objs = new ArrayList<> ();
		try {
			objects = dao.list ( new Utilisateur ());

			for (Object obj : objects) {
				if (obj instanceof Utilisateur) {
					objs.add ( (Utilisateur) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get users");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return objs;
	}

	@Override
	public List<Utilisateur> listUtilisateurs (String whereClause)  {

		List<Object> objects;
		List<Utilisateur> objs = new ArrayList<> ();
		try {
			objects = dao.list ( Utilisateur.class, whereClause);
			for (Object obj : objects) {
				if (obj instanceof Utilisateur) {
					objs.add ( (Utilisateur) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get users");
			ErrorLogFileManager.appendError (e.getMessage ());
		}


		return objs;
	}

	@Override
	public boolean deleteUtilisateur (Utilisateur utilisateur)   {
		try {
			
			List<Notification> notifs= utilisateur.getNotification();
			while(notifs.get(0) != null) {
				deleteNotificationFeature(notifs.get(0), null , null);
				notifs.remove(0);
			}
			utilisateur.setNotifications(notifs);
			
			List<Demande> demandes= utilisateur.getDemandesCreees();
			while(demandes.get(0) != null) {
				deleteDemande(demandes.get(0));
				demandes.remove(0);
			}
			utilisateur.setDemandesCreees(demandes);
			
			
			dao.delete ( utilisateur);
			loadUtilisateursObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"delete user");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}

	}

	@Override
	public boolean updateUtilisateur (Utilisateur utilisateur)   {

		try {
			dao.update ( utilisateur);
			loadUtilisateursObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"update user");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}
	}

	@Override
	public boolean createUtilisateur (Utilisateur utilisateur)   {

		try {
			dao.save ( utilisateur);
			loadUtilisateursObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"create user");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}


	}



	@Override
	public Utilisateur findUtilisateur (String whereClause)   {

		try {
			return (Utilisateur) dao.find (  Utilisateur.class, whereClause);
		} catch (DAOException e) {
			AlertError (e,"find user");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}

	@Override
	public Utilisateur findUtilisateur (Integer primaryKey)  {
		try {
			return (Utilisateur) dao.find ( new Utilisateur ( ) , primaryKey);
		} catch (DAOException e) {
			AlertError (e,"find user");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}

	@Override
	public List<Notification> listNotifications ()   {

		List<Object> objects;
		List<Notification> objs = new ArrayList<> ();
		try {
			objects = dao.list ( new Notification ());

			for (Object obj : objects) {
				if (obj instanceof Notification) {
					objs.add ( (Notification) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get notifications");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return objs;
	}

	@Override
	public List<Notification> listNotifications (String whereClause)  {

		List<Object> objects;
		List<Notification> objs = new ArrayList<> ();
		try {
			objects = dao.list ( Notification.class, whereClause);
			for (Object obj : objects) {
				if (obj instanceof Notification) {
					objs.add ( (Notification) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get notifications");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return objs;
	}

	@Override
	public boolean deleteNotificationFeature  (Notification notification, Utilisateur utilisateur, Demande demande)   {
		try {
			notifManager.deleteNotification(notification, utilisateur, demande);
			loadNotificationObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"delete notification");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}

	}

	@Override
	public boolean updateNotification (Notification notification)   {

		try {
			dao.update ( notification);
			loadNotificationObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"update notification");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}
	}

	@Override
	public boolean createNotificationFeature (Utilisateur utilisateur, Demande demande, String message)    {

		try {
			notifManager.createNotification(utilisateur, demande, message);
			loadNotificationObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"create notification");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}


	}



	@Override
	public Notification findNotification (String whereClause)   {

		try {
			return (Notification) dao.find (  Notification.class, whereClause);
		} catch (DAOException e) {
			AlertError (e,"find notification");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}

	@Override
	public Notification findNotification (Integer primaryKey)  {
		try {
			return (Notification) dao.find ( new Notification ( ) , primaryKey);
		} catch (DAOException e) {
			AlertError (e,"find notification");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}

	@Override
	public List<Role> listRoles ()   {

		List<Object> objects;
		List<Role> objs = new ArrayList<> ();
		try {
			objects = dao.list ( new Role ());

			for (Object obj : objects) {
				if (obj instanceof Role) {
					objs.add ( (Role) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get roles");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return objs;
	}

	@Override
	public List<Role> listRoles (String whereClause)  {

		List<Object> objects;
		List<Role> objs = new ArrayList<> ();
		try {
			objects = dao.list ( Role.class, whereClause);
			for (Object obj : objects) {
				if (obj instanceof Role) {
					objs.add ( (Role) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get roles");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return objs;
	}

	@Override
	public boolean deleteRole (Role role)   {
		try {
			dao.delete ( role);
			loadRoleObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"delete role");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}

	}

	@Override
	public boolean updateRole (Role role)   {

		try {
			dao.update ( role);
			loadRoleObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"update role");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}
	}

	@Override
	public boolean createRole (Role role)   {

		try {
			dao.save ( role);
			loadRoleObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"create role");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}


	}



	@Override
	public Role findRole (String whereClause)   {

		try {
			return (Role) dao.find (  Role.class, whereClause);
		} catch (DAOException e) {
			AlertError (e,"find role");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}

	@Override
	public Role findRole (Integer primaryKey)  {
		try {
			return (Role) dao.find ( new Role ( ) , primaryKey);
		} catch (DAOException e) {
			AlertError (e,"find role");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}


	
	@Override
	public List<Manager> listManagers ()   {

		List<Object> objects;
		List<Manager> objs = new ArrayList<> ();
		try {
			objects = dao.list ( new Manager ());

			for (Object obj : objects) {
				if (obj instanceof Manager) {
					objs.add ( (Manager) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get managers");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return objs;
	}

	@Override
	public List<Manager> listManagers (String whereClause)  {

		List<Object> objects;
		List<Manager> objs = new ArrayList<> ();
		try {
			objects = dao.list ( Manager.class, whereClause);
			for (Object obj : objects) {
				if (obj instanceof Manager) {
					objs.add ( (Manager) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get managers");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return objs;
	}

	@Override
	public boolean deleteManager (Manager manager)   {
		try {
			dao.delete ( manager);
			loadManagerObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"delete manager");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}

	}

	@Override
	public boolean updateManager (Manager manager)   {

		try {
			dao.update ( manager);
			loadManagerObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"update manager");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}
	}

	@Override
	public boolean createManager (Manager manager)   {

		try {
			dao.save ( manager);
			loadManagerObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"create manager");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}


	}



	@Override
	public Manager findManager (String whereClause)   {

		try {
			return (Manager) dao.find (  Manager.class, whereClause);
		} catch (DAOException e) {
			AlertError (e,"find manager");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}

	@Override
	public Manager findManager (Integer primaryKey)  {
		try {
			return (Manager) dao.find ( new Manager ( ) , primaryKey);
		} catch (DAOException e) {
			AlertError (e,"find manager");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}

	@Override
	public List<Employe> listEmployes ()   {

		List<Object> objects;
		List<Employe> objs = new ArrayList<> ();
		try {
			objects = dao.list ( new Employe ());

			for (Object obj : objects) {
				if (obj instanceof Employe) {
					objs.add ( (Employe) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get employes");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return objs;
	}

	@Override
	public List<Employe> listEmployes (String whereClause)  {

		List<Object> objects;
		List<Employe> objs = new ArrayList<> ();
		try {
			objects = dao.list ( Employe.class, whereClause);
			for (Object obj : objects) {
				if (obj instanceof Employe) {
					objs.add ( (Employe) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get employes");
			ErrorLogFileManager.appendError (e.getMessage ());
		}



		return objs;
	}

	@Override
	public boolean deleteEmploye (Employe employe)   {
		try {
			dao.delete ( employe);
			loadEmployesObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"delete employe");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}

	}

	@Override
	public boolean updateEmploye (Employe employe)   {

		try {
			dao.update ( employe);
			loadEmployesObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"update employe");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}
	}

	@Override
	public boolean createEmploye (Employe employe)   {

		try {
			dao.save ( employe);
			loadEmployesObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"create employe");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}


	}



	@Override
	public Employe findEmploye (String whereClause)   {

		try {
			return (Employe) dao.find (  Employe.class, whereClause);
		} catch (DAOException e) {
			AlertError (e,"find employe");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}

	@Override
	public Employe findEmploye (Integer primaryKey)  {
		try {
			return (Employe) dao.find ( new Employe ( ) , primaryKey);
		} catch (DAOException e) {
			AlertError (e,"find employe");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}

	@Override
	public List<Service> listServices ()   {

		List<Object> objects;
		List<Service> objs = new ArrayList<> ();
		try {
			objects = dao.list ( new Service ());

			for (Object obj : objects) {
				if (obj instanceof Service) {
					objs.add ( (Service) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get services");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return objs;
	}

	@Override
	public List<Service> listServices (String whereClause)  {

		List<Object> objects;
		List<Service> objs = new ArrayList<> ();
		try {
			objects = dao.list ( Service.class, whereClause);
			for (Object obj : objects) {
				if (obj instanceof Service) {
					objs.add ( (Service) obj);
				}
			}

		} catch (DAOException e) {
			AlertError (e,"get services");
			ErrorLogFileManager.appendError (e.getMessage ());
		}



		return objs;
	}

	@Override
	public boolean deleteService (Service service)   {
		try {
			List<Employe> employes= service.getEmployes();
			while(employes.get(0) != null) {
				deleteEmploye(employes.get(0));
				employes.remove(0);
			}
			service.setEmployes(employes);
			
			dao.delete ( service);
			loadServicesObservableList ();
			
			loadEmployesObservableList ();
			loadManagerObservableList ();
			loadUtilisateursObservableList ();
			
			
			return true;
		} catch (DAOException e) {
			AlertError (e,"delete service");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}

	}

	@Override
	public boolean updateService (Service service)   {

		try {
			dao.update ( service);
			loadServicesObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"update service");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}
	}

	@Override
	public boolean createService (Service service)   {

		try {
			dao.save ( service);
			loadServicesObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"create service");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}


	}



	@Override
	public Service findService (String whereClause)   {

		try {
			return (Service) dao.find (  Service.class, whereClause);
		} catch (DAOException e) {
			AlertError (e,"find service");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}

	@Override
	public Service findService (Integer primaryKey)  {
		try {
			return (Service) dao.find ( new Service ( ) , primaryKey);
		} catch (DAOException e) {
			AlertError (e,"find service");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}

	@Override
	public List<Produit> listProduits ()   {

		List<Object> objects;
		List<Produit> objs = new ArrayList<> ();
		try {
			objects = dao.list ( new Produit ());

			for (Object obj : objects) {
				if (obj instanceof Produit) {
					objs.add ( (Produit) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get produits");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return objs;
	}

	@Override
	public List<Produit> listProduits (String whereClause)  {

		List<Object> objects;
		List<Produit> objs = new ArrayList<> ();
		try {
			objects = dao.list ( Produit.class, whereClause);
			for (Object obj : objects) {
				if (obj instanceof Produit) {
					objs.add ( (Produit) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get produits");
			ErrorLogFileManager.appendError (e.getMessage ());
		}



		return objs;
	}

	@Override
	public boolean deleteProduit (Produit produit)   {
		try {
			dao.delete ( produit);
			loadProduitsObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"delete produit");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}

	}

	@Override
	public boolean updateProduit (Produit produit)   {

		try {
			dao.update ( produit);
			loadProduitsObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"update produit");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}
	}

	@Override
	public boolean createProduit (Produit produit)   {

		try {
			dao.save ( produit);
			loadProduitsObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"cretae produit");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}


	}



	@Override
	public Produit findProduit (String whereClause)   {

		try {
			return (Produit) dao.find (  Produit.class, whereClause);
		} catch (DAOException e) {
			AlertError (e,"find produit");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}

	@Override
	public Produit findProduit (Integer primaryKey)  {
		try {
			return (Produit) dao.find ( new Produit ( ) , primaryKey);
		} catch (DAOException e) {
			AlertError (e,"find produit");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}

	@Override
	public List<Note> listNotes ()    {
		
		List<Note> objs = new ArrayList<> ();
		List<Object> objects;
		try {
			objects = dao.list ( new Note ());
			for (Object obj : objects) {
				if (obj instanceof Note) {
					objs.add ( (Note) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get notes");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return objs;
	}

	@Override
	public List<Note> listNotes (String whereClause)   {

		List<Object> objects;
		List<Note> objs = new ArrayList<> ();
		try {
			objects = dao.list ( Note.class, whereClause);
			for (Object obj : objects) {
				if (obj instanceof Note) {
					objs.add ( (Note) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get notes");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return objs;

	}

	@Override
	public boolean deleteNote (Note note)   {

		try {
			dao.delete ( note);
			loadNoteObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"delete note");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}


	}

	@Override
	public boolean updateNote (Note note)   {

		try {
			dao.update ( note);
			loadNoteObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"update note");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}

	}

	@Override
	public boolean createNote (Note note)   {

		try {
			dao.save ( note); 
			loadNoteObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"create note");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}

	}

	@Override
	public Note findNote (String whereClause)   {

		try {
			return (Note) dao.find ( Note.class, whereClause);
		} catch (DAOException e) {
			AlertError (e,"find note");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}

	@Override
	public Note findNote (Integer primaryKey)   {
		try {
			return (Note) dao.find ( new Note (), primaryKey);
		} catch (DAOException e) {
			AlertError (e,"find note");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}


	@Override
	public List<Demande> listDemandes ()    {

		List<Demande> objs = new ArrayList<> ();
		List<Object> objects;
		try {
			objects = dao.list ( new Demande ());
			for (Object obj : objects) {
				if (obj instanceof Demande) {
					objs.add ( (Demande) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get demandes");
			ErrorLogFileManager.appendError (e.getMessage ());
		}


		return objs;
	}

	@Override
	public List<Demande> listDemandes (String whereClause)   {

		List<Object> objects;
		List<Demande> objs = new ArrayList<> ();
		try {
			objects = dao.list ( Demande.class, whereClause);

			for (Object obj : objects) {
				if (obj instanceof Demande) {
					objs.add ( (Demande) obj);
				}
			}
		} catch (DAOException e) {
			AlertError (e,"get demandes");
			ErrorLogFileManager.appendError (e.getMessage ());
		}

		return objs;

	}

	@Override
	public boolean deleteDemande (Demande demande)   {

		try {

			List<Note> notes= demande.getNotes();
			while(notes.get(0) != null) {
				deleteNote(notes.get(0));
				notes.remove(0);
			}
			demande.setNotes(notes);
			
			List<Notification> notifications= demande.getNotifications();
			while(notifications.get(0) != null) {
				deleteNotificationFeature(notifications.get(0), null , demande);
				notifications.remove(0);
			}
			demande.setNotifications(notifications);
			
			
			
			
			dao.delete ( demande);
			loadDemandesObservableList ();
			loadNoteObservableList();
			loadNotificationObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"delete demande");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}

	}

	@Override
	public boolean updateDemande (Demande demande)   {

		try {
			dao.update ( demande);
			loadDemandesObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"update demande");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}
	}

	@Override
	public boolean createDemande (Demande demande)   {
		try {
			dao.save ( demande);
			loadDemandesObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"create demande");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}	
	}

	@Override
	public Demande findDemande (String whereClause)   {
		try {
			return (Demande) dao.find ( Demande.class, whereClause);
		} catch (DAOException e) {
			AlertError (e,"find demande");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}

	@Override
	public Demande findDemande (Integer primaryKey)   {

		try {
			return (Demande) dao.find ( new Demande (), primaryKey);
		} catch (DAOException e) {
			AlertError (e,"find demande");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return null;
	}

	@Override
	public String getTheDaoImplementationClassname () {
		return null;
	}


	@Override
	public Integer getNumberDemandes () {
		return listDemandes ().size ();
	}

	@Override
	public Integer getNumberEmployes () {
		return listEmployes ().size ();
	}

	@Override
	public Integer getNumberDepartements () {
		return listDepartements ().size ();
	}

	@Override
	public Integer getNumberServices () {
		return listServices ().size ();
	}

	@Override
	public Integer getNumberProduits () {
		return listProduits ().size ();
	}

	@Override
	public ObservableList<Role> loadRoleObservableList ()   {
		try {
			observableListRole.clear ();
			observableListRole.addAll (  dao.list ( new Role () ));
		} catch (DAOException e) {
			AlertError (e,"loading roles");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return observableListRole.getData ();
	}


	@Override
	public ObservableList<Notification> loadNotificationObservableList ()   {
		try {
			observableListNotification.clear ();
			observableListNotification.addAll (  dao.list ( new Notification () ));
		} catch (DAOException e) {
			AlertError (e,"loading notifications");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return observableListNotification.getData ();
	}

	
	@Override
	public ObservableList<Produit> loadProduitsObservableList ()   {

		try {
			observableListProduit.clear ();
			observableListProduit.addAll (  dao.list ( new Produit () ));
		} catch (DAOException e) {
			AlertError (e,"loading produits");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return observableListProduit.getData ();

	}

	@Override
	public ObservableList<Service> loadServicesObservableList ()   {

		try {
			observableListService.clear ();
			observableListService.addAll (  dao.list ( new Service () ));
		} catch (DAOException e) {
			AlertError (e,"loading services");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return observableListService.getData ();
	}

	@Override
	public ObservableList<Departement> loadDepartementsObservableList ()   {


		try {
			observableListDepartement.clear ();
			observableListDepartement.addAll (  dao.list ( new Departement () ));
		} catch (DAOException e) {
			AlertError (e,"loading departement");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return observableListDepartement.getData ();
	}

	@Override
	public ObservableList<Demande> loadDemandesObservableList ()  {

		try {
			observableListDemande.clear ();
			observableListDemande.addAll (  dao.list ( new Demande () ));
		} catch (DAOException e) {
			AlertError (e,"loading demandes");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return observableListDemande.getData ();
	}

	@Override
	public ObservableList<Employe> loadEmployesObservableList ()  {

		try {
			observableListEmploye.clear ();
			observableListEmploye.addAll (  dao.list ( new Employe () ));
		} catch (DAOException e) {
			AlertError (e,"loading employes");
			ErrorLogFileManager.appendError (e.getMessage ());
		}

		return observableListEmploye.getData ();
	}


	@Override
	public ObservableList<Demande> loadDemandesByServiceObservableList (Service service)  {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ObservableList<Demande> loadDemandesByDirectionObservableList (Object direction)   {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ObservableList<Manager> loadManagerObservableList () {

		try {
			observableListManager.clear ();
			observableListManager.addAll (  dao.list ( new Manager () ));
		} catch (DAOException e) {
			AlertError (e,"loading manages");
			ErrorLogFileManager.appendError (e.getMessage ());
		}

		return observableListManager.getData ();
	}

	@Override
	public ObservableList<Note> loadNoteObservableList () {

		try {
			observableListNote.clear ();
			observableListNote.addAll (  dao.list ( new Note () ));
		} catch (DAOException e) {
			AlertError (e,"loading notes");
			ErrorLogFileManager.appendError (e.getMessage ());
		}

		return observableListNote.getData ();
	}

	@Override
	public ObservableList<Utilisateur> loadUtilisateursObservableList () {

		try {
			observableListUtilisateur.clear ();
			observableListUtilisateur.addAll (  dao.list ( new Utilisateur () ));
		} catch (DAOException e) {
			AlertError (e,"loading utilisateurs");
			ErrorLogFileManager.appendError (e.getMessage ());
		}

		return observableListUtilisateur.getData ();
	}
	@Override
	public boolean requestDemande (Demande demande, String reponse)    {
		try {
			dao.requestResponse (demande, reponse);
			return true;
		} catch (DAOException e) {
			AlertError (e,"requesting demande");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}	
	}

	@Override
	public Object validateCredential (String login, String password)   {

		Object obj = new Object ();

		try {
			obj = HibernateDao.getCurrentInstance ().validateCredential ( login,  password);

		} catch (DAOException e) {
			AlertError (e,"validating credentials");
			ErrorLogFileManager.appendError (e.getMessage ());
		}
		return obj;
	}
	

	@Override
	public boolean associateService (Employe employe, Service service)   {

		try {
			HibernateDao.getCurrentInstance ().associateService ( employe, service) ;
			loadEmployesObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"associating service");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}

	}
	
	@Override
	public boolean associateDepartement(Service service, Departement departement)  {

		try {
			HibernateDao.getCurrentInstance ().associateDepartement(service, departement);
			loadEmployesObservableList ();
			return true;
		} catch (DAOException e) {
			AlertError (e,"associating service to departement");
			ErrorLogFileManager.appendError (e.getMessage ());
			return false;
		}

	}

	/*
	 * 
	 * 
	 * 
	 * 
	@Override
	public boolean setDemandeList (List<Demande> demandes) {
		clearDemandeList ();
		getCurrentDemandeObservableList ().addAll (demandes);    
	}

		@Override
	public boolean setProduitList (List<Produit> produits) {
		clearProduitList ();
		getCurrentProduitObservableList ().addAll (produits);    
	}

		@Override
	public boolean setEmployeList (List<Employe> employes) {
		clearEmployeList ();
		getCurrentEmployeObservableList ().addAll (employes);    
	}

		@Override
	public boolean setServiceList (List<Service> services) {
		clearServiceList ();
		getCurrentServiceObservableList ().addAll (services);    
	}

		@Override
	public boolean setServiceList (List<Service> services) {
		clearServiceList ();
		getCurrentServiceObservableList ().addAll (services);    
	}

		@Override
	public boolean setServiceList (List<Service> services) {
		clearServiceList ();
		getCurrentServiceObservableList ().addAll (services);    
	}
	 */


}
