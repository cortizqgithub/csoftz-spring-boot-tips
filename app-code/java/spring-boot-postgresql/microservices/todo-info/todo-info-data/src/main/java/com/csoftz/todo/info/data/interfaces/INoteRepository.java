/*----------------------------------------------------------------------------*/
/* Source File:   INOTEREPOSITORY.JAVA                                        */
/* Description:   Spring JPA interface to 'Note' domain objects.              */
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
package com.csoftz.todo.info.data.interfaces;

import com.csoftz.todo.info.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring JPA interface to 'Region' domain objects.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.20/2017
 * @since 1.8 (JDK), Dec.20/2017
 */
public interface INoteRepository extends JpaRepository<NoteEntity, Long> {
}