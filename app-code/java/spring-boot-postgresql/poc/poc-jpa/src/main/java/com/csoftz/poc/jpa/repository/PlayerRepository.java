/*----------------------------------------------------------------------------*/
/* Source File:   PLAYERREPOSITORY.JAVA                                       */
/* Description:   JPA Player Repository to handle Player Entities.            */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Apr.21/2018                                                 */
/* Last Modified: Apr.21/2018                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2018 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Apr.21/2018  COQ  File created.
 -----------------------------------------------------------------------------*/

package com.csoftz.poc.jpa.repository;

import com.csoftz.poc.jpa.entity.gate.PlayerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * JPA Player Repository to handle Player Entities.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Apr.21/2018
 * @since 1.8 (JDK), Apr.21/2018
 */
@Repository
public interface PlayerRepository extends CrudRepository<PlayerEntity, Long> {
    /**
     * Retrieves a list of players for team.
     *
     * @param teamId Identifier to use
     * @return List of players for team.
     */
    List<PlayerEntity> findByTeamId(long teamId);
}
