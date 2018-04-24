/*----------------------------------------------------------------------------*/
/* Source File:   SOCCERSERVICE.JAVA                                          */
/* Description:   Service to handle Soccer teams.                             */
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

import com.csoftz.poc.jpa.entity.gate.PlayerEntity;
import com.csoftz.poc.jpa.entity.gate.TeamEntity;
import com.csoftz.poc.jpa.repository.PlayerRepository;
import com.csoftz.poc.jpa.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service to handle Soccer teams.
 * More information https://github.com/husseinterek/spring-boot-jpa-hibernate
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Apr.23/2018
 * @since 1.8 (JDK), Apr.21/2018
 */
@Service
public class SoccerServiceImpl implements SoccerService {
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public TeamEntity addNewTeam(String name) {
        TeamEntity team = new TeamEntity("Real Madrid");
        team = teamRepository.save(team);
        return team;
    }

    @Override
    public List<String> getAllTeamPlayers(long teamId) {
        List<String> result = new ArrayList<String>();
        List<PlayerEntity> players = playerRepository.findByTeamId(teamId);
        for (PlayerEntity player : players) {
            result.add(player.getName());
        }

        return result;
    }

    @Override
    public void addBarcelonaPlayer(String name, String position, int number) {
        TeamEntity barcelona = teamRepository.findById(1l).get();
        PlayerEntity newPlayer = new PlayerEntity(name, number, position, barcelona);
        playerRepository.save(newPlayer);
    }

    @Override
    public void addTeamPlayer(TeamEntity team, String name, String position, int number) {
        PlayerEntity newPlayer = new PlayerEntity(name, number, position, team);
        playerRepository.save(newPlayer);
    }

    @Override
    public TeamEntity saveFullTeam(TeamEntity team) {
        return teamRepository.save(team);
    }
}
