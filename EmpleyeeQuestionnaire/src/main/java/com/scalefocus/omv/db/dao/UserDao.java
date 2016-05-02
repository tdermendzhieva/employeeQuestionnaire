package com.scalefocus.omv.db.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.scalefocus.omv.db.model.User;

@Component
public class UserDao {

//	// Injected database connection:
//	@PersistenceContext
//	private EntityManager em;
//
//	public EntityManager getEntityManager() {
//		return em;
//	}
//
//	public void setEntityManager(EntityManager entityManager) {
//		this.em = entityManager;
//	}
	@PersistenceContext
	private EntityManagerFactory emf;

	// Stores a new guest:
	@Transactional
	public void persist(User user) {
		System.out.println("TBD in persist " + user.toString());
		EntityManager em = emf.createEntityManager();
		em.persist(user);
	}

	// Retrieves all the guests:
	public List<User> getAllUserts() {
		EntityManager em = emf.createEntityManager();
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u ORDER BY u.id", User.class);
		
		return query.getResultList();
	}

}
