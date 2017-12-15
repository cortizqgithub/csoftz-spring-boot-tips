/*----------------------------------------------------------------------------*/
/* Source File:   REGION.JAVA                                                 */
/* Description:   Region domain object                                        */
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
package com.csoftz.master.info.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Region domain object
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.15/2017
 * @since 1.8 (JDK), Dec.14/2017
 */
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Region extends DomainBase {
	private Long id;
	private String regionName;

	@Builder
	private Region(Long id, String regionName, LocalDateTime creationDate, LocalDateTime updateDate, String user) {
		super(creationDate, updateDate, user);
		this.id = id;
		this.regionName = regionName;
	}
}