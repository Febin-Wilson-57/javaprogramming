package org.learn.functional.stream;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {

    public static void main(String[] args) {

        List<Instructor> list= Instructors.getAll().stream()
                .sorted(Comparator.comparing(Instructor::getName))
                .collect(Collectors.toList());
list.forEach(System.out::println);
list.removeIf(instructor -> instructor.getYearsOfExperience()>10);
        System.out.println("_______________");
list.forEach(System.out::println);
    }
}
