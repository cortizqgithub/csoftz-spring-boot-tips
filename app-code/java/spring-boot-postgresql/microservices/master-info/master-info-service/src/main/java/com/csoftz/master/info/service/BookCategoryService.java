/*----------------------------------------------------------------------------*/
/* Source File:   BOOKCATEGORYSERVICE.JAVA                                    */
/* Description:   Service to retrieve Book Category information               */
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
package com.csoftz.master.info.service;

import java.util.List;

import com.csoftz.master.info.service.interfaces.IBookCategoryService;
import org.springframework.stereotype.Service;

import com.csoftz.master.info.data.interfaces.IBookCategoryRepository;
import com.csoftz.master.info.entity.BookCategoryEntity;

/**
 * Service to retrieve Book Category information
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.14/2017
 */
@Service
public class BookCategoryService implements IBookCategoryService {
	private IBookCategoryRepository bookCategoryRepository;

	/**
	 * Constructor with parameters
	 * 
	 * @param bookCategoryRepository
	 */
	public BookCategoryService(IBookCategoryRepository bookCategoryRepository) {
		this.bookCategoryRepository = bookCategoryRepository;
	}

	/**
	 * @see IBookCategoryService#save(BookCategoryEntity)
	 */
	@Override
	public void save(BookCategoryEntity bookCategory) {
		bookCategoryRepository.save(bookCategory);
	}

	/**
	 * @see IBookCategoryService#findAll()
	 */
	@Override
	public List<BookCategoryEntity> findAll() {
		return bookCategoryRepository.findAll();
	}

	/**
	 * @see IBookCategoryService#findOne(int)
	 */
	@Override
	public BookCategoryEntity findOne(int id) {
		return bookCategoryRepository.findOne(id);
	}
}
