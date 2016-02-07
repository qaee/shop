package de.vf.muc;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import de.vf.dao.IPersonDao;
import de.vf.model.Person;

/**
 * Session Bean implementation class TestEjb
 */
@Stateless
public class TestEjb1{

	@EJB
	IPersonDao dao;
	
	public void addPerson(int i) {
		dao.add(createPerson(i));
	}
	
    private Person createPerson(int id) {
    	Person p = new Person();
    	p.setAddress("Beta strasse "+id);
    	p.setFirstName("qasim "+id);
    	p.setLastName("ali "+id);
    	p.setCity("unterfohring"+id);
    	return p;
    }
}
