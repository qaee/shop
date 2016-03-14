package de.vf.info;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class Info {
	
	private static String VERSION = "2016-06-12";
	private String name = "Qasim Ali";
	
	public String getVersion() {
		return VERSION;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
