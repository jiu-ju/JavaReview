package com.review.lambda.sorting;

import com.review.oop.encapsulation.Role;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
// @Data covers @Getters, @Setters, @ToString, but not the constructors
public class Employee {
    private Integer employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeCity;
    private Role role;


}
