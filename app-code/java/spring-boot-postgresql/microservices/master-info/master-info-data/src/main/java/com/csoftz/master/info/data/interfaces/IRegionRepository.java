/*----------------------------------------------------------------------------*/
/* Source File:   IREGIONREPOSITORY.JAVA                                      */
/* Description:   Spring JPA interface to 'Region' domain objects.            */
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
package com.csoftz.master.info.data.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csoftz.master.info.entity.RegionEntity;

/**
 * Spring JPA interface to 'Region' domain objects.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.14/2017
 */
public interface IRegionRepository extends JpaRepository<RegionEntity, Long> {
}