/*----------------------------------------------------------------------------*/
/* Source File:   BOOKSINFOAPIAPPLICATION.SCALA                               */
/* Description:   Microservice to attend books-info data                      */
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

import com.csoftz.books.info.data.traits.IBookRepository
import com.csoftz.books.info.entity.BookEntity
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.{ApplicationRunner, SpringApplication}
import org.springframework.context.annotation.{Bean, ComponentScan}
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

/**
  * Microservice to attend books-info data
  *
  * @author Carlos Adolfo Ortiz Quirós (COQ)
  * @version 1.1, Dec.18/2017
  * @since 1.8 (JDK), Dec.18/2017
  */

@SpringBootApplication
@ComponentScan(basePackages = Array("com.csoftz.books.info"))
@EnableJpaRepositories(Array("com.csoftz.books.info.data"))
@EntityScan(Array("com.csoftz.books.info.entity"))
class BooksInfoApiApplication {
  private val log = LoggerFactory.getLogger(classOf[BooksInfoApiApplication])

  @Bean
  def init(bookRepository: IBookRepository): ApplicationRunner = args => {
    // Save a couple of books
    log.info("Creating some books")

    bookRepository.save(BookEntity(0L, "My Book 1"))
    bookRepository.save(BookEntity(0L, "My Book 2"))

    // Fetch all books
    log.info("Books found with findAll()")
    log.info("-------------------------------")
    val l = bookRepository.findAll().stream().forEach(it => {
      log.info(it.toString())
    })
    log.info("-------------------------------")


  }
}

/**
  * Spring Boot entry point for Microservice to attend books-info data.
  *
  * @param args Command line arguments.
  */
object BooksInfoApiApplication extends App {
  SpringApplication.run(classOf[BooksInfoApiApplication], args: _*)
}
