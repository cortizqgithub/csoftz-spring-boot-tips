/*----------------------------------------------------------------------------*/
/* Source File:   ORDERSINFOAPIAPPLICATION.KT                                 */
/* Description:   Microservice to attend orders-info data                     */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Dec.15/2017                                                 */
/* Last Modified: Dec.15/2017                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Dec.15/2017  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.orders.info.api

import com.csoftz.orders.info.data.interfaces.ICustomerRepository
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

/**
 * Microservice to attend orders-info data
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.15/2017
 */

@SpringBootApplication
@ComponentScan(basePackages = arrayOf("com.csoftz.orders.info"))
@EnableJpaRepositories("com.csoftz.orders.info.data")
@EntityScan("com.csoftz.orders.info.entity")
class OrdersInfoApplication {
    private val log = LoggerFactory.getLogger(OrdersInfoApplication::class.java)

    @Bean
    fun init(repository: ICustomerRepository) = CommandLineRunner {
        // save a couple of customers
        /*
        repository.save(CustomerEntity(firstName = "Jack", lastName = "Bauer"))
        repository.save(CustomerEntity(firstName ="Chloe", lastName = "O'Brian"))
        repository.save(CustomerEntity(firstName ="Kim", lastName = "Bauer"))
        repository.save(CustomerEntity(firstName ="David", lastName = "Palmer"))
        repository.save(CustomerEntity(firstName ="Michelle", lastName = "Dessler"))
*/

        // fetch all customers
        log.info("Customers found with findAll():")
        log.info("-------------------------------")
        repository.findAll().forEach { log.info(it.toString()) }
        log.info("-------------------------------")
    }
}

/**Spring Boot entry point for Microservice to attend master-info data.
 * @param args Command line arguments.
 */
fun main(args: Array<String>) {
    SpringApplication.run(OrdersInfoApplication::class.java, *args)
}