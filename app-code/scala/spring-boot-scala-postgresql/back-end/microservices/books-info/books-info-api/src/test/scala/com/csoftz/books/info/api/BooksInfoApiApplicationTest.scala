/*----------------------------------------------------------------------------*/
/* Source File:   BOOKSINFOAPIAPPLICATIONTEST.SCALA                           */
/* Description:   Microservice to attend books-info data (tests)              */
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
package com.csoftz.books.info.api

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
  * Microservice to attend books-info data (tests)
  *
  * @author Carlos Adolfo Ortiz Quirós (COQ)
  * @version 1.1, Dec.18/2017
  * @since 1.8 (JDK), Dec.18/2017
  */
@RunWith(classOf[SpringRunner])
@SpringBootTest
class BooksInfoApiApplicationTest {

  /**
    * Ensures that Spring Boot context sucessfully loads.
    */
  @Test
  def contextLoads(): Unit = {
  }
}
