package de.vf.dao;

import javax.annotation.PostConstruct;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Model;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import de.vf.model.Book;

/**
 * Session Bean implementation class ProductDao
 */
@Stateless
@DeclareRoles({"admin","clerk"})
public class BookDao {

    @PersistenceContext(unitName = "db")
	EntityManager em;
    
    @PostConstruct
    private  void init() {
    	/*Book b = new Book();
    	b.setCategory(null);
    	b.setDescription("Book have been bought from amazon.com");
    	b.setTitle("Amazon Book");
    	em.persist(b);*/
    }
    
   // @RolesAllowed({"admin","clerk"})
    public Book getFeaturedProduct() {
    	CriteriaBuilder cb = em.getCriteriaBuilder();
    	CriteriaQuery<Book> cq = cb.createQuery(Book.class); 
    	Root<Book> pet = cq.from(Book.class);
    	cq.select(pet);
    	TypedQuery<Book> q = em.createQuery(cq);
    	java.util.List<Book> resultList = q.getResultList();
    	return resultList.get(0);
    }
}
