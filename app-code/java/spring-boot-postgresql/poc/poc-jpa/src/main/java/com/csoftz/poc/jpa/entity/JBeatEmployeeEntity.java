/*----------------------------------------------------------------------------*/
/* Source File:   JBEATEMPLOYEEENTITY.JAVA                                    */
/* Description:   JPA JBeat Employee Entity (Maps to JBeatEmployee domain     */
/*                object).                                                    */
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

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * JPA JBeat Employee Entity (Maps to JBeatEmployee domain object)
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Mar.01/2018
 * @since 1.8 (JDK), Mar.01/2018
 */
@Entity
@Table(name = "jbeat_employee")
@Data
@SuppressWarnings("ALL")
public class JBeatEmployeeEntity {
    @Id
    private Integer id;

    @Basic(optional = false)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private JBeatAddressEntity address;
}
