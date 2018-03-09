/*----------------------------------------------------------------------------*/
/* Source File:   EMPLOYEECONTROLLER.JAVA                                     */
/* Description:   Rest API Employee Controller                                */
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
package com.csoftz.almundo.call.center.api.controller;

import com.csoftz.almundo.call.center.common.EmployeeListHelper;
import com.csoftz.almundo.call.center.domain.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Rest API Employee Controller
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Mar.06/2018
 * @since 1.8 (JDK), Mar.06/2018
 */
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    /**
     * REST API Get entry point to gather all registered employees.
     * GET: /api/v1/employee/all
     * @return
     */
    @GetMapping("/all")
    public List<Employee> getAll() {
        return new EmployeeListHelper().build();
    }
}
