package de.vf.service;

import javax.ejb.Local;

@Local
public interface BookServiceLocal {

	void readBook();

}
