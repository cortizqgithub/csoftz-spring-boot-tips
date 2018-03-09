/*----------------------------------------------------------------------------*/
/* Source File:   FAMILYENTITY.JAVA                                           */
/* Description:   JPA Family Entity (Maps to Family domain object).           */
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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 * JPA Family Entity (Maps to Family domain object)
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Mar.01/2018
 * @since 1.8 (JDK), Feb.28/2018
 */

@Entity
@Table(name = "family")
@Data
@SuppressWarnings("ALL")
public class FamilyEntity {
    @OneToMany(mappedBy = "familyEntity")
    private final List<PersonEntity> members = new ArrayList<>();
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "family_seq")
    @SequenceGenerator(name = "family_seq", sequenceName = "family_sequence", allocationSize = 1)
    private Long id;
    private String description;
}
