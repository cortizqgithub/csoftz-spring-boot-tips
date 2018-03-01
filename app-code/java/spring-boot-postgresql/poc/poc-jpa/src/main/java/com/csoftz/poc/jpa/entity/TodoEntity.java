/*----------------------------------------------------------------------------*/
/* Source File:   TODOENTITY.JAVA                                             */
/* Description:   JPA To do Entity (Maps to To do domain object).             */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Feb.28/2018                                                 */
/* Last Modified: Mar.01/2018                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2018 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Feb.28/2018  COQ  File created.
 -----------------------------------------------------------------------------*/

package com.csoftz.poc.jpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * JPA To do Entity (Maps to To do domain object)
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Mar.01/2018
 * @since 1.8 (JDK), Feb.28/2018
 */
@Entity
@Table(name = "todo")
@Data
@SuppressWarnings({"unused", "WeakerAccess"})
public class TodoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "todo_seq")
    @SequenceGenerator(name = "todo_seq", sequenceName = "todo_sequence", allocationSize = 1)
    private Long id;
    private String summary;
    private String description;
}
