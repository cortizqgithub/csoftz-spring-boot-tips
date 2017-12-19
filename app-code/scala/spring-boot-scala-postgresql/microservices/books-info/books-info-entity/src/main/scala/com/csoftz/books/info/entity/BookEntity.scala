/*----------------------------------------------------------------------------*/
/* Source File:   BOOKENTITY.SCALA                                            */
/* Description:   JPA Book Entity (Maps to Book domain object)                */
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
package com.csoftz.books.info.entity

import javax.persistence.{Entity, GeneratedValue, Id, Table}

import scala.annotation.meta.field
import scala.beans.BeanProperty

/**
  * JPA Book Entity (Maps to Book domain object)
  *
  * @author Carlos Adolfo Ortiz Quirós (COQ)
  * @version 1.1, Dec.15/2017
  * @since 1.8 (JDK), Dec.15/2017
  */
@Entity
@Table(name = "book")
case class BookEntity(@(Id@field)
                      @(GeneratedValue@field)
                      @BeanProperty id: Long,
                      @BeanProperty val name: String) {
  /**
    * Default constructor
    */
  def this() {
    this(0, "")
  }
}
