package org.learn.functional.stream.numeric.collectors;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Map;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingMinMaxAvrgExample {

    public static void main(String[] args) {
        Map<Boolean, Optional<Instructor>> maxInstructors
                = Instructors.getAll().stream().collect(Collectors.
                groupingBy(Instructor::isOnlineCourse,Collectors.maxBy(
                        Comparator.comparing(Instructor::getYearsOfExperience)
                )));
        maxInstructors.forEach((a,b)->
                System.out.println(a+" "+b));
        System.out.println("------------------------------");
//        collectingandthen
        Map<Boolean, Instructor> maxInstructors1
                = Instructors.getAll().stream().collect(Collectors.
                groupingBy(Instructor::isOnlineCourse,Collectors.collectingAndThen(Collectors.maxBy(
                        Comparator.comparing(Instructor::getYearsOfExperience)),Optional::get
                )));
        maxInstructors1.forEach((a,b)->
                System.out.println(a+" "+b));

        System.out.println("-----------------");
        Map<Boolean, Instructor> maxInstructorsmap
                = Instructors.getAll().stream().collect(Collectors.toMap(Instructor::isOnlineCourse, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(Instructor::getYearsOfExperience))));
        System.out.println("maxInstructorsmap");
        maxInstructorsmap.forEach((a,b)->
                System.out.println(a+" "+b));

        Map<Boolean, Double> maxInstructors2
                = Instructors.getAll().stream().collect(Collectors.
                groupingBy(Instructor::isOnlineCourse,Collectors.averagingInt(
                        Instructor::getYearsOfExperience)
                ));
        maxInstructors2.forEach((a,b)->
                System.out.println(a+" "+b));

        Map<Boolean, IntSummaryStatistics> maxInstructors3
                = Instructors.getAll().stream().collect(Collectors.
                groupingBy(Instructor::isOnlineCourse,Collectors.summarizingInt(
                        Instructor::getYearsOfExperience)
                ));
        maxInstructors3.forEach((a,b)->
                System.out.println(a+" "+b));


    }
}
