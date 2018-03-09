/*----------------------------------------------------------------------------*/
/* Source File:   .JAVA                                           */
/* Description:               */
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

import com.csoftz.almundo.call.center.common.EmployeeListHelper;
import com.csoftz.almundo.call.center.common.EmployeeType;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeTests {
    private List<Employee> employeeList;

    @Before
    public void setUp() {
        employeeList = new EmployeeListHelper().build();
    }

    @Test
    public void givenEmployeeListHas5Operators() {
        List<Employee> operators =
            employeeList.stream().
                filter(e -> e.getEmployeeType() == EmployeeType.OPERATOR).
                collect(Collectors.toList());
        assertThat(operators).hasSize(5);

    }

    @Test
    public void givenEmployeeListHas5Supervisorss() {
        List<Employee> operators =
            employeeList.stream().
                filter(e -> e.getEmployeeType() == EmployeeType.SUPERVISOR).
                collect(Collectors.toList());
        assertThat(operators).hasSize(5);

    }

    @Test
    public void givenEmployeeListHas5Directors() {
        List<Employee> operators =
            employeeList.stream().
                filter(e -> e.getEmployeeType() == EmployeeType.DIRECTOR).
                collect(Collectors.toList());
        assertThat(operators).hasSize(5);

    }
}
