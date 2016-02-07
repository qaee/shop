package de.vf.service;

import javax.ejb.Remote;

@Remote
public interface TestERemote {

	public void sayHello();
}
