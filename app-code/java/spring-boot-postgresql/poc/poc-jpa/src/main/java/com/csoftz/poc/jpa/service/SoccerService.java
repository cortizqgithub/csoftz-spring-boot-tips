/*----------------------------------------------------------------------------*/
/* Source File:   SOCCERSERVICE.JAVA                                          */
/* Description:   Service interface to handle Soccer teams.                   */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Apr.21/2018                                                 */
/* Last Modified: Apr.23/2018                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2018 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Apr.21/2018  COQ  File created.
 -----------------------------------------------------------------------------*/

package com.csoftz.poc.jpa.service;

import com.csoftz.poc.jpa.entity.gate.TeamEntity;

import java.util.List;

/**
 * Service interface to handle Soccer teams.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Apr.23/2018
 * @since 1.8 (JDK), Apr.21/2018
 */
public interface SoccerService {

    /**
     * Saves a new team with all supplied team information.
     * @param team All team information Entity object to save
     * @return A reference to newly created team.
     */
    TeamEntity saveFullTeam(TeamEntity team);

    /**
     * Creates a new team entity.
     * @param name Team name.
     * @return A reference to newly created team.
     */
    TeamEntity addNewTeam(String name);

    /**
     * Get all player names for selected team.
     *
     * @param teamId Identification of team to use.
     * @return List of player names.
     */
    List<String> getAllTeamPlayers(long teamId);

    /**
     * Adds a new player to default team.
     * @param name Player name
     * @param position Player position
     * @param number Player number
     */
    void addBarcelonaPlayer(String name, String position, int number);

    /**
     * Adds a new player to supplied team.
     * @param team Instance of team to work on.
     * @param name Player name
     * @param position Player position
     * @param number Player number.
     */
    void addTeamPlayer(TeamEntity team, String name, String position, int number);
}
