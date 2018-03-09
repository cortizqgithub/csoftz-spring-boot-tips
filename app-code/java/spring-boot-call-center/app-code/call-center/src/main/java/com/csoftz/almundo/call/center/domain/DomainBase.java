/*----------------------------------------------------------------------------*/
/* Source File:   DOMAINBASE.JAVA                                             */
/* Description:   Model/domain beginning of class hierarchy.                  */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Mar.06/2018                                                 */
/* Last Modified: Mar.06/2018                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2018 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Mar.06/2018  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.almundo.call.center.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * Model/domain beginning of class hierarchy.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Mar.06/2018
 * @since 1.8 (JDK), Mar.06/2018
 */
@ToString
public abstract class DomainBase {
    @Getter
    private LocalDateTime creationDate;

    @Getter
    @Setter
    private LocalDateTime updateDate;

    @Getter
    @Setter
    private String user;

    public DomainBase() {
        this.creationDate = LocalDateTime.now();
    }

    /**
     * Internal constructor for Builder Annotations to sucessfully to properly work.
     *
     * @param creationDate When object is created
     * @param updateDate When object is updated
     * @param user Who made the cange.
     */
    protected DomainBase(LocalDateTime creationDate,
                         LocalDateTime updateDate,
                         String user) {
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.user = user;
    }
}
