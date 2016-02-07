package de.vf.view.home;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import de.vf.service.LoginSession;

@ManagedBean
@SessionScoped
public class WelcomeBean {
	
	@EJB
	LoginSession login;
	
	public void actionWelcome() {
		System.out.println(login.getUser().getUserName());
	}
	
	public String getUserName() {
		System.out.println(login.getUser().getUserName());
		return login.getUser().getUserName();
	}
}
