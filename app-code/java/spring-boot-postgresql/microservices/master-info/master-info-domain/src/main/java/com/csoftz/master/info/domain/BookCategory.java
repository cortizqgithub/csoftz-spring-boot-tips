/*----------------------------------------------------------------------------*/
/* Source File:   BOOKCATEGORY.JAVA                                           */
/* Description:   Book Category domain object definition                      */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Dec.14/2017                                                 */
/* Last Modified: Dec.15/2017                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Dec.14/2017  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.master.info.domain;

import java.util.Set;

/**
 * Book Category domain object definition.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.14/2017
 * @since 1.8 (JDK), Dec.14/2017
 */
public class BookCategory {
	private int id;
	private String name;
	private Set<Book> books;

	/**
	 * Constructor with parameters
	 * 
	 * @param id
	 *            Book Category Id
	 * @param name
	 *            Name of Book Category
	 * @param books
	 *            List of books related to this Book Category.
	 */
	public BookCategory(int id, String name, Set<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.books = books;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the books
	 */
	public Set<Book> getBooks() {
		return books;
	}

	/**
	 * @param books
	 *            the books to set
	 */
	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BookCategory [id=" + id + ", name=" + name + ", books=" + books + "]";
	}
}