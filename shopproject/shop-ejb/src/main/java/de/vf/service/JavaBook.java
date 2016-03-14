package de.vf.service;

import de.vf.model.Book;

@JBook
public class JavaBook extends Book{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String categoryName;

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
