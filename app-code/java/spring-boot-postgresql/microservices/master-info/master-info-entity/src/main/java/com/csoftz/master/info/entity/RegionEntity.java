/*----------------------------------------------------------------------------*/
/* Source File:   REGIONENTITY.JAVA                                           */
/* Description:   JPA Region Entity (Maps to Region domain object)            */
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

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * JPA Region Entity (Maps to Region domain object)
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.14/2017
 */
@Entity
@Table(name = "region")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@ToString
@Getter
@Setter
@NoArgsConstructor
public class RegionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "region_seq")
	@SequenceGenerator(name = "region_seq", sequenceName = "region_sequence", allocationSize = 1)
	private Long id;
	private String regionName;
	private LocalDateTime creationDate;
	private LocalDateTime updateDate;

	@Column(name = "usr")
	private String user;
}