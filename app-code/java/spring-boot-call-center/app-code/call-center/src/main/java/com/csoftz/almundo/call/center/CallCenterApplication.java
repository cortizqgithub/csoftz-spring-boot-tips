/*----------------------------------------------------------------------------*/
/* Source File:   CALLCENTERAPPLICATION.JAVA                                  */
/* Description:   Spring Boot Call Center entry point for application         */
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
package com.csoftz.almundo.call.center;

import com.csoftz.almundo.call.center.common.EmployeeListHelper;
import com.csoftz.almundo.call.center.common.EmployeeType;
import com.csoftz.almundo.call.center.domain.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Spring Boot Call Center entry point for application
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Mar.06/2018
 * @since 1.8 (JDK), Mar.06/2018
 */
@SpringBootApplication
public class CallCenterApplication implements CommandLineRunner {

    /**
     * Application main entry point
     * @param args Command line arguments passed for application.
     */
    public static void main(String[] args) {
        SpringApplication.run(CallCenterApplication.class, args);
    }

    /**
     * Execute the command line runner task.
     * @param args Command line arguments.
     * @throws Exception Captures any exception when executiong.
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Call Center Dispacher App V1.0.0 RELEASE Mar.6/2018");

        List<Employee> employeeList = new EmployeeListHelper().build();
        List<Employee> operators = employeeList.stream().filter(e -> e.getEmployeeType() == EmployeeType.OPERATOR).collect(Collectors.toList());
        System.out.println("OPERATORS");
        System.out.println(operators);
        System.out.println("There are " + operators.size());
    }
}
