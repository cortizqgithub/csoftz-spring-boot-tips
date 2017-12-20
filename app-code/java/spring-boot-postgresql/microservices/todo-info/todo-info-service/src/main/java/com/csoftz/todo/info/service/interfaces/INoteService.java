/*----------------------------------------------------------------------------*/
/* Source File:   INOTESERVICE.JAVA                                           */
/* Description:   Interface for Service to retrieve Note information          */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Dec.20/2017                                                 */
/* Last Modified: Dec.20/2017                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Dec.20/2017  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.todo.info.service.interfaces;

import com.csoftz.todo.info.domain.Note;

import java.util.List;
import java.util.Optional;

/**
 * Interface for Service to retrieve Note information
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.20/2017
 * @since 1.8 (JDK), Dec.20/2017
 */
public interface INoteService {

    /**
     * Saves information
     *
     * @param note Sets the data to store
     * @return New/update record.
     */
    Note save(Note note);

    /**
     * View all the information for all notes
     *
     * @return List of notes
     */
    List<Note> findAll();

    /**
     * Locate record from store.
     *
     * @return An optional indicating if one is found or not.
     */
    Optional<Note> findOne(Long id);
}