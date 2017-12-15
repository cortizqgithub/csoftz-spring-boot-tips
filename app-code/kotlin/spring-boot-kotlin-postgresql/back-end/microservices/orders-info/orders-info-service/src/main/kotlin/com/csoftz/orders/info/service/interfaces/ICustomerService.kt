/*----------------------------------------------------------------------------*/
/* Source File:   ICUSTOMERSERVICE.KT                                         */
/* Description:   Interface for Service to retrieve Region information        */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Dec.06/2017                                                 */
/* Last Modified: Dec.06/2017                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Dec.06/2017  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.orders.info.service.interfaces

import com.csoftz.orders.info.entity.CustomerEntity

interface ICustomerService {
    /**
     * View all the information for all customers
     *
     *  @return List of
     */
    fun findAll(): List<CustomerEntity>
}