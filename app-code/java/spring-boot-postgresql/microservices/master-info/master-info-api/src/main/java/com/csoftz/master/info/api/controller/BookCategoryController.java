/*----------------------------------------------------------------------------*/
/* Source File:   BOOKCATEGORYCONTROLLER.JAVA                                 */
/* Description:   BookCategory data controller                                */
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
package com.csoftz.master.info.api.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csoftz.master.info.domain.Book;
import com.csoftz.master.info.domain.BookCategory;
import com.csoftz.master.info.entity.BookCategoryEntity;
import com.csoftz.master.info.entity.BookEntity;
import com.csoftz.master.info.service.interfaces.IBookCategoryService;

/**
 * BookCategory data controller
 * https://hellokoding.com/jpa-one-to-many-relationship-mapping-example-with-spring-boot-maven-and-mysql/
 * 
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.14/2017
 */

@RestController
@RequestMapping("/masterinfo/api/v1/bookcategories")
public class BookCategoryController {
	private IBookCategoryService bookCategoryService;

	/**
	 * Constructor with parameters
	 * 
	 * @param bookCategoryService
	 *            Injects the IBookCategoryService service.
	 */
	public BookCategoryController(IBookCategoryService bookCategoryService) {
		this.bookCategoryService = bookCategoryService;
	}

	/**
	 * Saves the Book Category information.
	 */
	@GetMapping("/save/info")
	public void saveInfo() {
		BookCategoryEntity bookCategoryEntity = new BookCategoryEntity("Computer");
		Set<BookEntity> books = new HashSet<>();
		books.add(new BookEntity("Computer book 1", bookCategoryEntity));
		books.add(new BookEntity("Computer book 2", bookCategoryEntity));
		books.add(new BookEntity("Computer book 3", bookCategoryEntity));
		bookCategoryEntity.setBooks(books);
		bookCategoryService.save(bookCategoryEntity);

		bookCategoryEntity = new BookCategoryEntity("Sci Fi");
		books = new HashSet<>();
		books.add(new BookEntity("Sci Fi book 1", bookCategoryEntity));
		books.add(new BookEntity("Sci Fi book 2", bookCategoryEntity));
		bookCategoryEntity.setBooks(books);
		bookCategoryService.save(bookCategoryEntity);
	}

	/**
	 * Retrieves customer list
	 * 
	 * @return list with customers
	 */
	@GetMapping("/all")
	public List<BookCategoryEntity> findAll() {
		return bookCategoryService.findAll();
	}

	/**
	 * Retrieves one book category
	 * 
	 * @return A record with one customer
	 */
	@GetMapping("/get")
	public BookCategory findOne() {
		BookCategoryEntity bookCategoryEntity = bookCategoryService.findOne(5);
		BookCategory bookCategory = new BookCategory(bookCategoryEntity.getId(), bookCategoryEntity.getName(), null);
		Set<Book> books = new HashSet<>();
		
		bookCategoryEntity.getBooks().forEach(book-> {
			Book b = new Book(book.getId(), book.getName());
			books.add(b);
		});
		bookCategory.setBooks(books);
		return bookCategory;
	}
}
