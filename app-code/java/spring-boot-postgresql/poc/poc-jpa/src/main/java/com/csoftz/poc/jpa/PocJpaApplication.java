/*----------------------------------------------------------------------------*/
/* Source File:   POCJPAAPPLICATION.JAVA                                      */
/* Description:   POC for JPA studies.                                        */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Feb.28/2018                                                 */
/* Last Modified: Feb.28/2018                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Feb.28/2018  COQ  File created.
 -----------------------------------------------------------------------------*/

package com.csoftz.poc.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * POC for JPA studies.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Feb.28/2018
 * @since 1.8 (JDK), Feb.28/2018
 */

@SpringBootApplication
@SuppressWarnings("WeakerAccess")
public class PocJpaApplication {

    /**
     * Spring Boot entry point for Microservice to attend master-info data.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(PocJpaApplication.class, args);
    }
}
