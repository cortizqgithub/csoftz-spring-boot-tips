/*----------------------------------------------------------------------------*/
/* Source File:   CUSTOMERCONTROLLER.KT                                       */
/* Description:   Customer data controller                                    */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Dec.15/2017                                                 */
/* Last Modified: Dec.15/2017                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Dec.14/2017  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.orders.info.api.controller

import com.csoftz.orders.info.entity.CustomerEntity
import com.csoftz.orders.info.service.interfaces.ICustomerService
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Customer data controller
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.15/2017
 */
@RestController
@RequestMapping("/ordersinfo/api/v1/customers")
class CustomerController(private val customerService: ICustomerService) {
    private val log = LoggerFactory.getLogger(CustomerController::class.java)

    /**
     * Retrieves all Customers records from store.
     *
     * @return List of Customers
     */
    @GetMapping("/all")
    fun findAll():List<CustomerEntity> {
        log.debug("REST request to get all records")
        return customerService.findAll()
    }
}