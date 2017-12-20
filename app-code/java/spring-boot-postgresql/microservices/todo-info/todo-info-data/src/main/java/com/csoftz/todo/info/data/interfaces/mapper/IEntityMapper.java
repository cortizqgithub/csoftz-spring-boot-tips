/*----------------------------------------------------------------------------*/
/* Source File:   ENTITYMAPPER.JAVA                                           */
/* Description:   Base interface for common operations about mappers          */
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
package com.csoftz.todo.info.data.interfaces.mapper;

import java.util.List;

/**
 * Base interface for common operations about mappers
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.20/2017
 * @since 1.8 (JDK), Dec.20/2017
 */
public interface IEntityMapper<D, E> {

    /**
     * Copies all data from domain object (D) to entity object (E)
     *
     * @param domain Instance to domain object.
     * @return Converted entity object instance.
     */
    E toEntity(D domain);

    /**
     * Copies all data from entity object (E) to domain object (D).
     *
     * @param entity Instance to entity object.
     * @return Converted domain object instance.
     */
    D toDomain(E entity);

    /**
     * Used to map a list of domain objects to entity objects.
     *
     * @param domainList List to process.
     * @return A list of entity objects.
     */
    List<E> toEntity(List<D> domainList);

    /**
     * Used to map a list of entity (E) objects to domain (D) objects.
     *
     * @param entityList List to process.
     * @return A list of domain objects.
     */
    List<D> toDomain(List<E> entityList);
}