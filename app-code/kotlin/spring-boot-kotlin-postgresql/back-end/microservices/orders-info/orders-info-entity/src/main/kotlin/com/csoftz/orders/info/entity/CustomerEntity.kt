/*----------------------------------------------------------------------------*/
/* Source File:   CUSTOMERENTITY.KT                                           */
/* Description:   JPA Customer Entity (Maps to Customer domain object)        */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Dec.15/2017                                                 */
/* Last Modified: Dec.18/2017                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Dec.15/2017  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.orders.info.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

/**
 * JPA Customer Entity (Maps to Customer domain object)
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.18/2017
 * @since 1.8 (JDK), Dec.15/2017
 */
@Entity
@Table(name = "customer")
data class CustomerEntity(@Id @GeneratedValue val id: Long? = null,
                          val firstName: String,
                          val lastName: String) {
    @Suppress("unused")
    private constructor() : this(null, "", "")
}