package de.vf.service;

import javax.annotation.Resource;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.SessionContext;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import de.vf.model.Book;
/**
 * Session Bean implementation class FeatureProduct
 */
@Singleton
@Startup
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
public class FeatureBook  {


	
	@Resource
	SessionContext sc;
	
	@PersistenceContext(unitName = "db")
	EntityManager em;
	
	Book featuredBook;
	
    public  Book  getFeaturedBook() {
    	CriteriaBuilder cb = em.getCriteriaBuilder();
    	CriteriaQuery<Book> cq = cb.createQuery(Book.class); 
    	Root<Book> pet = cq.from(Book.class);
    	cq.select(pet);
    	TypedQuery<Book> q = em.createQuery(cq);
    	java.util.List<Book> resultList = q.getResultList();
    	featuredBook =  resultList.get(0);
    	return featuredBook;
    }
}
