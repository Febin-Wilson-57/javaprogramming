package org.learn.functional.stream;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {
        List<Instructor>instructors = Instructors.getAll();
        List<String> collect = instructors.stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(collect);
        long count = instructors.stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .count();
        System.out.println(count);

        List<String> list =instructors.stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list);

    }
}
