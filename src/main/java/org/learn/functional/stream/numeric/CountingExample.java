package org.learn.functional.stream.numeric;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.stream.Collectors;

public class CountingExample {

    public static void main(String[] args) {

//        count the number of teachers teaches via online

        long count = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourse)
                .count();
        System.out.println(count);

        count = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourse)
                .collect(Collectors.counting());
        System.out.println(count);




    }
}
