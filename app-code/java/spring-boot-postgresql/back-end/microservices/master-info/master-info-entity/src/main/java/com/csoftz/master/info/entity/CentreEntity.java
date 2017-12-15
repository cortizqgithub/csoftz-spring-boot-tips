/*----------------------------------------------------------------------------*/
/* Source File:   CENTREENTITY.JAVA                                           */
/* Description:   JPA Centre Entity (maps to Centre domain object)            */
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

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * JPA Centre Entity (maps to Centre domain object)
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.14/2017
 */
@Entity
@Table(name = "parking_lot_log")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CentreEntity {
	private String field1;
	private String field2;

	@Id
	private int field3;

	/**
	 * Default constructor
	 */
	public CentreEntity() {
	}

	/**
	 * Constructor with parameters
	 * 
	 * @param field1
	 *            Value for field1
	 * @param field2
	 *            Value for field2
	 * @param field3
	 *            Value for field3
	 */
	public CentreEntity(String field1, String field2, int field3) {
		super();
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}

	/**
	 * @return
	 */
	public String getField1() {
		return field1;
	}

	/**
	 * @param field1
	 */
	public void setField1(String field1) {
		this.field1 = field1;
	}

	/**
	 * @return
	 */
	public String getField2() {
		return field2;
	}

	/**
	 * @param field2
	 */
	public void setField2(String field2) {
		this.field2 = field2;
	}

	/**
	 * @return
	 */
	public int getField3() {
		return field3;
	}

	/**
	 * @param field3
	 */
	public void setField3(int field3) {
		this.field3 = field3;
	}
}
