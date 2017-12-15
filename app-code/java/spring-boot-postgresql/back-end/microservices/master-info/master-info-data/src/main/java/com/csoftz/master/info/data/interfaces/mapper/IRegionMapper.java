/*----------------------------------------------------------------------------*/
/* Source File:   REGIONMAPPER.JAVA                                           */
/* Description:   Converts objects from/to Region/RegionEntity                */
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
package com.csoftz.master.info.data.interfaces.mapper;

import org.mapstruct.Mapper;

import com.csoftz.master.info.domain.Region;
import com.csoftz.master.info.entity.RegionEntity;

/**
 * Converts objects from/to Region/RegionEntity
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.14/2017
 * @since 1.8 (JDK), Dec.15/2017
 */
@Mapper(componentModel = "spring", uses = {})
public interface IRegionMapper extends IEntityMapper<Region, RegionEntity> {
	/**
	 * Creates a default region fromId implementation.
	 * 
	 * @param id
	 *            Region Id to set
	 * @return A Region domain instance with no data only its id is set.
	 */
	default Region fromId(Long id) {
		if (id == null) {
			return null;
		}
		Region region = new Region();
		region.setId(id);
		return region;
	}
}
