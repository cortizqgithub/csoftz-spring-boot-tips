/*----------------------------------------------------------------------------*/
/* Source File:   TEAMREPOSITORY.JAVA                                         */
/* Description:   JPA Team Repository to handle Team Entities.                */
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

import com.csoftz.poc.jpa.entity.gate.TeamEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * JPA Team Repository to handle Team Entities.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Apr.21/2018
 * @since 1.8 (JDK), Apr.21/2018
 */
@Repository
public interface TeamRepository extends CrudRepository<TeamEntity, Long> {
    /**
     * Retrieve the Team a player belongs to.
     *
     * @param playerId Identification of player to use
     * @return Information about the Team.
     */
    TeamEntity findByPlayers(long playerId);
}
