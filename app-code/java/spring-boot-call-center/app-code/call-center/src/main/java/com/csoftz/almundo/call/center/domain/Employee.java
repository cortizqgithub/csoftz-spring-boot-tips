/*----------------------------------------------------------------------------*/
/* Source File:   EMPLOYEE.JAVA                                               */
/* Description:   Represents the Employee abstraction                         */
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

import com.csoftz.almundo.call.center.common.EmployeeType;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * Represents the Employee abstraction
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Mar.06/2018
 * @since 1.8 (JDK), Mar.06/2018
 */
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Employee extends Person {
    private EmployeeType employeeType;
    private Boolean attendingCall;

    /**
     * Creates the builder using all parameters of class instance to be set
     *
     * @param id            Record identification
     * @param firstName     Start of name
     * @param lastName      Sets the surname part o a name
     * @param employeeType  Designates a classification for User.
     * @param attendingCall True if attending a call.
     * @param creationDate  When record was created
     * @param updateDate    When record is updted
     * @param user          Who made the change.
     */
    @Builder
    private Employee(String id, String firstName, String lastName,
                     EmployeeType employeeType, Boolean attendingCall,
                     LocalDateTime creationDate,
                     LocalDateTime updateDate,
                     String user) {
        super(id, firstName, lastName, creationDate, updateDate, user);
        this.employeeType = employeeType;
        this.attendingCall = attendingCall;
    }
}
