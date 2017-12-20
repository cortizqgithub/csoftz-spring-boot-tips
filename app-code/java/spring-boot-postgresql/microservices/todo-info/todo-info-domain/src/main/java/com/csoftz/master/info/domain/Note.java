/*----------------------------------------------------------------------------*/
/* Source File:   NOTE.JAVA                                                   */
/* Description:   Note domain object definition                               */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Dec.20/2017                                                 */
/* Last Modified: Dec.20/2017                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Dec.14/2017  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.master.info.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * Note domain object
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.20/2017
 * @since 1.8 (JDK), Dec.20/2017
 */
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Note extends DomainBase {
    private Long id;
    private String noteText;

    @Builder
    private Note(Long id, String noteText, LocalDateTime creationDate, LocalDateTime updateDate, String user) {
        super(creationDate, updateDate, user);
        this.id = id;
        this.noteText = noteText;
    }
}
