package de.vf.service;

import java.io.Serializable;

import javax.ejb.Local;

import de.vf.model.User;

@Local
public interface LoginSession {

	User getUser();
	void setUser(User u);
}
