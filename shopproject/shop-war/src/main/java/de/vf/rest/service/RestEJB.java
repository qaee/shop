package de.vf.rest.service;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.EJBContext;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import de.vf.dao.IPersonDao;
import de.vf.muc.TestEjb1;
import de.vf.service.LoginSession;
import de.vf.service.TestE;





/**
 * Session Bean implementation class RestEJB
 */
@Stateless
@Path("myrest")
public class RestEJB {

	@Inject
	CIDUserService service;
	
	@EJB
	IPersonDao dao; 
	
	@EJB
	TestEjb1 ejb1;
	@EJB
	TestE r;
	@EJB
	LoginSession loginBean;
	@Resource
	SessionContext sc;
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "Test =  : " + msg;
		
		/*ejb1.addPerson(999);
	*/
		r.sayHello();
		r.sayNoInterfaceHello();
	/*	System.out.println(loginBean.getUser().getPassword());
		System.out.println("Java = "+service.getUser().getName());*/
		
		try {
			System.out.println(sc.getEJBHome());
		}catch(Exception e) {
			System.out.println("1");
		}
		try {
			System.out.println(sc.getEJBLocalHome());
		}catch(Exception e) {
			System.out.println("2");
		}
		try {
			System.out.println(sc.getEJBLocalObject());
		}catch(Exception e) {
			System.out.println("3");
		}
		try {
			System.out.println(sc.getEJBObject());
		}catch(Exception e) {
			System.out.println("4");
		}
			
		/*
		System.out.println(sc.getContextData());                              
		System.out.println(sc.get);
		System.out.println();
		System.out.println();
		System.out.println();*/
		
		
		return Response.status(200).entity(output).build();

	}
}
