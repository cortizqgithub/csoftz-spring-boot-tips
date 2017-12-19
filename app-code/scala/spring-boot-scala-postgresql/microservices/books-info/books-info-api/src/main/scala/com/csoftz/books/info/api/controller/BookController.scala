/*----------------------------------------------------------------------------*/
/* Source File:   BOOKCONTROLLER.SCALA                                        */
/* Description:   Book data controller                                        */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Dec.18/2017                                                 */
/* Last Modified: Dec.18/2017                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Dec.18/2017  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.books.info.api.controller

import java.util.List

import com.csoftz.books.info.entity.BookEntity
import com.csoftz.books.info.service.traits.IBookService
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

/**
  * Book data controller
  *
  * @author Carlos Adolfo Ortiz Quirós (COQ)
  * @version 1.1, Dec.18/2017
  * @since 1.8 (JDK), Dec.18/2017
  */
@RestController
@RequestMapping(Array("/booksinfo/api/v1/books"))
class BookController(val bookService: IBookService) {
  private val log = LoggerFactory.getLogger(classOf[BookController])

  /**
    * Retrieves all Books records from store.
    *
    * @return List of Books
    */
  @GetMapping(Array("/all"))
  def findAll(): List[BookEntity] = {
    log.debug("REST request to get all records")
    bookService.findAll
  }
}
