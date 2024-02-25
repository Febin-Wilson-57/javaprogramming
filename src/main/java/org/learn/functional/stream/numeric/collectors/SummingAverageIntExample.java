package org.learn.functional.stream.numeric.collectors;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.stream.Collectors;

public class SummingAverageIntExample {
    public static void main(String[] args) {

        int sum= Instructors.getAll().stream().collect(Collectors.summingInt(Instructor::getYearsOfExperience));
        System.out.println(sum);
        sum = Instructors.getAll().stream()
                .mapToInt(Instructor::getYearsOfExperience).sum();
        System.out.println(sum);

        double average =  Instructors.getAll().stream().collect(Collectors.averagingInt(Instructor::getYearsOfExperience));
        System.out.println(average);
    }
}
