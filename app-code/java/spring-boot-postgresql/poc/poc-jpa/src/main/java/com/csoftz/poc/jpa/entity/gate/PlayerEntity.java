/*----------------------------------------------------------------------------*/
/* Source File:   PLAYERENTITY.JAVA                                           */
/* Description:   JPA Player Entity (Maps to Player domain object).           */
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

package com.csoftz.poc.jpa.entity.gate;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * JPA Player Entity (Maps to Player domain object)
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Apr.23/2018
 * @since 1.8 (JDK), Apr.21/2018
 */
@Entity
@Table(name = "player")
@Data
@NoArgsConstructor
@SuppressWarnings("ALL")
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_seq")
    @SequenceGenerator(name = "player_seq", sequenceName = "player_sequence", allocationSize = 1)
    private Long id;
    private String name;
    private int num;
    private String position;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", nullable = false)
    private TeamEntity team;

    /**
     * Constructs with Player info only.
     *
     * @param name     Player name.
     * @param num      Player num.
     * @param position Player position.
     * @param team     Player team it belongs to.
     */
    public PlayerEntity(String name, int num, String position, TeamEntity team) {
        this.name = name;
        this.num = num;
        this.position = position;
        this.team = team;
    }
}
