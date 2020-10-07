package com.ensup.demojpamanytoone;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domaine.Formation;
import domaine.Lieu;

public class DemoJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Lieu lieu = new Lieu("Objis","57 rue d'Amsterdam, 75008 Paris");
		Formation formation = new Formation("JPA",new Date(),3,lieu);
		//Formation formation = em.getReference(Formation.class,1L);
		//Lieu lieu = formation.getLieu();
		
		System.out.println("La formation "+ formation.getTheme()+ " va se dérouler à "+lieu.getNom()+", " + lieu.getAdresse());
		
		em.persist(formation);
		
		tx.commit();
		
		em.close();
		emf.close();
	}

}
