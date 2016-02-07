package de.vf.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity
public class Category implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String description;
	
	@OneToMany(mappedBy="category",targetEntity=Book.class)
	private Collection<Book> books;
	
	private static final long serialVersionUID = 1L;

	public Category() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public Collection<Book> getBooks() {
		return this.books;
	}

	public void setBooks(Collection<Book> books) {
		this.books = books;
	}
   
}
