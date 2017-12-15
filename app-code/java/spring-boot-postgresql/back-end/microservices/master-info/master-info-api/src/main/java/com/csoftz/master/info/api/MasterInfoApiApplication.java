/*----------------------------------------------------------------------------*/
/* Source File:   MASTERINFOAPIAPPLICATION.JAVA                               */
/* Description:   Microservice to attend master-info data                     */
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
package com.csoftz.master.info.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Microservice to attend master-info data 
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.14/2017
 * @since 1.8 (JDK), Dec.14/2017
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.crystal.sis.master.info")
@EnableJpaRepositories("com.crystal.sis.master.info.data")
@EntityScan("com.crystal.sis.master.info.entity")
public class MasterInfoApiApplication {

	/**Spring Boot entry point for Microservice to attend master-info data.
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		SpringApplication.run(MasterInfoApiApplication.class, args);
	}
}
