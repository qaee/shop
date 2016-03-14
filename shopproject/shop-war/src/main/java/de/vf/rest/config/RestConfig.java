package de.vf.rest.config;

import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class RestConfig extends ResourceConfig {
   /* public Set<Class<?>> getClasses();   
    public Set<Object> getSingletons();
*/
	
	public RestConfig() {
		packages(true, "de.vf;");
	}
}
