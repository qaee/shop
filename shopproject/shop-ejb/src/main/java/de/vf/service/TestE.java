package de.vf.service;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class TestE
 */
@Stateless
@LocalBean	
public class TestE implements TestERemote {


	@Resource
	SessionContext sc;

	@Override
	public void sayHello() {
		System.out.println("Hello WOrld"+ sc.getInvokedBusinessInterface().getName());
		
	}

	public void sayNoInterfaceHello() {
		System.out.println("Hello From no interface view");
	}
}
