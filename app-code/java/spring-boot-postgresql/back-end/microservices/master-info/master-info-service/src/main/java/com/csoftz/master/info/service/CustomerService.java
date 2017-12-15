/*----------------------------------------------------------------------------*/
/* Source File:   CUSTOMERSERVICE.JAVA                                        */
/* Description:   Service to retrieve customer information                    */
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
package com.csoftz.master.info.service;

import java.util.List;

import com.csoftz.master.info.service.interfaces.ICustomerService;
import org.springframework.stereotype.Service;

import com.csoftz.master.info.data.interfaces.ICustomerRepository;
import com.csoftz.master.info.entity.CustomerEntity;
import com.csoftz.master.info.entity.id.CustomerEntityId;

/**
 * Service to retrieve customer information
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.14/2017
 */
@Service
public class CustomerService implements ICustomerService {
	ICustomerRepository customerRepository;

	/**
	 * Constructor with parameters
	 * 
	 * @param customerRepository
	 *            Injects the customer repository to gain access to database
	 *            information.
	 */
	public CustomerService(ICustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	/**
	 * @see ICustomerService#deleteAll()
	 */
	public void deleteAll() {
		customerRepository.deleteAll();
	}

	/**
	 * @see ICustomerService#save(CustomerEntity)
	 */
	public void save(CustomerEntity customer) {
		customerRepository.save(customer);
		customerRepository.flush();
	}

	/**
	 * @see ICustomerService#findAll()
	 */
	public List<CustomerEntity> findAll() {
		return customerRepository.findAll();
	}

	/**
	 * @see ICustomerService#findOne(int,
	 *      java.lang.String)
	 */
	public CustomerEntity findOne(int customerId, String brandcode) {
		CustomerEntityId customerEntityId = new CustomerEntityId();
		customerEntityId.setCustomerId(customerId);
		customerEntityId.setBrandcode(brandcode);
		return customerRepository.findOne(customerEntityId);
	}
}
