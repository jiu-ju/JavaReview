package com.review.oop.abstraction.service;

import com.review.enums.Gender;
import com.review.oop.abstraction.implementation.UserServiceImplementation;
import com.review.oop.encapsulation.Role;
import com.review.oop.encapsulation.User;

public class UserService implements UserServiceImplementation {

    @Override
    public String userByRoleId(int id) {
        User user = new User("Mike", "Smith", new Role(id, "Admin"), Gender.MALE);
    return user.getFirstName() + " " + user.getLastName();
    }

    @Override
    public User userByFirstName(String firstName) {
        User user = new User(firstName, "Ally", new Role(5, "Employee"), Gender.FEMALE);
        return user;
    }
}
