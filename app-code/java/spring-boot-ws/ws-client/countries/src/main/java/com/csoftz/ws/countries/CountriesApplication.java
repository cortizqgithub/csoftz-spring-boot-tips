/*----------------------------------------------------------------------------*/
/* Source File:   COUNTRIESAPPLICATION.JAVA                                   */
/* Description:   SOAP Web Service for Countries                              */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Feb.25/2018                                                 */
/* Last Modified: Feb.25/2018                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2018 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Feb.25/2018  COQ  File created.
 -----------------------------------------------------------------------------*/

package com.csoftz.ws.countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SOAP Web Service for Countries
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Feb.25/2018
 * @since 1.8 (JDK), Feb.25/2018
 */

@SpringBootApplication
public class CountriesApplication {

    /**
     * Spring Boot entry point for SOAP Web Service attend Countries.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(CountriesApplication.class, args);
    }
}
