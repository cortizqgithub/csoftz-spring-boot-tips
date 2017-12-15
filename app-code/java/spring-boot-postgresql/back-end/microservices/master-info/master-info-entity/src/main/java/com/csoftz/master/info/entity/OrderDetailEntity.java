/*----------------------------------------------------------------------------*/
/* Source File:   ORDERDETAILENTITY.JAVA                                      */
/* Description:   JPA Order Detail Entity (maps to OrderDetail domain object) */
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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * JPA Order Detail Entity (maps to OrderDetail domain object)
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.14/2017
 */
@Entity
@Table(name = "order_detail")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class OrderDetailEntity {

	@Id
	@Column(name = "order_id")
	private String orderId;

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "brandcode", referencedColumnName = "brandcode"),
			@JoinColumn(name = "customer_id", referencedColumnName = "customer_id") })
	private CustomerEntity customer;
	private String product;

	/**
	 * Default constructor
	 */
	public OrderDetailEntity() {
	}

	/**
	 * Constructor with parameters
	 * 
	 * @param orderId
	 *            Value for orderId
	 * @param product
	 *            Value for product
	 * @param customer
	 *            The customer info
	 */
	public OrderDetailEntity(String orderId, String product, CustomerEntity customer) {
		this.orderId = orderId;
		this.product = product;
		this.customer = customer;
	}

	/**
	 * @param orderId
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return
	 */
	public String getOrderId() {
		return this.orderId;
	}

	/**
	 * @param customer
	 */
	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	/**
	 * @return
	 */
	public CustomerEntity getCustomer() {
		return this.customer;
	}

	/**
	 * @param product
	 */
	public void setProductName(String product) {
		this.product = product;
	}

	/**
	 * @return
	 */
	public String getProduct() {
		return this.product;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderDetailEntity [orderId=" + orderId + ", customer=" + customer + ", product=" + product + "]";
	}
}
