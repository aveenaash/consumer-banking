package org.banco.consumer.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.banco.consumer.entities.CustomerEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomerRepository {

	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public CustomerEntity findById(long id) {
		return entityManager.find(CustomerEntity.class, id);
	}
	
	@Transactional
	public void update(CustomerEntity customerEntity) {
		entityManager.merge(customerEntity);
	}

}
