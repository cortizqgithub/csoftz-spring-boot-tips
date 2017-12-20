/*----------------------------------------------------------------------------*/
/* Source File:   NOTEMAPPER.JAVA                                             */
/* Description:   Converts objects from/to Note/NoteEntity                    */
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
package com.csoftz.master.info.data.interfaces.mapper;

import com.csoftz.master.info.domain.Note;
import com.csoftz.master.info.entity.NoteEntity;
import org.mapstruct.Mapper;

/**
 * Converts objects from/to Note/NoteEntity
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.20/2017
 * @since 1.8 (JDK), Dec.20/2017
 */
@Mapper(componentModel = "spring", uses = {})
public interface INoteMapper extends IEntityMapper<Note, NoteEntity> {
    /**
     * Creates a default note fromId implementation.
     *
     * @param id Note Id to set
     * @return A Note domain instance with no data only its id is set.
     */
    default Note fromId(Long id) {
        if (id == null) {
            return null;
        }
        Note note = new Note();
        note.setId(id);
        return note;
    }
}
