package de.vf.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import de.vf.model.Person;

@Stateless
public class PersonDao implements IPersonDao {

	@PersistenceContext(unitName = "db")
	EntityManager em;

	@Override
	public void add(Person p) {
		em.persist(p);
	}

}
