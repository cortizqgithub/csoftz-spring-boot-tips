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
package com.csoftz.almundo.call.center.api.controller;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeControllerTests {
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void givenEmployeeApiControllerReturnsEmployeeList() throws Exception {
        mockMvc.perform(get("/api/v1/employee/all")).andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$").value(Matchers.hasSize(15)))
            .andExpect(jsonPath("$[0].user").value("COQ"))
            .andExpect(jsonPath("$[0].id").value("OP1"))
            .andExpect(jsonPath("$[0].firstName").value("OP"))
            .andExpect(jsonPath("$[0].lastName").value("One"))
            .andExpect(jsonPath("$[0].attendingCall").value(false))
            .andExpect(jsonPath("$[0].employeeType").value("OPERATOR"))
            .andExpect(jsonPath("$[0].user").value("COQ"))
            .andExpect(jsonPath("$[5].id").value("SP1"))
            .andExpect(jsonPath("$[5].firstName").value("SP"))
            .andExpect(jsonPath("$[5].lastName").value("One"))
            .andExpect(jsonPath("$[5].attendingCall").value(false))
            .andExpect(jsonPath("$[5].employeeType").value("SUPERVISOR"))
            .andExpect(jsonPath("$[10].user").value("COQ"))
            .andExpect(jsonPath("$[10].id").value("DT1"))
            .andExpect(jsonPath("$[10].firstName").value("DT"))
            .andExpect(jsonPath("$[10].lastName").value("One"))
            .andExpect(jsonPath("$[10].attendingCall").value(false))
            .andExpect(jsonPath("$[10].employeeType").value("DIRECTOR"));
    }
}
