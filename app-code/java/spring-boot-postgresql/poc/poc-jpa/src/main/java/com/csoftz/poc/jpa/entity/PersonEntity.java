/*----------------------------------------------------------------------------*/
/* Source File:   PERSONENTITY.JAVA                                           */
/* Description:   JPA Person Entity (Maps to Person domain object).           */
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

/**
 * JPA Person Entity (Maps to Person do domain object)
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Mar.01/2018
 * @since 1.8 (JDK), Feb.28/2018
 */

@Entity
@Table(name = "person")
@Data
@SuppressWarnings({"unused", "WeakerAccess"})
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq")
    @SequenceGenerator(name = "person_seq", sequenceName = "person_sequence", allocationSize = 1)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToOne
    private FamilyEntity familyEntity;

    @Transient
    private String nonsenseField = "";

    @OneToMany
    private List<JobEntity> jobList = new ArrayList<>();
}
