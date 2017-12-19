/*----------------------------------------------------------------------------*/
/* Source File:   ICUSTOMERREPOSITORY.KT                                      */
/* Description:   Spring JPA interface to 'Customer' domain objects.          */
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
package com.csoftz.orders.info.data.interfaces

import com.csoftz.orders.info.entity.CustomerEntity
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Spring JPA interface to 'Customer' domain objects.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.15/2017
 */
interface ICustomerRepository : JpaRepository<CustomerEntity, Long>