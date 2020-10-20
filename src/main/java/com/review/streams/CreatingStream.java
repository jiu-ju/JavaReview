package com.review.streams;

import com.review.collections.ArrayLists;
import com.review.oop.encapsulation.Role;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        //Creating stream from an Array
        String[] courses = {"Java", "JS", "TS", "API", "SELENIUM"};
        Stream<String> coursesStream = Arrays.stream(courses);

        //Creating a Stream from a Collection
        Stream<Role> roleStream = ArrayLists.createRoleList().stream();

        //Creating a Stream from Specified Values
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
    }
}
