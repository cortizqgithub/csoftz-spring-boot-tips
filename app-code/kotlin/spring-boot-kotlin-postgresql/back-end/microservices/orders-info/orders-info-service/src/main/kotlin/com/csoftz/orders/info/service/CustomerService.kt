/*----------------------------------------------------------------------------*/
/* Source File:   CUSTOMERSERVICE.KT                                          */
/* Description:   Service to retrieve Customer information                    */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Dec.14/2017                                                 */
/* Last Modified: Dec.15/2017                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Dec.14/2017  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.orders.info.service

import com.csoftz.orders.info.data.interfaces.ICustomerRepository
import com.csoftz.orders.info.entity.CustomerEntity
import com.csoftz.orders.info.service.interfaces.ICustomerService
import org.springframework.stereotype.Service

/**
 * Service to retrieve Customer information
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.15/2017
 */
@Service
class CustomerService(private val customerRepository: ICustomerRepository) : ICustomerService {
    /**
     * @see ICustomerService#findAll()
     */
    @Override
    override fun findAll(): List<CustomerEntity> {
        return customerRepository.findAll()
    }
}