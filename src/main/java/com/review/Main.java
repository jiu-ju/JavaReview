package com.review;
import com.review.core.Loops;
import com.review.core.Methods;
import com.review.core.SelectionStatements;
import com.review.enums.Gender;
import com.review.enums.Status;
import com.review.oop.abstraction.implementation.UserServiceImplementation;
import com.review.oop.abstraction.service.UserService;
import com.review.oop.encapsulation.Role;
import com.review.oop.encapsulation.User;
import com.review.oop.inheritance.BaseEntity;
import com.review.oop.inheritance.Project;
import com.review.oop.polymorphism.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        //*******CORE*******//

        // I can't call directly instance method
        // To call the instance method we need an object
        Methods methods = new Methods();// we created an object
        methods.methodA();
        methods.methodA("Apple");
        System.out.println(methods.methodB()); // whatever you holding, just print it
        System.out.println(methods.methodB(6));

        //I call the static method with the class name
        Methods.methodC();

        Loops.demoForIterator();
        Loops.demoForEach();

        SelectionStatements.demoIfStatement();
        SelectionStatements.demoSwitchCaseStatement();


    //*******OOP-Encapsulation*****//
        User user = new User
                ("Mike", "Smith",new Role(2, "Manager"), Gender.MALE);
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDescription());

    //***********OOP_Inheritance***********//
    Project project = new Project
            (1, LocalDateTime.now(), 1, LocalDateTime.now().minusHours(5), 1, "PRJ001", "Human Resource CRM",
                    new User("Mike", "Smith", new Role(1, "Manager"), Gender.MALE),
                    LocalDate.now(), LocalDate.now().plusMonths(6), Status.IN_PROGRESS, "HCRM Detail Information");

    //***********OOP-Interface***********//
        UserService userService = new UserService();
    System.out.println(userService.userByFirstName("Mike").getLastName());

    //***********OOP-Polymorphism***********//
        Employee employee = new Employee();
        BaseEntity employee2 = new Employee();
        UserServiceImplementation userServiceImplementation = new UserService();

        employee.getEmployeeHours();

        ((Employee)employee2).getEmployeeHours(); //Down Casting


    //***********ENUM***********//
        System.out.println(Gender.FEMALE);
        System.out.println(Status.IN_PROGRESS.getValue().substring(2));
    }
}
