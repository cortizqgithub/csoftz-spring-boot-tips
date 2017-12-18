/*----------------------------------------------------------------------------*/
/* Source File:   BOOK.SCALA                                                  */
/* Description:   Book domain object definition                               */
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
package com.csoftz.books.info.domain

import scala.beans.BeanProperty

/**
  * Book domain object definition.
  *
  * @author Carlos Adolfo Ortiz Quirós (COQ)
  * @version 1.1, Dec.15/2017
  * @since 1.8 (JDK), Dec.14/2017
  */
case class Book(@BeanProperty id: Integer, @BeanProperty val name: String) {
  /**
    * Default constructor
    */
  def this() {
    this(0, "")
  }
}
