/*----------------------------------------------------------------------------*/
/* Source File:   TEAMENTITY.JAVA                                             */
/* Description:   JPA Team Entity (Maps to Team domain object).               */
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

package com.csoftz.poc.jpa.entity.gate;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.List;

/**
 * JPA Team Entity (Maps to Team domain object).
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Apr.21/2018
 * @since 1.8 (JDK), Apr.21/2018
 */
@Entity
@Table(name = "team")
@Data
@NoArgsConstructor
@SuppressWarnings("ALL")
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_seq")
    @SequenceGenerator(name = "team_seq", sequenceName = "team_sequence", allocationSize = 1)
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "team")
    private List<PlayerEntity> players;

    /**
     * Constructs with Team only info.
     * @param name Team name.
     */
    public TeamEntity(String name) {
        this.name = name;
    }
}
