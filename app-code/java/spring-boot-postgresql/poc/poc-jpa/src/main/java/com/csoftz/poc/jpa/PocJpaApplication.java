/*----------------------------------------------------------------------------*/
/* Source File:   POCJPAAPPLICATION.JAVA                                      */
/* Description:   POC for JPA studies.                                        */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Feb.28/2018                                                 */
/* Last Modified: Apr.23/2018                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Feb.28/2018  COQ  File created.
 -----------------------------------------------------------------------------*/

package com.csoftz.poc.jpa;

import com.csoftz.poc.jpa.entity.gate.PlayerEntity;
import com.csoftz.poc.jpa.entity.gate.TeamEntity;
import com.csoftz.poc.jpa.service.SoccerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * POC for JPA studies.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Apr.23/2018
 * @since 1.8 (JDK), Feb.28/2018
 */

@SpringBootApplication
@SuppressWarnings("WeakerAccess")
public class PocJpaApplication implements CommandLineRunner {

    /**
     * Spring Boot entry point for Microservice to attend master-info data.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(PocJpaApplication.class, args);
    }

    @Autowired
    SoccerService soccerService;

    @Override
    public void run(String... arg0) throws Exception {
        soccerService.addBarcelonaPlayer("Xavi Hernandez", "Midfielder", 6);
        List<String> players = soccerService.getAllTeamPlayers(1);
        for(String player : players)
        {
            System.out.println("Introducing Barca player => " + player);
        }

        // Here we now create another team.
        TeamEntity team = soccerService.addNewTeam("Real Madrid");
        soccerService.addTeamPlayer(team, "Cristiano", "Field", 7);
        soccerService.addTeamPlayer(team, "Player 2", "Field", 1);

        players = soccerService.getAllTeamPlayers(team.getId());
        players.stream().forEach(System.out::println);

        // Prepare a team entity with all its players and save in one go.
        TeamEntity fullTeamInfo = new TeamEntity("The Full Team");
        List<PlayerEntity> fullTeamPlayers = new ArrayList<>();
        fullTeamInfo.setPlayers(fullTeamPlayers);

        fullTeamPlayers.add(new PlayerEntity("Player 1", 1, "Position 1", fullTeamInfo));
        fullTeamPlayers.add(new PlayerEntity("Player 2", 2, "Position 2", fullTeamInfo));
        fullTeamPlayers.add(new PlayerEntity("Player 3", 3, "Position 3", fullTeamInfo));
        fullTeamPlayers.add(new PlayerEntity("Player 4", 4, "Position 4", fullTeamInfo));
        fullTeamPlayers.add(new PlayerEntity("Player 5", 5, "Position 5", fullTeamInfo));

        TeamEntity savedTeam = soccerService.saveFullTeam(fullTeamInfo);
    }
}
