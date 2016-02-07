package de.vf.dao;

import javax.ejb.Local;

import de.vf.model.Person;

@Local
public interface IPersonDao {
void add(Person p);
}
