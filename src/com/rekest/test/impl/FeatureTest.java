package com.rekest.test.impl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import org.junit.Test;

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
		
		feat.creerUtilisateur(user);
		feat.desactiverUtilisateur(user);
		
		assertEquals(user.isEnable(), false);	
		feat.activerUtilisateur(user);
		
		assertEquals(user.isEnable(), true);
		
		feat.supprimerUtilisateur(user);
		
	}


	@Override
	@Test
	public void testListerProduits() {
		Produit obj  =  new Produit("testu");
		feat.creerProduit(obj);
		List<Produit> liste  = new ArrayList<Produit>();
		
		liste.add(obj);
		assertEquals( feat.listerProduits(),liste );
		
		feat.supprimerProduit(obj);
		
	}

	@Override
	@Test
	public void testListerProduits2() {
		
		Produit obj  =  new Produit("testu");
		feat.creerProduit(obj);
		List<Produit> liste  =  new ArrayList<Produit>();
		
		liste.add(obj);
		assertEquals( feat.listerProduits("WHERE nom = 'testu' "),liste );
		
		feat.supprimerProduit(obj);
		
	}

	@Override
	@Test
	public void testSupprimerProduit() {
		
		Produit obj  =  new Produit("testu");
		feat.creerProduit(obj);
		
		assertEquals( feat.rechercherProduit("WHERE nom = 'testu' "),obj );
		feat.supprimerProduit(obj);
		assertEquals( feat.rechercherProduit("WHERE nom = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierProduit() {
		Produit obj  =  new Produit("testu");
		feat.creerProduit(obj);
		
		obj.setNom("newname");
		feat.modifierProduit(obj);
		
		assertEquals( feat.rechercherProduit("WHERE nom = 'newname' "),obj );
		feat.supprimerProduit(obj);
		
	}

	@Override
	@Test
	public void testCreerProduit() {
		Produit obj  =  new Produit("testu");
		feat.creerProduit(obj);

		
		assertEquals( feat.rechercherProduit("WHERE nom = 'testu' "),obj );
		feat.supprimerProduit(obj);
	}

	@Override
	@Test
	public void testRechercherProduit() {
		Produit obj  =  new Produit("testu");
		feat.creerProduit(obj);

		
		assertEquals( feat.rechercherProduit("WHERE nom = 'testu' "),obj );
		feat.supprimerProduit(obj);
	}

	@Override
	@Test
	public void testRechercherProduitId() {
		Produit obj  =  new Produit("testu");
		feat.creerProduit(obj);

		
		assertEquals( feat.rechercherProduit(obj.getId()),obj );
		feat.supprimerProduit(obj);
	}

	@Override
	@Test
	public void testListerDemandes() {
		Demande obj  =  new Demande();
		obj.setEtat("testu");
		feat.creerDemande(obj);
		List<Demande> liste  =  new ArrayList<Demande>();
		
		liste.add(obj);
		assertEquals( feat.listerDemandes(),liste );
		
		feat.supprimerDemande(obj);
		
	}

	@Override
	@Test
	public void testListerDemandes2() {
		
		Demande obj  =  new Demande();
		obj.setEtat("testu");
		feat.creerDemande(obj);
		List<Demande> liste  =   new ArrayList<Demande>();
		
		liste.add(obj);
		assertEquals( feat.listerDemandes("WHERE etat = 'testu' "),liste );
		
		feat.supprimerDemande(obj);
		
	}

	@Override
	@Test
	public void testSupprimerDemande() {
		
		Demande obj  =  new Demande();
		obj.setEtat("testu");
		feat.creerDemande(obj);
		
		assertEquals( feat.rechercherDemande("WHERE etat = 'testu' "),obj );
		feat.supprimerDemande(obj);
		assertEquals( feat.rechercherDemande("WHERE etat = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierDemande() {
		Demande obj  =  new Demande();
		obj.setEtat("testu");
		feat.creerDemande(obj);
		
		obj.setEtat("newname");
		feat.modifierDemande(obj);
		
		assertEquals( feat.rechercherDemande("WHERE etat = 'newname' "),obj );
		feat.supprimerDemande(obj);
		
	}

	@Override
	@Test
	public void testCreerDemande() {
		Demande obj  =  new Demande();
		obj.setEtat("testu");
		feat.creerDemande(obj);

		
		assertEquals( feat.rechercherDemande(obj.getId()),obj );
		feat.supprimerDemande(obj);
	}

	@Override
	@Test
	public void testRechercherDemande() {
		Demande obj  =  new Demande();
		obj.setEtat("testu");
		feat.creerDemande(obj);

		
		assertEquals( feat.rechercherDemande("WHERE etat = 'testu' "),obj );
		feat.supprimerDemande(obj);
	}

	@Override
	@Test
	public void testRechercherDemandeId() {
		Demande obj  =  new Demande();
		obj.setEtat("testu");
		feat.creerDemande(obj);

		
		assertEquals( feat.rechercherDemande(obj.getId()),obj );
		feat.supprimerDemande(obj);
	}

	@Override
	@Test
	public void testListerDepartements() {
		Departement obj  =  new Departement("testu");
		feat.creerDepartement(obj);
		List<Departement> liste  =   new ArrayList<Departement>(); 
		
		liste.add(obj);
		assertEquals( feat.listerDepartements(),liste );
		
		feat.supprimerDepartement(obj);
		
	}

	@Override
	@Test
	public void testListerDepartements2() {
		
		Departement obj  =  new Departement("testu");
		feat.creerDepartement(obj);
		List<Departement> liste  =   new ArrayList<Departement>();  
		
		liste.add(obj);
		assertEquals( feat.listerDepartements("WHERE nom = 'testu' "),liste );
		
		feat.supprimerDepartement(obj);
		
	}

	@Override
	@Test
	public void testSupprimerDepartement() {
		
		Departement obj  =  new Departement("testu");
		feat.creerDepartement(obj);
		
		assertEquals( feat.rechercherDepartement("WHERE nom = 'testu' "),obj );
		feat.supprimerDepartement(obj);
		assertEquals( feat.rechercherDepartement("WHERE nom = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierDepartement() {
		Departement obj  =  new Departement("testu");
		feat.creerDepartement(obj);
		
		obj.setNom("newname");
		feat.modifierDepartement(obj);
		
		assertEquals( feat.rechercherDepartement("WHERE nom = 'newname' "),obj );
		feat.supprimerDepartement(obj);
		
	}

	@Override
	@Test
	public void testCreerDepartement() {
		Departement obj  =  new Departement("testu");
		feat.creerDepartement(obj);

		
		assertEquals( feat.rechercherDepartement("WHERE nom = 'testu' "),obj );
		feat.supprimerDepartement(obj);
	}

	@Override
	@Test
	public void testRechercherDepartement() {
		Departement obj  =  new Departement("testu");
		feat.creerDepartement(obj);

		
		assertEquals( feat.rechercherDepartement("WHERE nom = 'testu' "),obj );
		feat.supprimerDepartement(obj);
	}

	@Override
	@Test
	public void testRechercherDepartementId() {
		Departement obj  =  new Departement("testu");
		feat.creerDepartement(obj);

		
		assertEquals( feat.rechercherDepartement(obj.getId()),obj );
		feat.supprimerDepartement(obj);
	}

	@Override
	@Test
	public void testListerManagers() {
		Manager obj  =  new Manager("testu","testu","testu","testu");
		feat.creerManager(obj);
		List<Manager> liste  =   new ArrayList<Manager>();  
		
		liste.add(obj);
		assertEquals( feat.listerManagers(),liste );
		
		feat.supprimerManager(obj);
		
	}

	@Override
	@Test
	public void testListerManagers2() {
		
		Manager obj  =  new Manager("testu","testu","testu","testu");
		feat.creerManager(obj);
		List<Manager> liste  =  new ArrayList<Manager>();  
		
		liste.add(obj);
		assertEquals( feat.listerManagers("WHERE nom = 'testu' "),liste );
		
		feat.supprimerManager(obj);
		
	}

	@Override
	@Test
	public void testSupprimerManager() {
		
		Manager obj  =  new Manager("testu","testu","testu","testu");
		feat.creerManager(obj);
		
		assertEquals( feat.rechercherManager("WHERE nom = 'testu' "),obj );
		feat.supprimerManager(obj);
		assertEquals( feat.rechercherManager("WHERE nom = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierManager() {
		Manager obj  =  new Manager("testu","testu","testu","testu");
		feat.creerManager(obj);
		
		obj.setNom("newname");
		feat.modifierManager(obj);
		
		assertEquals( feat.rechercherManager("WHERE nom = 'newname' "),obj );
		feat.supprimerManager(obj);
		
	}

	@Override
	@Test
	public void testCreerManager() {
		Manager obj  =  new Manager("testu","testu","testu","testu");
		feat.creerManager(obj);

		
		assertEquals( feat.rechercherManager("WHERE nom = 'testu' "),obj );
		feat.supprimerManager(obj);
	}

	@Override
	@Test
	public void testRechercherManager() {
		Manager obj  =  new Manager("testu","testu","testu","testu");
		feat.creerManager(obj);

		
		assertEquals( feat.rechercherManager("WHERE nom = 'testu' "),obj );
		feat.supprimerManager(obj);
	}

	@Override
	@Test
	public void testRechercherManagerId() {
		Manager obj  =  new Manager("testu","testu","testu","testu");
		feat.creerManager(obj);

		
		assertEquals( feat.rechercherManager(obj.getId()),obj );
		feat.supprimerManager(obj);
	}

	@Override
	@Test
	public void testListerServices() {
		Service obj  =  new Service("testu");
		feat.creerService(obj);
		List<Service> liste  =  new ArrayList<Service>();  
		
		liste.add(obj);
		assertEquals( feat.listerServices(),liste );
		
		feat.supprimerService(obj);
		
	}

	@Override
	@Test
	public void testListerServices2() {
		
		Service obj  =  new Service("testu");
		feat.creerService(obj);
		List<Service> liste  =  new ArrayList<Service>();   
		
		liste.add(obj);
		assertEquals( feat.listerServices("WHERE nom = 'testu' "),liste );
		
		feat.supprimerService(obj);
		
	}

	@Override
	@Test
	public void testSupprimerService() {
		
		Service obj  =  new Service("testu");
		feat.creerService(obj);
		
		assertEquals( feat.rechercherService("WHERE nom = 'testu' "),obj );
		feat.supprimerService(obj);
		assertEquals( feat.rechercherService("WHERE nom = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierService() {
		Service obj  =  new Service("testu");
		feat.creerService(obj);
		
		obj.setNom("newname");
		feat.modifierService(obj);
		
		assertEquals( feat.rechercherService("WHERE nom = 'newname' "),obj );
		feat.supprimerService(obj);
		
		
	}

	@Override
	@Test
	public void testCreerService() {
		Service obj  =  new Service("testu");
		feat.creerService(obj);

		
		assertEquals( feat.rechercherService("WHERE nom = 'testu' "),obj );
		feat.supprimerService(obj);
	}

	@Override
	@Test
	public void testRechercherService() {
		Service obj  =  new Service("testu");
		feat.creerService(obj);

		
		assertEquals( feat.rechercherService("WHERE nom = 'testu' "),obj );
		feat.supprimerService(obj);
	}

	@Override
	@Test
	public void testRechercherServiceId() {
		Service obj  =  new Service("testu");
		feat.creerService(obj);

		
		assertEquals( feat.rechercherService(obj.getId()),obj );
		feat.supprimerService(obj);
	}

	@Override
	@Test
	public void testListerEmployes() {
		Employe obj  =  new Employe("testu","testu");
		feat.creerEmploye(obj);
		List<Employe> liste  = new ArrayList<Employe>();   ;
		
		liste.add(obj);
		assertEquals( feat.listerEmployes(),liste );
		
		feat.supprimerEmploye(obj);
		
	}

	@Override
	@Test
	public void testListerEmployes2() {
		
		Employe obj  =  new Employe("testu","testu");
		feat.creerEmploye(obj);
		List<Employe> liste  =  new ArrayList<Employe>();   ;
		
		liste.add(obj);
		assertEquals( feat.listerEmployes("WHERE nom = 'testu' "),liste );
		
		feat.supprimerEmploye(obj);
		
	}

	@Override
	@Test
	public void testSupprimerEmploye() {
		
		Employe obj  =  new Employe("testu","testu");
		feat.creerEmploye(obj);
		
		assertEquals( feat.rechercherEmploye("WHERE nom = 'testu' "),obj );
		feat.supprimerEmploye(obj);
		assertEquals( feat.rechercherEmploye("WHERE nom = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierEmploye() {
		Employe obj  =  new Employe("testu","testu");
		feat.creerEmploye(obj);
		
		obj.setNom("newname");
		feat.modifierEmploye(obj);
		
		assertEquals( feat.rechercherEmploye("WHERE nom = 'newname' "),obj );
		feat.supprimerEmploye(obj);
		
	}

	@Override
	@Test
	public void testCreerEmploye() {
		Employe obj  =  new Employe("testu","testu");
		feat.creerEmploye(obj);

		
		assertEquals( feat.rechercherEmploye("WHERE nom = 'testu' "),obj );
		feat.supprimerEmploye(obj);
	}

	@Override
	@Test
	public void testRechercherEmploye() {
		Employe obj  =  new Employe("testu","testu");
		feat.creerEmploye(obj);

		
		assertEquals( feat.rechercherEmploye("WHERE nom = 'testu' "),obj );
		feat.supprimerEmploye(obj);
	}

	@Override
	@Test
	public void testRechercherEmployeId() {
		Employe obj  =  new Employe("testu","testu");
		feat.creerEmploye(obj);

		
		assertEquals( feat.rechercherEmploye(obj.getId()),obj );
		feat.supprimerEmploye(obj);
	}

	@Override
	@Test
	public void testListerUtilisateurs() {
		Utilisateur obj  =  new Utilisateur("testu","testu");
		feat.creerUtilisateur(obj);
		List<Utilisateur> liste  =  new ArrayList<Utilisateur>();
		
		liste.add(obj);
		assertEquals( feat.listerUtilisateurs(),liste );
		
		feat.supprimerUtilisateur(obj);
		
	}

	@Override
	@Test
	public void testListerUtilisateurs2() {
		
		Utilisateur obj  =  new Utilisateur("testu","testu");
		feat.creerUtilisateur(obj);
		List<Utilisateur> liste  =   new ArrayList<Utilisateur>();
		
		liste.add(obj);
		assertEquals( feat.listerUtilisateurs("WHERE nom = 'testu' "),liste );
		
		feat.supprimerUtilisateur(obj);
		
	}

	@Override
	@Test
	public void testSupprimerUtilisateur() {
		
		Utilisateur obj  =  new Utilisateur("testu","testu");
		feat.creerUtilisateur(obj);
		
		assertEquals( feat.rechercherUtilisateur("WHERE nom = 'testu' "),obj );
		feat.supprimerUtilisateur(obj);
		assertEquals( feat.rechercherUtilisateur("WHERE nom = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierUtilisateur() {
		Utilisateur obj  =  new Utilisateur("testu","testu");
		feat.creerUtilisateur(obj);
		
		obj.setNom("newname");
		feat.modifierUtilisateur(obj);
		
		assertEquals( feat.rechercherUtilisateur("WHERE nom = 'newname' "),obj );
		feat.supprimerUtilisateur(obj);
		
	}

	@Override
	@Test
	public void testCreerUtilisateur() {
		Utilisateur obj  =  new Utilisateur("testu","testu");
		feat.creerUtilisateur(obj);

		
		assertEquals( feat.rechercherUtilisateur(obj.getId()),obj );
		feat.supprimerUtilisateur(obj);
	}

	@Override
	@Test
	public void testRechercherUtilisateur() {
		Utilisateur obj  =  new Utilisateur("testu","testu");
		feat.creerUtilisateur(obj);

		
		assertEquals( feat.rechercherUtilisateur("WHERE nom = 'testu' "),obj );
		feat.supprimerUtilisateur(obj);
	}

	@Override
	@Test
	public void testRechercherUtilisateurId() {
		Utilisateur obj  =  new Utilisateur("testu","testu");
		feat.creerUtilisateur(obj);

		
		assertEquals( feat.rechercherUtilisateur(obj.getId()),obj );
		feat.supprimerUtilisateur(obj);
	}

	@Override
	@Test
	public void testListerNotes() {
		Note obj  =  new Note("testu");
		feat.creerNote(obj);
		List<Note> liste  =   new ArrayList<Note>();
		
		liste.add(obj);
		assertEquals( feat.listerNotes(),liste );
		
		feat.supprimerNote(obj);
		
	}

	@Override
	@Test
	public void testListerNotes2() {
		
		Note obj  =  new Note("testu");
		feat.creerNote(obj);
		List<Note> liste  =   new ArrayList<Note>();
		
		liste.add(obj);
		assertEquals( feat.listerNotes("WHERE message = 'testu' "),liste );
		
		feat.supprimerNote(obj);
		
	}

	@Override
	@Test
	public void testSupprimerNote() {
		
		Note obj  =  new Note("testu");
		feat.creerNote(obj);
		System.err.println("Note ID ="+obj.getId());
		Note obj2 =  feat.rechercherNote("WHERE message = 'testu' ");
		assertEquals(obj2,obj );
		feat.supprimerNote(obj);
		
		obj2 =  feat.rechercherNote("WHERE message = 'testu' ");
		
		assertEquals( feat.rechercherNote("WHERE message = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierNote() {
		Note obj  =  new Note("testu");
		feat.creerNote(obj);
		
		obj.setMessage("newname");
		feat.modifierNote(obj);
		
		assertEquals( feat.rechercherNote("WHERE message = 'newname' "),obj );
		feat.supprimerNote(obj);
		
	}

	@Override
	@Test
	public void testCreerNote() {
		Note obj  =  new Note("testu");
		feat.creerNote(obj);

		
		assertEquals( feat.rechercherNote("WHERE message = 'testu' "),obj );
		feat.supprimerNote(obj);
	}

	@Override
	@Test
	public void testRechercherNote() {
		Note obj  =  new Note("testu");
		feat.creerNote(obj);
		
		assertEquals( feat.rechercherNote("WHERE message = 'testu' "),obj );
		feat.supprimerNote(obj);
	}

	@Override
	@Test
	public void testRechercherNoteId() {
		Note obj  =  new Note("testu");
		feat.creerNote(obj);
		System.out.println("Note id :"+obj.getId());
		assertEquals( feat.rechercherNote(obj.getId()),obj );
		feat.supprimerNote(obj);
	}

	@Override
	@Test
	public void testListerRoles() {
		Role obj  =  new Role("testu");
		feat.creerRole(obj);
		List<Role> liste  =   new ArrayList<Role>();
		
		liste.add(obj);
		assertEquals( feat.listerRoles(),liste );
		
		feat.supprimerRole(obj);
		
	}

	@Override
	@Test
	public void testListerRoles2() {
		
		Role obj  =  new Role("testu");
		feat.creerRole(obj);
		List<Role> liste  =   new ArrayList<Role>();
		
		liste.add(obj);
		assertEquals( feat.listerRoles("WHERE intitule = 'testu' "),liste );
		
		feat.supprimerRole(obj);
		
	}

	@Override
	@Test
	public void testSupprimerRole() {
		
		Role obj  =  new Role("testu");
		feat.creerRole(obj);
		
		assertEquals( feat.rechercherRole("WHERE intitule = 'testu' ").getIntitule(),obj.getIntitule() );
		feat.supprimerRole(obj);
		assertEquals( feat.rechercherRole("WHERE intitule = 'testu' "),null );
		
		
		
	}

	@Override
	@Test
	public void testModifierRole() {
		Role obj  =  new Role("testu");
		feat.creerRole(obj);
		
		obj.setIntitule("newname");
		feat.modifierRole(obj);
		
		assertEquals( feat.rechercherRole("WHERE intitule = 'newname' "),obj );
		feat.supprimerRole(obj);
		
	}

	@Override
	@Test
	public void testCreerRole() {
		Role obj  =  new Role("testu");
		feat.creerRole(obj);

		
		assertEquals( feat.rechercherRole("WHERE intitule = 'testu' "),obj );
		feat.supprimerRole(obj);
	}

	@Override
	@Test
	public void testRechercherRole() {
		Role obj  =  new Role("testu");
		feat.creerRole(obj);

		
		assertEquals( feat.rechercherRole("WHERE intitule = 'testu' "),obj );
		feat.supprimerRole(obj);
	}

	@Override
	@Test
	public void testRechercherRoleId() {
		Role obj  =  new Role("testu");
		feat.creerRole(obj);

		
		assertEquals( feat.rechercherRole(obj.getId()),obj );
		feat.supprimerRole(obj);
	}

	@Override
	@Test
	public void testLoadProduitsObservableList() {
		
		
	}

	@Override
	@Test
	public void testLoadDemandesObservableList() {
		feat.creerDemande( new Demande());
		assertEquals(feat.OLDemande.getData(), feat.listerDemandes());
		
		feat.supprimerDemande(feat.listerDemandes().get(0));
	}

	@Override
	@Test
	public void testLoadEmployesObservableList() {
		
		feat.creerEmploye( new Employe());
		assertEquals(feat.OLEmploye.getData(), feat.listerEmployes());
		
		feat.supprimerEmploye(feat.listerEmployes().get(0));
	}

	@Override
	@Test
	public void testLoadRolesObservableList() {
		
		feat.creerRole( new Role());
		assertEquals(feat.OLRole.getData(), feat.listerRoles());
		
		feat.supprimerRole(feat.listerRoles().get(0));
	}

	@Override
	@Test
	public void testLoadServicesObservableList() {
		
		feat.creerService( new Service());
		assertEquals(feat.OLService.getData(), feat.listerServices());
		
		feat.supprimerService(feat.listerServices().get(0));
	}

	@Override
	@Test
	public void testLoadDepartementsObservableList() {
		feat.creerDepartement( new Departement());
		assertEquals(feat.OLDepartement.getData(), feat.listerDepartements());
		
		feat.supprimerDepartement(feat.listerDepartements().get(0));
		
	}

	@Override
	public void testLoadUtilisateursObservableList() {
		feat.creerUtilisateur( new Utilisateur());
		assertEquals(feat.OLUtilisateur.getData(), feat.listerUtilisateurs());
		
		feat.supprimerUtilisateur(feat.listerUtilisateurs().get(0));
		
	}


	@Override
	public void testLoadManagersObservableList() {
		feat.creerManager( new Manager());
		assertEquals(feat.OLManager.getData(), feat.listerManagers());
		
		feat.supprimerManager(feat.listerManagers().get(0));
		
	}


	@Override
	public void testLoadNotesObservableList() {
		feat.creerNote( new Note());
		assertEquals(feat.OLNote.getData(), feat.listerNotes());
		
		feat.supprimerNote(feat.listerNotes().get(0));
		
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
		feat.creerManager(obj);
		
		assertEquals( (Manager) feat.validerIdentifiants("testlogin","testpass"), obj);
		feat.supprimerManager(obj);
		
	}

	@Override
	@Test
	public void testRepondreDemande() {
		Demande obj = new Demande();
		
		feat.repondreDemande(obj, "accepte" );
		;
		assertEquals(feat.rechercherDemande(obj.getId()).getEtat(), "accepte"  );
		feat.supprimerDemande(obj);
	}

	@Override
	@Test
	public void testAssocierService() {
		Employe obj1 = new Employe();
		Service obj2 = new Service();
		
		feat.creerEmploye(obj1);
		feat.creerService(obj2);
		
		feat.associerService(obj1, obj2);
		
		feat.modifierEmploye(obj1);
		feat.modifierService(obj2);
			
		assertEquals(feat.rechercherService(obj2.getId()).getEmployes().get(0), obj1);
		
		feat.supprimerEmploye(obj1);
		feat.supprimerService(obj2);
	}


}
