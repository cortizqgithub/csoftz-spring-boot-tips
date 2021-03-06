/*----------------------------------------------------------------------------*/
/* Source File:   GLOBALS.JAVA                                                */
/* Description:   General constants definitions.                              */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Dec.20/2017                                                 */
/* Last Modified: Dec.20/2017                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Dec.20/2017 COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.todo.info.common.consts;

/**
 * General constants definitions. <br>
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Dec.20/2017
 * @since 1.8 (JDK), Dec.20/2017
 */
public class Globals {
    /*
     * General
     */
    public static final String SYS_USER = "SYSUSER";

    /**
     * Defined to make SonarLint compliant.
     */
    private Globals() {
        throw new IllegalStateException("Utility class");
    }
}
