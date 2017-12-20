/*----------------------------------------------------------------------------*/
/* Source File:   NOTECONTROLLER.JAVA                                         */
/* Description:   Note data controller                                        */
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
package com.csoftz.todo.info.api.controller;

import com.csoftz.todo.info.domain.Note;
import com.csoftz.todo.info.service.interfaces.INoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static com.csoftz.todo.info.common.consts.Globals.SYS_USER;

/**
 * Note data controller
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.20/2017
 * @since 1.8 (JDK), Dec.20/2017
 */
@RestController
@RequestMapping("/todoinfo/api/v1/notes")
public class NoteController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private INoteService noteService;

    /**
     * Constructor with parameters
     *
     * @param noteService Injects business login manager
     */
    public NoteController(INoteService noteService) {
        this.noteService = noteService;
    }

    /**
     * Saves one new record TEMP
     *
     * @param name
     * @return
     */
    @GetMapping("/create/{name}")
    public Note createNote(@PathVariable String name) {
        log.debug("REST request to create a note with name: {}", name);
        return this.noteService.save(Note.builder().noteText(name).creationDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now()).user(SYS_USER).build());
    }

    /**
     * Saves one new record TEMP
     *
     * @param name
     * @return
     */
    @GetMapping("/update/{id}/{name}")
    public Note updateNote(@PathVariable Long id, @PathVariable String name) {
        log.debug("REST request to update note: [{0}][{1}]", id, name);
        Optional<Note> existNote = this.noteService.findOne(id);
        if (existNote.isPresent()) {
            // OK: Record exist and updates.
            log.debug("Record exists, update in progress.");
            return this.noteService.save(Note.builder().id(id).noteText(name).creationDate(LocalDateTime.now())
                    .updateDate(LocalDateTime.now()).user(SYS_USER).build());
        } else {
            // Record does not exist return a
            log.debug("Record does not exist, no operation performed");
            return Note.builder().noteText("NOT FOUND").creationDate(LocalDateTime.now())
                    .updateDate(LocalDateTime.now()).user("SYSUSER").build();
        }
    }

    /**
     * GET /notes/:id : get the "id" note.
     *
     * @param id the id of the noteDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the noteDTO,
     * or with status 404 (Not Found)
     */
    @GetMapping("/{id}")
    public Note getNote(@PathVariable Long id) {
        log.debug("REST request to get Note : {}", id);
        return noteService.findOne(id).orElse(Note.builder().noteText("NOT FOUND")
                .creationDate(LocalDateTime.now()).updateDate(LocalDateTime.now()).user("SYSUSER").build());
    }

    /**
     * Retrieves all Note records from store.
     *
     * @return List of Notes
     */
    @GetMapping("/all")
    public List<Note> findAll() {
        log.debug("REST request to get all records");
        return this.noteService.findAll();
    }
}
