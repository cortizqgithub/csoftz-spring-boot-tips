/*----------------------------------------------------------------------------*/
/* Source File:   IBOOKREPOSITORY.SCALA                                       */
/* Description:   Spring JPA interface to 'Book' domain objects.              */
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
package com.csoftz.books.info.data.traits

import com.csoftz.books.info.entity.BookEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
  * Spring JPA interface to 'Book' domain objects.
  *
  * @author Carlos Adolfo Ortiz Quirós (COQ)
  * @version 1.1, Dec.18/2017
  * @since 1.8 (JDK), Dec.18/2017
  */
@Repository
trait IBookRepository extends JpaRepository[BookEntity, java.lang.Long]