package de.vf.service;

import java.io.Serializable;

import javax.ejb.Remote;

import de.vf.model.User;

@Remote
public interface LoginSession extends Serializable{

	User getUser();
	void setUser(User u);
}
