package org.learn.functional.stream.numeric.collectors;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMinByMaxByExample {

    public static void main(String[] args) {


        Optional<Instructor> instructor = Instructors.getAll().stream()
                .collect(Collectors.minBy(Comparator.comparing(Instructor::getYearsOfExperience)));
        System.out.println(instructor);
        System.out.println(";;;;;;;;");
        instructor = Instructors.getAll().stream()
                .min(Comparator.comparing(Instructor::getYearsOfExperience));

        System.out.println(instructor);

        instructor = Instructors.getAll().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)));
        System.out.println(instructor);

        instructor = Instructors.getAll().stream()
                .max(Comparator.comparing(Instructor::getYearsOfExperience));
        System.out.println(instructor);
    }

}
