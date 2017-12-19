/*----------------------------------------------------------------------------*/
/* Source File:   IBOOKCATEGORYSERVICE.JAVA                                   */
/* Description:   Interface for Service to retrieve Book Category information */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Dec.03/2017                                                 */
/* Last Modified: Dec.06/2017                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Dec.03/2017  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.master.info.service.interfaces;

import java.util.List;

import com.csoftz.master.info.entity.BookCategoryEntity;

/**
 * Interface for Service to retrieve customer information
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.06/2017
 * @since 1.8 (JDK), Dec.03/2017
 */
public interface IBookCategoryService {
	/**
	 * Save information
	 * 
	 * @param bookCategory
	 *            Data to save
	 */
	void save(BookCategoryEntity bookCategory);

	/**
	 * View all the information for all book category
	 * 
	 * @return List of book categories
	 */
	List<BookCategoryEntity> findAll();

	/**
	 * Retrieves information about one book category
	 * 
	 * @param id
	 *            The Book Cateogry Id to set
	 * @return The book category information.
	 */
	BookCategoryEntity findOne(int id);
}
