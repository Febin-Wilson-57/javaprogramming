package org.learn.functional.method;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.function.Predicate;

public class ConvertToMethodReferenceExample {

    public static void main(String[] args) {
        Predicate<Instructor> p = ConvertToMethodReferenceExample::greaterThanTen;
        Instructors.getAll().forEach(instructor -> {
            if(p.test(instructor)){
                System.out.println(instructor);
            }
        });




    }

    public static boolean greaterThanTen(Instructor instructor){
        return instructor.getYearsOfExperience() > 10;
    }
}
