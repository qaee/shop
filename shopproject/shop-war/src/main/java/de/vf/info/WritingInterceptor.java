package de.vf.info;

import java.io.IOException;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;
@Provider
public class WritingInterceptor implements WriterInterceptor{

	@Override
	public void aroundWriteTo(WriterInterceptorContext context) throws IOException, WebApplicationException {
		// TODO Auto-generated method stub
		System.out.println("******************************************");
		context.proceed();
	}

}
