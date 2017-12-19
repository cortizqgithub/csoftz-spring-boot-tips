/*----------------------------------------------------------------------------*/
/* Source File:   BOOKSERVICE.KT                                              */
/* Description:   Service to retrieve Book information                        */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Dec.18/2017                                                 */
/* Last Modified: Dec.18/2017                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Dec.14/2017  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.books.info.service

import java.util.List

import com.csoftz.books.info.data.traits.IBookRepository
import com.csoftz.books.info.entity.BookEntity
import com.csoftz.books.info.service.traits.IBookService
import org.springframework.stereotype.Service

/**
  * Service to retrieve Customer information
  *
  * @author Carlos Adolfo Ortiz Quirós (COQ)
  * @version 1.1, Dec.15/2017
  * @since 1.8 (JDK), Dec.15/2017
  */
@Service
class BookService(val bookRepository: IBookRepository) extends IBookService {
  /**
    * @see ICustomerService#findAll()
    */
  override def findAll: List[BookEntity] = bookRepository.findAll()
}
