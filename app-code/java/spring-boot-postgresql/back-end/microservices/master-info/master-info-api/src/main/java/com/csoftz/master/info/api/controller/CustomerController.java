/*----------------------------------------------------------------------------*/
/* Source File:   CUSTOMERCONTROLLER.JAVA                                     */
/* Description:   Customer data controller                                    */
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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csoftz.master.info.entity.CustomerEntity;
import com.csoftz.master.info.entity.OrderDetailEntity;
import com.csoftz.master.info.entity.id.CustomerEntityId;
import com.csoftz.master.info.service.interfaces.ICustomerService;

/**
 * Customer data controller
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.14/2017
 */

@RestController
@RequestMapping("/masterinfo/api/v1/customers")
public class CustomerController {
	private ICustomerService customerService;

	/**
	 * Constructor with parameters.
	 * 
	 * @param customerService
	 *            Injects an ICustomerService service.
	 */
	public CustomerController(ICustomerService customerService) {
		this.customerService = customerService;
	}

	/**
	 * Saves the customer information.
	 */
	@GetMapping("/save/info")
	public void saveInfo() {
		CustomerEntityId customerId = new CustomerEntityId();
		customerId.setCustomerId(1);
		customerId.setBrandcode("New");

		CustomerEntity customer = new CustomerEntity();
		customer.setCustomerId(customerId);
		customer.setName("Carlos");
		customer.setCompany("Ceiba");

		customerService.save(customer);

		// cutomerId = new C
		// customer = new CustomerEntity()

		// CustomerEntityId customerId, String company, String name,
		// Set<OrderDetailEntity> orderDetails
		customerId = new CustomerEntityId(2, "2BrandCode");
		customer = new CustomerEntity(customerId, "NexTStep", "Juan Rulfo");

		Set<OrderDetailEntity> customerOrders = new HashSet<>();
		customerOrders.add(new OrderDetailEntity("PK23", "Lamp", customer));
		customerOrders.add(new OrderDetailEntity("PK24", "Lamp 24", customer));
		customerOrders.add(new OrderDetailEntity("PK25", "Lamp 25", customer));
		customerOrders.add(new OrderDetailEntity("PK26", "Lamp 26", customer));
		customer.setOrderDetails(customerOrders);

		customerService.save(customer);

		customerId = new CustomerEntityId(3, "Long");
		customer.setCustomerId(customerId);

		customerOrders = new HashSet<>();
		customerOrders.add(new OrderDetailEntity("APK23", "v Lamp", customer));
		customerOrders.add(new OrderDetailEntity("BPK24", "c Lamp 24", customer));
		customerOrders.add(new OrderDetailEntity("CPK25", "4 Lamp 25", customer));
		customerOrders.add(new OrderDetailEntity("DPK26", "44 Lamp 26", customer));
		customer.setOrderDetails(customerOrders);

		customerService.save(customer);
	}

	/**
	 * Retrieves customer list
	 * 
	 * @return list with customers
	 */
	@GetMapping("/all")
	public List<CustomerEntity> findAll() {
		List<CustomerEntity> l = customerService.findAll();
		return l;
	}

	/**
	 * Retrieves one customer
	 * 
	 * @return A record with one customer
	 */
	@GetMapping("/get")
	public CustomerEntity getCustomer() {
		CustomerEntity c = customerService.findOne(2, "2BrandCode");
		System.out.println("CUSTOMER INFO");
		System.out.println(c.getCustomerId().getCustomerId());
		System.out.println(c.getCustomerId().getBrandcode());
		System.out.println(c.getName());
		System.out.println(c.getCompany());
		Set<OrderDetailEntity> l = c.getOrderDetails();
		System.out.println(l.size());
		l.forEach(o -> {
			System.out.println(o.getOrderId());
			System.out.println(o.getProduct());
		});

		System.out.println(c);
		return c;
	}
}
