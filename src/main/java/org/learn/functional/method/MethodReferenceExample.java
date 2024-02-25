package org.learn.functional.method;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {


    public static void main(String[] args) {
        Function<Integer,Double> function = Math::sqrt;
        System.out.println(function.apply(12));
        List<Instructor> instructorList= Instructors.getAll();
        Predicate<Instructor> instructorPredicate = Instructor::isOnlineCourse;
    }
}
