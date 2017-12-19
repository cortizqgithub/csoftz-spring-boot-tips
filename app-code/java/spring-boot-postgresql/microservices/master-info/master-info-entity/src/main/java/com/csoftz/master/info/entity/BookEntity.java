/*----------------------------------------------------------------------------*/
/* Source File:   BOOKENTITY.JAVA                                             */
/* Description:   JPA Book Entity (maps to Book domain object)                */
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

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * JPA Book Entity (maps to Book domain object)
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.14/2017
 */
@Entity
@Table(name = "book")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class BookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;

	@ManyToOne
	@JoinColumn(name = "book_category_id")
	private BookCategoryEntity bookCategory;

	/**
	 * Default constructor
	 */
	public BookEntity() {
	}

	/**
	 * Constructor with parameters
	 * 
	 * @param name
	 *            Name of the book to assign
	 */
	public BookEntity(String name) {
		this.name = name;
	}

	/**
	 * Constructor with parameters
	 * 
	 * @param name
	 *            Name of the book to assign
	 * @param bookCategory
	 *            Reference to a Book Category instance to relate to the book.
	 */
	public BookEntity(String name, BookCategoryEntity bookCategory) {
		this.name = name;
		this.bookCategory = bookCategory;
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
	 * @return the bookCategory
	 */
	public BookCategoryEntity getBookCategory() {
		return bookCategory;
	}

	/**
	 * @param bookCategory
	 *            the bookCategory to set
	 */
	public void setBookCategory(BookCategoryEntity bookCategory) {
		this.bookCategory = bookCategory;
	}
}
