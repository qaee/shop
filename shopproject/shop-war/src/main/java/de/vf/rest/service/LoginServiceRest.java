/**
 * 
 */
package de.vf.rest.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import de.vf.service.LoginSession;

/**
 * @author Ali.Qasim
 *
 */
@Path("login")
@Stateless
public class LoginServiceRest {

	@EJB
	LoginSession loginBean;

	@Inject
	CIDUserService cdi;
	
	@POST
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED)
	public String login(@FormParam("userName") String userName,
			@FormParam("password") String password) {
		loginBean.getUser().setPassword(password);
		loginBean.getUser().setUserName(userName);
		System.out.println(cdi.getUser().getName());
		return password;

	}

	@GET
	public String login() {
		return "Ok Get";
	}
}
