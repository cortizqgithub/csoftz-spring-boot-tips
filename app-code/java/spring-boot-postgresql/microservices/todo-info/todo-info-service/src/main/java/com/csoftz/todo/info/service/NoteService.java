/*----------------------------------------------------------------------------*/
/* Source File:   NOTESERVICE.JAVA                                            */
/* Description:   Service to retrieve Note information                        */
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
package com.csoftz.todo.info.service;

import com.csoftz.todo.info.data.interfaces.INoteRepository;
import com.csoftz.todo.info.data.interfaces.mapper.INoteMapper;
import com.csoftz.todo.info.domain.Note;
import com.csoftz.todo.info.entity.NoteEntity;
import com.csoftz.todo.info.service.interfaces.INoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service to retrieve Note information
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.20/2017
 * @since 1.8 (JDK), Dec.20/2017
 */
@Service
public class NoteService implements INoteService {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final INoteRepository noteRepository;
    private final INoteMapper noteMapper;

    /**
     * Constructor with parameters
     *
     * @param noteRepository Injects the service to retrieve data.
     * @param noteMapper     Injects the service to map Note/NoteEntity objects.
     */
    public NoteService(INoteRepository noteRepository, INoteMapper noteMapper) {
        this.noteRepository = noteRepository;
        this.noteMapper = noteMapper;
    }

    /**
     * @see INoteService#save(Note)
     */
    @Override
    public Note save(Note note) {
        log.debug("Request to save Note : {}", note);
        NoteEntity noteEntity = noteMapper.toEntity(note);
        noteEntity = this.noteRepository.save(noteEntity);
        return noteMapper.toDomain(noteEntity);
    }

    /**
     * @see INoteService#findAll()
     */
    @Override
    public List<Note> findAll() {
        log.debug("Request to get all records (Data tier)");
        return noteMapper.toDomain(this.noteRepository.findAll());
    }

    /**
     * @see INoteService#findOne(java.lang.Long)
     */
    @Override
    public Optional<Note> findOne(Long id) {
        NoteEntity noteEntity = this.noteRepository.getOne(id);
        //NoteEntity noteEntity = this.noteRepository.findOne(id);
        Note note = this.noteMapper.toDomain(noteEntity);
        if (note == null) {
            return Optional.empty();
        } else {
            return Optional.of(note);
        }
    }

}
