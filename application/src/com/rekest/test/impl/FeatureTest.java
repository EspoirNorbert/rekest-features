package com.rekest.test.impl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.rekest.entities.Demande;
import com.rekest.entities.Departement;
import com.rekest.entities.Note;
import com.rekest.entities.Produit;
import com.rekest.entities.Role;
import com.rekest.entities.Service;
import com.rekest.entities.employes.Employe;
import com.rekest.entities.employes.Manager;
import com.rekest.entities.employes.Utilisateur;
import com.rekest.feature.impl.Feature;
import com.rekest.test.IFeatureTests;

public class FeatureTest implements IFeatureTests {

	private Feature feat  =   Feature.getCurrentInstance();
	

	@Override
	@Test
	public void testActiverDesactiverUtilisateur() {
		Utilisateur user  =  new Utilisateur("testu","testu");
		
		feat.createUtilisateur(user);
		feat.enableUtilisateur(user);
		
		assertEquals(user.isEnable(), false);	
		feat.disableUtilisateur(user);
		
		assertEquals(user.isEnable(), true);
		
		feat.deleteUtilisateur(user);
		
	}


	@Override
	@Test
	public void testListerProduits() {
		Produit obj  =  new Produit("testu");
		feat.createProduit(obj);
		List<Produit> liste  = new ArrayList<Produit>();
		
		liste.add(obj);
		assertEquals( feat.listProduits(),liste );
		
		feat.deleteProduit(obj);
		
	}

	@Override
	@Test
	public void testListerProduits2() {
		
		Produit obj  =  new Produit("testu");
		feat.createProduit(obj);
		List<Produit> liste  =  new ArrayList<Produit>();
		
		liste.add(obj);
		assertEquals( feat.listProduits("WHERE nom = 'testu' "),liste );
		
		feat.deleteProduit(obj);
		
	}

	@Override
	@Test
	public void testSupprimerProduit() {
		
		Produit obj  =  new Produit("testu");
		feat.createProduit(obj);
		
		assertEquals( feat.findProduit("WHERE nom = 'testu' "),obj );
		feat.deleteProduit(obj);
		assertEquals( feat.findProduit("WHERE nom = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierProduit() {
		Produit obj  =  new Produit("testu");
		feat.createProduit(obj);
		
		obj.setNom("newname");
		feat.updateProduit(obj);
		
		assertEquals( feat.findProduit("WHERE nom = 'newname' "),obj );
		feat.deleteProduit(obj);
		
	}

	@Override
	@Test
	public void testCreerProduit() {
		Produit obj  =  new Produit("testu");
		feat.createProduit(obj);

		
		assertEquals( feat.findProduit("WHERE nom = 'testu' "),obj );
		feat.deleteProduit(obj);
	}

	@Override
	@Test
	public void testRechercherProduit() {
		Produit obj  =  new Produit("testu");
		feat.createProduit(obj);

		
		assertEquals( feat.findProduit("WHERE nom = 'testu' "),obj );
		feat.deleteProduit(obj);
	}

	@Override
	@Test
	public void testRechercherProduitId() {
		Produit obj  =  new Produit("testu");
		feat.createProduit(obj);

		
		assertEquals( feat.findProduit(obj.getId()),obj );
		feat.deleteProduit(obj);
	}

	@Override
	@Test
	public void testListerDemandes() {
		Demande obj  =  new Demande();
		obj.setEtat("testu");
		feat.createDemande(obj);
		List<Demande> liste  =  new ArrayList<Demande>();
		
		liste.add(obj);
		assertEquals( feat.listDemandes(),liste );
		
		feat.deleteDemande(obj);
		
	}

	@Override
	@Test
	public void testListerDemandes2() {
		
		Demande obj  =  new Demande();
		obj.setEtat("testu");
		feat.createDemande(obj);
		List<Demande> liste  =   new ArrayList<Demande>();
		
		liste.add(obj);
		assertEquals( feat.listDemandes("WHERE etat = 'testu' "),liste );
		
		feat.deleteDemande(obj);
		
	}

	@Override
	@Test
	public void testSupprimerDemande() {
		
		Demande obj  =  new Demande();
		obj.setEtat("testu");
		feat.createDemande(obj);
		
		assertEquals( feat.findDemande("WHERE etat = 'testu' "),obj );
		feat.deleteDemande(obj);
		assertEquals( feat.findDemande("WHERE etat = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierDemande() {
		Demande obj  =  new Demande();
		obj.setEtat("testu");
		feat.createDemande(obj);
		
		obj.setEtat("newname");
		feat.updateDemande(obj);
		
		assertEquals( feat.findDemande("WHERE etat = 'newname' "),obj );
		feat.deleteDemande(obj);
		
	}

	@Override
	@Test
	public void testCreerDemande() {
		Demande obj  =  new Demande();
		obj.setEtat("testu");
		feat.createDemande(obj);

		
		assertEquals( feat.findDemande(obj.getId()),obj );
		feat.deleteDemande(obj);
	}

	@Override
	@Test
	public void testRechercherDemande() {
		Demande obj  =  new Demande();
		obj.setEtat("testu");
		feat.createDemande(obj);

		
		assertEquals( feat.findDemande("WHERE etat = 'testu' "),obj );
		feat.deleteDemande(obj);
	}

	@Override
	@Test
	public void testRechercherDemandeId() {
		Demande obj  =  new Demande();
		obj.setEtat("testu");
		feat.createDemande(obj);

		
		assertEquals( feat.findDemande(obj.getId()),obj );
		feat.deleteDemande(obj);
	}

	@Override
	@Test
	public void testListerDepartements() {
		Departement obj  =  new Departement("testu");
		feat.createDepartement(obj);
		List<Departement> liste  =   new ArrayList<Departement>(); 
		
		liste.add(obj);
		assertEquals( feat.listDepartements(),liste );
		
		feat.deleteDepartement(obj);
		
	}

	@Override
	@Test
	public void testListerDepartements2() {
		
		Departement obj  =  new Departement("testu");
		feat.createDepartement(obj);
		List<Departement> liste  =   new ArrayList<Departement>();  
		
		liste.add(obj);
		assertEquals( feat.listDepartements("WHERE nom = 'testu' "),liste );
		
		feat.deleteDepartement(obj);
		
	}

	@Override
	@Test
	public void testSupprimerDepartement() {
		
		Departement obj  =  new Departement("testu");
		feat.createDepartement(obj);
	
		

		assertEquals( feat.findDepartement("WHERE nom = 'testu' "),obj );
		feat.deleteDepartement(obj);
		assertEquals( feat.findDepartement("WHERE nom = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierDepartement() {
		Departement obj  =  new Departement("testu");
		feat.createDepartement(obj);
		
		obj.setNom("newname");
		feat.updateDepartement(obj);
		
		assertEquals( feat.findDepartement("WHERE nom = 'newname' "),obj );
		feat.deleteDepartement(obj);
		
	}

	@Override
	@Test
	public void testCreerDepartement() {
		Departement obj  =  new Departement("testu");
		feat.createDepartement(obj);

		
		assertEquals( feat.findDepartement("WHERE nom = 'testu' "),obj );
		feat.deleteDepartement(obj);
	}

	@Override
	@Test
	public void testRechercherDepartement() {
		Departement obj  =  new Departement("testu");
		feat.createDepartement(obj);

		
		assertEquals( feat.findDepartement("WHERE nom = 'testu' "),obj );
		feat.deleteDepartement(obj);
	}

	@Override
	@Test
	public void testRechercherDepartementId() {
		Departement obj  =  new Departement("testu");
		feat.createDepartement(obj);

		
		assertEquals( feat.findDepartement(obj.getId()),obj );
		feat.deleteDepartement(obj);
	}

	@Override
	@Test
	public void testListerManagers() {
		Manager obj  =  new Manager("testu","testu","testu","testu");
		feat.createManager(obj);
		List<Manager> liste  =   new ArrayList<Manager>();  
		
		liste.add(obj);
		assertEquals( feat.listManagers(),liste );
		
		feat.deleteManager(obj);
		
	}

	@Override
	@Test
	public void testListerManagers2() {
		
		Manager obj  =  new Manager("testu","testu","testu","testu");
		feat.createManager(obj);
		List<Manager> liste  =  new ArrayList<Manager>();  
		
		liste.add(obj);
		assertEquals( feat.listManagers("WHERE nom = 'testu' "),liste );
		
		feat.deleteManager(obj);
		
	}

	@Override
	@Test
	public void testSupprimerManager() {
		
		Manager obj  =  new Manager("testu","testu","testu","testu");
		feat.createManager(obj);
		
		assertEquals( feat.findManager("WHERE nom = 'testu' "),obj );
		feat.deleteManager(obj);
		assertEquals( feat.findManager("WHERE nom = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierManager() {
		Manager obj  =  new Manager("testu","testu","testu","testu");
		feat.createManager(obj);
		
		obj.setNom("newname");
		feat.updateManager(obj);
		
		assertEquals( feat.findManager("WHERE nom = 'newname' "),obj );
		feat.deleteManager(obj);
		
	}

	@Override
	@Test
	public void testCreerManager() {
		Manager obj  =  new Manager("testu","testu","testu","testu");
		feat.createManager(obj);

		
		assertEquals( feat.findManager("WHERE nom = 'testu' "),obj );
		feat.deleteManager(obj);
	}

	@Override
	@Test
	public void testRechercherManager() {
		Manager obj  =  new Manager("testu","testu","testu","testu");
		feat.createManager(obj);

		
		assertEquals( feat.findManager("WHERE nom = 'testu' "),obj );
		feat.deleteManager(obj);
	}

	@Override
	@Test
	public void testRechercherManagerId() {
		Manager obj  =  new Manager("testu","testu","testu","testu");
		feat.createManager(obj);

		
		assertEquals( feat.findManager(obj.getId()),obj );
		feat.deleteManager(obj);
	}

	@Override
	@Test
	public void testListerServices() {
		Service obj  =  new Service("testu");
		feat.createService(obj);
		List<Service> liste  =  new ArrayList<Service>();  
		
		liste.add(obj);
		assertEquals( feat.listServices(),liste );
		
		feat.deleteService(obj);
		
	}

	@Override
	@Test
	public void testListerServices2() {
		
		Service obj  =  new Service("testu");
		feat.createService(obj);
		List<Service> liste  =  new ArrayList<Service>();   
		
		liste.add(obj);
		assertEquals( feat.listServices("WHERE nom = 'testu' "),liste );
		
		feat.deleteService(obj);
		
	}

	@Override
	@Test
	public void testSupprimerService() {
		
		Service obj  =  new Service("testu");
		feat.createService(obj);
		
		
		Utilisateur user = new Utilisateur("nom","prenom");
		feat.createUtilisateur(user);
		feat.associateService(user, obj);
		

		assertEquals( feat.findService("WHERE nom = 'testu' "),obj );
		feat.deleteService(obj);
		
		
		
		for (Employe emp : feat.getObservableListEmploye().getData()) {
			System.out.println("L'employe pose blem"+emp);
			assertFalse(true);
		}
		
		assertEquals( feat.findService("WHERE nom = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierService() {
		Service obj  =  new Service("testu");
		feat.createService(obj);
		
		obj.setNom("newname");
		feat.updateService(obj);
		
		assertEquals( feat.findService("WHERE nom = 'newname' "),obj );
		feat.deleteService(obj);
		
		
	}

	@Override
	@Test
	public void testCreerService() {
		Service obj  =  new Service("testu");
		feat.createService(obj);

		
		assertEquals( feat.findService("WHERE nom = 'testu' "),obj );
		feat.deleteService(obj);
	}

	@Override
	@Test
	public void testRechercherService() {
		Service obj  =  new Service("testu");
		feat.createService(obj);

		
		assertEquals( feat.findService("WHERE nom = 'testu' "),obj );
		feat.deleteService(obj);
	}

	@Override
	@Test
	public void testRechercherServiceId() {
		Service obj  =  new Service("testu");
		feat.createService(obj);

		
		assertEquals( feat.findService(obj.getId()),obj );
		feat.deleteService(obj);
	}

	@Override
	@Test
	public void testListerEmployes() {
		Employe obj  =  new Employe("testu","testu");
		feat.createEmploye(obj);
		List<Employe> liste  = new ArrayList<Employe>();   ;
		
		liste.add(obj);
		assertEquals( feat.listEmployes(),liste );
		
		feat.deleteEmploye(obj);
		
	}

	@Override
	@Test
	public void testListerEmployes2() {
		
		Employe obj  =  new Employe("testu","testu");
		feat.createEmploye(obj);
		List<Employe> liste  =  new ArrayList<Employe>();   ;
		
		liste.add(obj);
		assertEquals( feat.listEmployes("WHERE nom = 'testu' "),liste );
		
		feat.deleteEmploye(obj);
		
	}

	@Override
	@Test
	public void testSupprimerEmploye() {
		
		Employe obj  =  new Employe("testu","testu");
		feat.createEmploye(obj);
		
		assertEquals( feat.findEmploye("WHERE nom = 'testu' "),obj );
		feat.deleteEmploye(obj);
		assertEquals( feat.findEmploye("WHERE nom = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierEmploye() {
		Employe obj  =  new Employe("testu","testu");
		feat.createEmploye(obj);
		
		obj.setNom("newname");
		feat.updateEmploye(obj);
		
		assertEquals( feat.findEmploye("WHERE nom = 'newname' "),obj );
		feat.deleteEmploye(obj);
		
	}

	@Override
	@Test
	public void testCreerEmploye() {
		Employe obj  =  new Employe("testu","testu");
		feat.createEmploye(obj);

		
		assertEquals( feat.findEmploye("WHERE nom = 'testu' "),obj );
		feat.deleteEmploye(obj);
	}

	@Override
	@Test
	public void testRechercherEmploye() {
		Employe obj  =  new Employe("testu","testu");
		feat.createEmploye(obj);

		
		assertEquals( feat.findEmploye("WHERE nom = 'testu' "),obj );
		feat.deleteEmploye(obj);
	}

	@Override
	@Test
	public void testRechercherEmployeId() {
		Employe obj  =  new Employe("testu","testu");
		feat.createEmploye(obj);

		
		assertEquals( feat.findEmploye(obj.getId()),obj );
		feat.deleteEmploye(obj);
	}

	@Override
	@Test
	public void testListerUtilisateurs() {
		Utilisateur obj  =  new Utilisateur("testu","testu");
		feat.createUtilisateur(obj);
		List<Utilisateur> liste  =  new ArrayList<Utilisateur>();
		
		liste.add(obj);
		assertEquals( feat.listUtilisateurs(),liste );
		
		feat.deleteUtilisateur(obj);
		
	}

	@Override
	@Test
	public void testListerUtilisateurs2() {
		
		Utilisateur obj  =  new Utilisateur("testu","testu");
		feat.createUtilisateur(obj);
		List<Utilisateur> liste  =   new ArrayList<Utilisateur>();
		
		liste.add(obj);
		assertEquals( feat.listUtilisateurs("WHERE nom = 'testu' "),liste );
		
		feat.deleteUtilisateur(obj);
		
	}

	@Override
	@Test
	public void testSupprimerUtilisateur() {
		
		Utilisateur obj  =  new Utilisateur("testu","testu");
		feat.createUtilisateur(obj);
		
		assertEquals( feat.findUtilisateur("WHERE nom = 'testu' "),obj );
		feat.deleteUtilisateur(obj);
		assertEquals( feat.findUtilisateur("WHERE nom = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierUtilisateur() {
		Utilisateur obj  =  new Utilisateur("testu","testu");
		feat.createUtilisateur(obj);
		
		obj.setNom("newname");
		feat.updateUtilisateur(obj);
		
		assertEquals( feat.findUtilisateur("WHERE nom = 'newname' "),obj );
		feat.deleteUtilisateur(obj);
		
	}

	@Override
	@Test
	public void testCreerUtilisateur() {
		Utilisateur obj  =  new Utilisateur("testu","testu");
		feat.createUtilisateur(obj);

		
		assertEquals( feat.findUtilisateur(obj.getId()),obj );
		feat.deleteUtilisateur(obj);
	}

	@Override
	@Test
	public void testRechercherUtilisateur() {
		Utilisateur obj  =  new Utilisateur("testu","testu");
		feat.createUtilisateur(obj);

		
		assertEquals( feat.findUtilisateur("WHERE nom = 'testu' "),obj );
		feat.deleteUtilisateur(obj);
	}

	@Override
	@Test
	public void testRechercherUtilisateurId() {
		Utilisateur obj  =  new Utilisateur("testu","testu");
		feat.createUtilisateur(obj);

		
		assertEquals( feat.findUtilisateur(obj.getId()),obj );
		feat.deleteUtilisateur(obj);
	}

	@Override
	@Test
	public void testListerNotes() {
		Note obj  =  new Note("testu");
		feat.createNote(obj);
		List<Note> liste  =   new ArrayList<Note>();
		
		liste.add(obj);
		assertEquals( feat.listNotes(),liste );
		
		feat.deleteNote(obj);
		
	}

	@Override
	@Test
	public void testListerNotes2() {
		
		Note obj  =  new Note("testu");
		feat.createNote(obj);
		List<Note> liste  =   new ArrayList<Note>();
		
		liste.add(obj);
		assertEquals( feat.listNotes("WHERE message = 'testu' "),liste );
		
		feat.deleteNote(obj);
		
	}

	@Override
	@Test
	public void testSupprimerNote() {
		
		Note obj  =  new Note("testu");
		feat.createNote(obj);
		System.err.println("Note ID ="+obj.getId());
		Note obj2 =  feat.findNote("WHERE message = 'testu' ");
		assertEquals(obj2,obj );
		feat.deleteNote(obj);
		
		obj2 =  feat.findNote("WHERE message = 'testu' ");
		
		assertEquals( feat.findNote("WHERE message = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierNote() {
		Note obj  =  new Note("testu");
		feat.createNote(obj);
		
		obj.setMessage("newname");
		feat.updateNote(obj);
		
		assertEquals( feat.findNote("WHERE message = 'newname' "),obj );
		feat.deleteNote(obj);
		
	}

	@Override
	@Test
	public void testCreerNote() {
		Note obj  =  new Note("testu");
		feat.createNote(obj);

		
		assertEquals( feat.findNote("WHERE message = 'testu' "),obj );
		feat.deleteNote(obj);
	}

	@Override
	@Test
	public void testRechercherNote() {
		Note obj  =  new Note("testu");
		feat.createNote(obj);
		
		assertEquals( feat.findNote("WHERE message = 'testu' "),obj );
		feat.deleteNote(obj);
	}

	@Override
	@Test
	public void testRechercherNoteId() {
		Note obj  =  new Note("testu");
		feat.createNote(obj);
		System.out.println("Note id :"+obj.getId());
		assertEquals( feat.findNote(obj.getId()),obj );
		feat.deleteNote(obj);
	}

	@Override
	@Test
	public void testListerRoles() {
		Role obj  =  new Role("testu");
		feat.createRole(obj);
		List<Role> liste  =   new ArrayList<Role>();
		
		liste.add(obj);
		assertEquals( feat.listRoles(),liste );
		
		feat.deleteRole(obj);
		
	}

	@Override
	@Test
	public void testListerRoles2() {
		
		Role obj  =  new Role("testu");
		feat.createRole(obj);
		List<Role> liste  =   new ArrayList<Role>();
		
		liste.add(obj);
		assertEquals( feat.listRoles("WHERE intitule = 'testu' "),liste );
		
		feat.deleteRole(obj);
		
	}

	@Override
	@Test
	public void testSupprimerRole() {
		
		Role obj  =  new Role("testu");
		feat.createRole(obj);
		
		assertEquals( feat.findRole("WHERE intitule = 'testu' ").getIntitule(),obj.getIntitule() );
		feat.deleteRole(obj);
		assertEquals( feat.findRole("WHERE intitule = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierRole() {
		Role obj  =  new Role("testu");
		feat.createRole(obj);
		
		obj.setIntitule("newname");
		feat.updateRole(obj);
		
		assertEquals( feat.findRole("WHERE intitule = 'newname' "),obj );
		feat.deleteRole(obj);
		
	}

	@Override
	@Test
	public void testCreerRole() {
		Role obj  =  new Role("testu");
		feat.createRole(obj);

		
		assertEquals( feat.findRole("WHERE intitule = 'testu' "),obj );
		feat.deleteRole(obj);
	}

	@Override
	@Test
	public void testRechercherRole() {
		Role obj  =  new Role("testu");
		feat.createRole(obj);

		
		assertEquals( feat.findRole("WHERE intitule = 'testu' "),obj );
		feat.deleteRole(obj);
	}

	@Override
	@Test
	public void testRechercherRoleId() {
		Role obj  =  new Role("testu");
		feat.createRole(obj);

		
		assertEquals( feat.findRole(obj.getId()),obj );
		feat.deleteRole(obj);
	}

	@Override
	@Test
	public void testLoadProduitsObservableList() {
		
		
	}

	@Override
	@Test
	public void testLoadDemandesObservableList() {
		feat.createDemande( new Demande());
		assertEquals(feat.getObservableListDemande().getData(), feat.listDemandes());
		
		feat.deleteDemande(feat.listDemandes().get(0));
	}

	@Override
	@Test
	public void testLoadEmployesObservableList() {
		
		feat.createEmploye( new Employe());
		assertEquals(feat.getObservableListEmploye().getData(), feat.listEmployes());
		
		feat.deleteEmploye(feat.listEmployes().get(0));
	}

	@Override
	@Test
	public void testLoadRolesObservableList() {
		
		feat.createRole( new Role());
		assertEquals(feat.getObservableListRole().getData(), feat.listRoles());
		
		feat.deleteRole(feat.listRoles().get(0));
	}

	@Override
	@Test
	public void testLoadServicesObservableList() {
		
		feat.createService( new Service());
		assertEquals(feat.getObservableListService().getData(), feat.listServices());
		
		feat.deleteService(feat.listServices().get(0));
	}

	@Override
	@Test
	public void testLoadDepartementsObservableList() {
		feat.createDepartement( new Departement());
		assertEquals(feat.getObservableListDepartement().getData(), feat.listDepartements());
		
		feat.deleteDepartement(feat.listDepartements().get(0));
		
	}

	@Override
	public void testLoadUtilisateursObservableList() {
		feat.createUtilisateur( new Utilisateur());
		assertEquals(feat.getObservableListUtilisateur().getData(), feat.listUtilisateurs());
		
		feat.deleteUtilisateur(feat.listUtilisateurs().get(0));
		
	}


	@Override
	public void testLoadManagersObservableList() {
		feat.createManager( new Manager());
		assertEquals(feat.getObservableListManager().getData(), feat.listManagers());
		
		feat.deleteManager(feat.listManagers().get(0));
		
	}


	@Override
	public void testLoadNotesObservableList() {
		feat.createNote( new Note());
		assertEquals(feat.getObservableListNote().getData(), feat.listNotes());
		
		feat.deleteNote(feat.listNotes().get(0));
		
	}


	@Override
	@Test
	public void loadDemandesByServiceObservableList() {

		
	}

	@Override
	@Test
	public void testLoadDemandesByDirectionObservableList() {
		
		
	}

	@Override
	@Test
	public void testValiderIdentifiants() {
		Manager obj = new Manager("testu","testu","testlogin","testpass");
		feat.createManager(obj);
		
		assertEquals( (Manager) feat.validateCredential("testlogin","testpass"), obj);
		feat.deleteManager(obj);
		
	}

	@Override
	@Test
	public void testRepondreDemande() {
		Demande obj = new Demande();
		
		feat.requestDemande(obj, "accepte" );
		;
		assertEquals(feat.findDemande(obj.getId()).getEtat(), "accepte"  );
		feat.deleteDemande(obj);
	}

	@Override
	@Test
	public void testAssocierService() {
		Employe obj1 = new Employe();
		Service obj2 = new Service();
		
		feat.createEmploye(obj1);
		feat.createService(obj2);
		
		feat.associateService(obj1, obj2);
		
		feat.updateEmploye(obj1);
		feat.updateService(obj2);
			
		assertEquals(feat.findService(obj2.getId()), obj1);
		
		feat.deleteEmploye(obj1);
		feat.deleteService(obj2);
	}


}
