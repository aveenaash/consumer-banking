package org.banco.consumer.repositories;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.banco.consumer.entities.CustomerLoginEntity;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomerLoginRepository {

	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Transactional
	public void save(CustomerLoginEntity loginEntity) {
		entityManager.persist(loginEntity);
	}
	
	@Transactional
	public CustomerLoginEntity update(CustomerLoginEntity loginEntity) {
		return entityManager.merge(loginEntity);
	}

	public CustomerLoginEntity findByUsernameAndPassword(String username, String password) {
		Query query = (Query) entityManager.createQuery("select cl from CustomerLoginEntity cl where "
				+ "cl.userName = :username AND cl.password = :password ");
		query.setParameter("username", username);
		query.setParameter("password", password);
		try {
			return (CustomerLoginEntity) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}
