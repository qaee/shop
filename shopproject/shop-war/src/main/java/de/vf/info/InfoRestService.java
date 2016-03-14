package de.vf.info;


import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.vf.service.BookService;
import de.vf.service.BookServiceLocal;

@Path("info")
@Stateless
public class InfoRestService {
	@EJB
	BookServiceLocal b;
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response info() {
		Info info = new Info();
		System.out.println("''''''''''''''''   "+b);
		try {
			
			Class<?> forName = Class.forName("de.vf.service.BookServiceLocal");
			System.out.println(forName);
			Context c = new InitialContext();
			BookServiceLocal bookService = (BookServiceLocal)c.lookup("java:app/shop-ejb-0.0.0.1-SNAPSHOT/BookService!de.vf.service.BookServiceLocal");
			System.out.println("calling method");
			bookService.readBook();
		//	c.lookup("LoginSession");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.ok().entity(info).build();
	}
}
