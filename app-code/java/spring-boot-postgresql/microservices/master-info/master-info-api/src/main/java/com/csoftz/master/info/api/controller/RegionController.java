/*----------------------------------------------------------------------------*/
/* Source File:   REGIONCONTROLLER.JAVA                                       */
/* Description:   Region data controller                                      */
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
package com.csoftz.master.info.api.controller;

import static com.csoftz.master.info.common.consts.Globals.SYS_USER;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csoftz.master.info.domain.Region;
import com.csoftz.master.info.service.interfaces.IRegionService;

/**
 * Region data controller
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.14/2017
 */
@RestController
@RequestMapping("/masterinfo/api/v1/regions")
public class RegionController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	private IRegionService regionService;

	/**
	 * Constructor with parameters
	 * 
	 * @param regionService
	 *            Injects business login manager
	 */
	public RegionController(IRegionService regionService) {
		this.regionService = regionService;
	}

	/**
	 * Saves one new record TEMP
	 * 
	 * @param name
	 * @return
	 */
	@GetMapping("/create/{name}")
	public Region createRegion(@PathVariable String name) {
		log.debug("REST request to create a region with name: {}", name);
		return this.regionService.save(Region.builder().regionName(name).creationDate(LocalDateTime.now())
				.updateDate(LocalDateTime.now()).user(SYS_USER).build());
	}

	/**
	 * Saves one new record TEMP
	 * 
	 * @param name
	 * @return
	 */
	@GetMapping("/update/{id}/{name}")
	public Region updateRegion(@PathVariable Long id, @PathVariable String name) {
		log.debug("REST request to update region: [{0}][{1}]", id, name);
		Optional<Region> existRegion = this.regionService.findOne(id);
		if (existRegion.isPresent()) {
			// OK: Record exist and updates.
			log.debug("Record exists, update in progress.");
			return this.regionService.save(Region.builder().id(id).regionName(name).creationDate(LocalDateTime.now())
					.updateDate(LocalDateTime.now()).user(SYS_USER).build());
		} else {
			// Record does not exist return a
			log.debug("Record does not exist, no operation performed");
			return Region.builder().regionName("NOT FOUND").creationDate(LocalDateTime.now())
					.updateDate(LocalDateTime.now()).user("SYSUSER").build();
		}
	}

	/**
	 * GET /regions/:id : get the "id" region.
	 *
	 * @param id
	 *            the id of the regionDTO to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the regionDTO,
	 *         or with status 404 (Not Found)
	 */
	@GetMapping("/{id}")
	public Region getRegion(@PathVariable Long id) {
		log.debug("REST request to get Region : {}", id);
		return regionService.findOne(id).orElse(Region.builder().regionName("NOT FOUND")
				.creationDate(LocalDateTime.now()).updateDate(LocalDateTime.now()).user("SYSUSER").build());
	}

	/**
	 * Retrieves all Region records from store.
	 * 
	 * @return List of Regions
	 */
	@GetMapping("/all")
	public List<Region> findAll() {
		log.debug("REST request to get all records");
		return this.regionService.findAll();
	}
}