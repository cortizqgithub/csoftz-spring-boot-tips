/*----------------------------------------------------------------------------*/
/* Source File:   CUSTOMER.KT                                                 */
/* Description:   com.csoftz.orders.info.domain.Customer domain object                                      */
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
package com.csoftz.orders.info.domain

/**
 * com.csoftz.orders.info.domain.Customer domain object
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.15/2017
 */
data class Customer(val id: Long? = null,
                    val firstName: String,
                    val lastName: String)