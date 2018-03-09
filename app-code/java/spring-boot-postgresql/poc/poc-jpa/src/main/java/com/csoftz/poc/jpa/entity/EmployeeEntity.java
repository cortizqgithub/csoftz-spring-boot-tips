/*----------------------------------------------------------------------------*/
/* Source File:   EMPLOYEEENTITY.JAVA                                         */
/* Description:   JPA Employee Entity (Maps to Employee domain object).       */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Mar.01/2018                                                 */
/* Last Modified: Mar.01/2018                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2018 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Mar.01/2018  COQ  File created.
 -----------------------------------------------------------------------------*/

package com.csoftz.poc.jpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * JPA Employee Entity (Maps to Employee domain object)
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Mar.01/2018
 * @since 1.8 (JDK), Mar.01/2018
 */
@Entity
@Table(name = "employee")
@Data
@SuppressWarnings("ALL")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eid;
    private String ename;
    private double salary;
    private String deg;

    /**
     * Constructor with parameter
     *
     * @param eid    Id of Employee
     * @param ename  Name of Employee
     * @param salary Amount paid to Employee
     * @param deg    Degree
     */
    public EmployeeEntity(Long eid, String ename, double salary, String deg) {
        super();
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
        this.deg = deg;
    }
}
