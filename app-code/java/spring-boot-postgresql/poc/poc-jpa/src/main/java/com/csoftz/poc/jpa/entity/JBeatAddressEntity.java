/*----------------------------------------------------------------------------*/
/* Source File:   JBEATADDRESSENTITY.JAVA                                     */
/* Description:   JPA JBeat Address Entity (Maps to JBeatEmployee domain      */
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

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * JPA JBeat Address Entity (Maps to JBeatEmployee domain
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Mar.01/2018
 * @since 1.8 (JDK), Mar.01/2018
 */
@Entity
@Table(name = "jbeat_address")
@Data
@SuppressWarnings("ALL")
public class JBeatAddressEntity {

    @Id
    private Long id;
    private String country;
    private String city;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "address")
    private JBeatEmployeeEntity employee;
}
