/*----------------------------------------------------------------------------*/
/* Source File:   ORDERDETAILENTITY.JAVA                                      */
/* Description:   JPA Order Detail Entity Id (composite primary key           */
/*                definition).                                                */
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
package com.csoftz.master.info.entity.id;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * JPA Order Detail Entity Id (composite primary key definition).
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.05/2017
 * @since 1.8 (JDK), Nov.26/2017
 */
@Embeddable
public class CustomerEntityId implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "brandcode")
	private String brandcode;

	/**
	 * Default constructor
	 */
	public CustomerEntityId() {
	}

	/**
	 * Constuctor with parameters.
	 * 
	 * @param customerId
	 *            Code of customer ID
	 * @param brandcode
	 *            The brand code
	 */
	public CustomerEntityId(int customerId, String brandcode) {
		this.customerId = customerId;
		this.brandcode = brandcode;
	}

	/**
	 * @param customerId
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return
	 */
	public int getCustomerId() {
		return this.customerId;
	}

	/**
	 * @param brandcode
	 */
	public void setBrandcode(String brandcode) {
		this.brandcode = brandcode;
	}

	/**
	 * @return
	 */
	public String getBrandcode() {
		return this.brandcode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerEntityId [customerId=" + customerId + ", brandcode=" + brandcode + "]";
	}
}