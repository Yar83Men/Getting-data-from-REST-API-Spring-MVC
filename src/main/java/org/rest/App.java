package org.rest;


import org.rest.configuration.MyConfiguration;
import org.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfiguration.class);

        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.showAllEmployees();
        //System.out.println(allEmployees);

        Employee empById = communication.getEmployee(3);
        //System.out.println(empById);

//        Employee emp = new Employee("Sveta", "Sokolova", 900, "HR");
//        communication.saveEmployee(emp);

        communication.deleteEmployee(9);
    }
}
