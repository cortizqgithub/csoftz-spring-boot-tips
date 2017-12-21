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
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
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
     * @see INoteService#findAllFlux()
     */
    @Override
    public Flux<Note> findAllFlux() {
        log.debug("Request to get all records (Data tier) With Flux");
        return Flux.fromIterable(this.findAll());
    }

    /**
     * @see INoteService#findOne(java.lang.Long)
     */
    @Override
    public Optional<Note> findOne(Long id) {
        Optional<NoteEntity> noteEntity = this.noteRepository.findById(id);
        if (!noteEntity.isPresent()) {
            return Optional.of (Note.builder().creationDate(LocalDateTime.now()).build());
        } else {
            return Optional.of(this.noteMapper.toDomain(noteEntity.get()));
        }
    }

    /**
     * @see INoteService#findOneMono(java.lang.Long)
     */
    @Override
    public Mono<Optional<Note>> findOneMono(Long id) {
        return Mono.just(this.findOne(id));
    }
}
