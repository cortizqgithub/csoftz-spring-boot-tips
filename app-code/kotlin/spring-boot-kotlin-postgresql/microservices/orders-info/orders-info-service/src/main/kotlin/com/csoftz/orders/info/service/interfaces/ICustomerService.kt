/*----------------------------------------------------------------------------*/
/* Source File:   ICUSTOMERSERVICE.KT                                         */
/* Description:   Interface for Service to retrieve Customer information      */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Dec.14/2017                                                 */
/* Last Modified: Dec.18/2017                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Dec.14/2017  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.orders.info.service.interfaces

import com.csoftz.orders.info.entity.CustomerEntity

/**
 * Inteface for Service to retrieve Customer information.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.18/2017
 * @since 1.8 (JDK), Dec.14/2017
 */
interface ICustomerService {
    /**
     * View all the information for all customers
     *
     *  @return List of customers
     */
    fun findAll(): List<CustomerEntity>
}