/*----------------------------------------------------------------------------*/
/* Source File:   CENTRECONTROLLER.JAVA                                       */
/* Description:   Centre data controller                                      */
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
package com.csoftz.master.info.api.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csoftz.master.info.domain.Centre;

/**
 * Centre data controller
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.14/2017
 */

@RestController
@RequestMapping("/masterinfo/api/v1/centres")
public class CentreController {

	/**
	 * Retrieves the information of one centre.
	 * 
	 * @return A domain Centre object with the requested information.
	 */
	@GetMapping("/info")
	public Centre getInfo() {
		Centre c = new Centre();
		c.setField1("A");
		c.setField2("B");
		c.setField3(10);
		c.setCreationDate(LocalDateTime.now());
		c.setUpdateDate(LocalDateTime.now());
		c.setUser("JSmith");
		return c;
	}
}
