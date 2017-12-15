/*----------------------------------------------------------------------------*/
/* Source File:   IREGIONSERVICE.JAVA                                         */
/* Description:   Interface for Service to retrieve Region information        */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Dec.06/2017                                                 */
/* Last Modified: Dec.06/2017                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Dec.06/2017  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.master.info.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.csoftz.master.info.domain.Region;

/**
 * Interface for Service to retrieve Region information
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.06/2017
 * @since 1.8 (JDK), Dec.06/2017
 */
public interface IRegionService {

	/**
	 * Saves information
	 * 
	 * @param region
	 *            Sets the data to store
	 * @return New/update record.
	 */
	Region save(Region region);

	/**
	 * View all the information for all customers
	 * 
	 * @return List of customers
	 */
	List<Region> findAll();

	/**
	 * Locate record from store.
	 * 
	 * @return An optional indicating it one is found or not.
	 */
	Optional<Region> findOne(Long id);
}