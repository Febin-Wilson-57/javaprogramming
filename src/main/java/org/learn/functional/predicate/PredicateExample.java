package org.learn.functional.predicate;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Integer> p1 = (i) -> i > 10;
        System.out.println(p1.test(100));

        Predicate<Integer> p2 = (i) -> i % 2 == 0;
        System.out.println(p1.and(p2).test(100));

        System.out.println(p1.or(p2).test(4));

        Predicate<Instructor> instructorPredicate = (i) -> i.isOnlineCourse() == true;

        Predicate<Instructor> instructorPredicate1 = (i) -> i.getYearsOfExperience() > 10;


        Instructors.getAll().forEach(instructor -> {
            if(instructorPredicate.test(instructor)){
                System.out.println(instructor);
            }
        });
        System.out.println("______________");
        Instructors.getAll().forEach(instructor -> {
            if(instructorPredicate.and(instructorPredicate1).test(instructor)){
                System.out.println(instructor);
            }
        });



    }
}
