/*----------------------------------------------------------------------------*/
/* Source File:   ORDERSINFOAPIAPPLICATIONTESTS.KT                            */
/* Description:   Microservice to attend orders-info data (tests)             */
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

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * Microservice to attend orders-info data (tests)
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.14/2017
 * @since 1.8 (JDK), Dec.14/2017
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class OrdersInfoApiApplicationTests {

    /**
     * Ensures that Spring Boot context successfully loads.
     */
    @Test
    fun contextLoads() {
    }
}
