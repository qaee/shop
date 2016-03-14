package de.vf.view.login;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import de.vf.model.Book;
import de.vf.model.User;
import de.vf.service.FeatureBookLocal;
import de.vf.service.LoginSession;

@ManagedBean
@ViewScoped
public class LoginBean {
	
	private User user = new User();
	
	@EJB 
	LoginSession login;
	
	public void actionLogin() {
			login.setUser(user);
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Book getBook() {
		return new Book();
	}
}
