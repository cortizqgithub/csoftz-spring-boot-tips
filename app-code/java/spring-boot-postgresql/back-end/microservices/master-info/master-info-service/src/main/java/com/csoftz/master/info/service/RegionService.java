/*----------------------------------------------------------------------------*/
/* Source File:   REGIONSERVICE.JAVA                                          */
/* Description:   Service to retrieve Region information                      */
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
package com.csoftz.master.info.service;

import java.util.List;
import java.util.Optional;

import com.csoftz.master.info.service.interfaces.IRegionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.csoftz.master.info.data.interfaces.IRegionRepository;
import com.csoftz.master.info.data.interfaces.mapper.IRegionMapper;
import com.csoftz.master.info.domain.Region;
import com.csoftz.master.info.entity.RegionEntity;

/**
 * Service to retrieve Region information
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.14/2017
 */
@Service
public class RegionService implements IRegionService {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	private final IRegionRepository regionRepository;
	private final IRegionMapper regionMapper;

	/**
	 * Constructor with parameters
	 * 
	 * @param regionRepository
	 *            Injects the service to retrieve data.
	 * @param regionMapper
	 *            Injects the service to map Region/RegionEntity objects.
	 */
	public RegionService(IRegionRepository regionRepository, IRegionMapper regionMapper) {
		this.regionRepository = regionRepository;
		this.regionMapper = regionMapper;
	}

	/**
	 * @see IRegionService#save(Region)
	 */
	@Override
	public Region save(Region region) {
		log.debug("Request to save Region : {}", region);
		RegionEntity regionEntity = regionMapper.toEntity(region);
		regionEntity = this.regionRepository.save(regionEntity);
		return regionMapper.toDomain(regionEntity);
	}

	/**
	 * @see IRegionService#findAll()
	 */
	@Override
	public List<Region> findAll() {
		log.debug("Request to get all records (Data tier)");
		return regionMapper.toDomain(this.regionRepository.findAll());
	}

	/**
	 * @see IRegionService#findOne(java.lang.Long)
	 */
	@Override
	public Optional<Region> findOne(Long id) {
		RegionEntity regionEntity = this.regionRepository.findOne(id);
		Region region = this.regionMapper.toDomain(regionEntity);
		if (region == null) {
			return Optional.empty();
		} else {
			return Optional.of(region);
		}
	}

}
