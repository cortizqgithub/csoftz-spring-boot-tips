/*----------------------------------------------------------------------------*/
/* Source File:   IBOOKSERVICE.SCALA                                          */
/* Description:   Interface for Service to retrieve Customer information      */
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
package com.csoftz.books.info.service.traits

import java.util.List

import com.csoftz.books.info.entity.BookEntity

/**
  * Inteface for Service to retrieve Book information.
  *
  * @author Carlos Adolfo Ortiz Quirós (COQ)
  * @version 1.1, Dec.18/2017
  * @since 1.8 (JDK), Dec.18/2017
  */
trait IBookService {
  /**
    * View all the information for all books.
    *
    * @return List of Books
    */
  def findAll: List[BookEntity]
}
