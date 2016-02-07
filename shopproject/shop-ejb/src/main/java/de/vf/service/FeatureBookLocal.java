package de.vf.service;

import javax.ejb.Local;

import de.vf.model.Book;

@Local
public interface FeatureBookLocal {
	Book getFeaturedBook();
}
