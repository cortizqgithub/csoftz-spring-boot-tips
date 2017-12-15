/*----------------------------------------------------------------------------*/
/* Source File:   CUSTOMERENTITY.JAVA                                         */
/* Description:   JPA Customer Entity (maps to Customer domain object)        */
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
package com.csoftz.master.info.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.csoftz.master.info.entity.id.CustomerEntityId;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * JPA Customer Entity (maps to Customer domain object)
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.14/2017
 */
@Entity
@Table(name = "customer")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CustomerEntity {

	@EmbeddedId
	private CustomerEntityId customerId;

	private String company;
	private String name;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private Set<OrderDetailEntity> orderDetails;

	/**
	 * Default constructor
	 */
	public CustomerEntity() {
	}

	/**
	 * Constructor with parameters
	 * 
	 * @param customerId
	 *            The customer Id to set
	 * @param company
	 *            Value for company
	 * @param name
	 *            Value for name
	 */
	public CustomerEntity(CustomerEntityId customerId, String company, String name) {
		this.customerId = customerId;
		this.company = company;
		this.name = name;
	}

	/**
	 * Constructor with parameters
	 * 
	 * @param customerId
	 *            The customer Id to set
	 * @param company
	 *            Value for company
	 * @param name
	 *            Value for name
	 * @param orderDetails
	 *            Customer order detail list.
	 */
	public CustomerEntity(CustomerEntityId customerId, String company, String name,
			Set<OrderDetailEntity> orderDetails) {
		this.customerId = customerId;
		this.company = company;
		this.name = name;
		this.orderDetails = orderDetails;
	}

	/**
	 * @param customerId
	 */
	public void setCustomerId(CustomerEntityId customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return
	 */
	public CustomerEntityId getCustomerId() {
		return this.customerId;
	}

	/**
	 * @param company
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return
	 */
	public String getCompany() {
		return this.company;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param orderDetails
	 */
	public void setOrderDetails(Set<OrderDetailEntity> orderDetails) {
		this.orderDetails = orderDetails;
	}

	/**
	 * @return
	 */
	public Set<OrderDetailEntity> getOrderDetails() {
		return this.orderDetails;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerEntity [customerId=" + customerId + ", company=" + company + ", name=" + name
				+ ", orderDetails=" + orderDetails + "]";
	}

}