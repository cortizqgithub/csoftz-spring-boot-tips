/*----------------------------------------------------------------------------*/
/* Source File:   ICUSTOMERSERVICE.JAVA                                       */
/* Description:   Interface for Service to retrieve customer information      */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Nov.26/2017                                                 */
/* Last Modified: Dec.06/2017                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Nov.26/2017  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.master.info.service.interfaces;

import java.util.List;

import com.csoftz.master.info.entity.CustomerEntity;

/**
 * Interface for Service to retrieve customer information
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.06/2017
 * @since 1.8 (JDK), Nov.26/2017
 */
public interface ICustomerService {

	/**
	 * deletes all records
	 */
	void deleteAll();

	/**
	 * Save information
	 * 
	 * @param customer
	 *            Data to save
	 */
	void save(CustomerEntity customer);

	/**
	 * View all the information for all customers
	 * 
	 * @return List of customers
	 */
	List<CustomerEntity> findAll();

	/**
	 * Retrieves information about one customer
	 * 
	 * @param customerId
	 *            The customer Id to set
	 * @param brandcode
	 *            The customer Id to set
	 * @return The customer information.
	 */
	CustomerEntity findOne(int customerId, String brandcode);
}
