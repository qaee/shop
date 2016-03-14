package de.vf.info;

import java.io.IOException;
import java.util.Collection;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.ReaderInterceptor;
import javax.ws.rs.ext.ReaderInterceptorContext;

@Provider
public class ReaderInterceptorDMNG implements ReaderInterceptor{

	@Override
	public Object aroundReadFrom(ReaderInterceptorContext context) throws IOException, WebApplicationException {
		Collection<String> propertyNames = context.getPropertyNames();
		System.out.println("Reader Interceptor #############################################");
		for(String s:propertyNames) {
			System.out.println(s);
		}
		return context.proceed();
	}

}
