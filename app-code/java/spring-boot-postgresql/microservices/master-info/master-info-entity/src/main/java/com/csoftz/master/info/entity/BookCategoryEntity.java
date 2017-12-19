/*----------------------------------------------------------------------------*/
/* Source File:   BOOKCATEGORYENTITY.JAVA                                     */
/* Description:   JPA Book Category Entity (maps to BookCategory domain       */
/*                object                                                      */
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
package com.csoftz.master.info.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * JPA Book Category Entity (maps to BookCategory domain object.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.14/2017
 */
@Entity
@Table(name = "book_category")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class BookCategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;

	@OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
	private Set<BookEntity> books;

	/**
	 * Default constructor
	 */
	public BookCategoryEntity() {
	}

	/**
	 * Constructor with parameters
	 * 
	 * @param name
	 *            Sets the name of the Book Category.
	 * 
	 */
	public BookCategoryEntity(String name) {
		this.name = name;
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
	public Set<BookEntity> getBooks() {
		return books;
	}

	/**
	 * @param books
	 *            the books to set
	 */
	public void setBooks(Set<BookEntity> books) {
		this.books = books;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String result = String.format("Category[id=%d, name='%s']%n", id, name);
		if (books != null) {
			for (BookEntity book : books) {
				result += String.format("Book[id=%d, name='%s']%n", book.getId(), book.getName());
			}
		}

		return result;
	}

}
