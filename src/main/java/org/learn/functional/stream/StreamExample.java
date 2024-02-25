package org.learn.functional.stream;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Stream.of("goe","nin","LOL","GOE","LIL").sorted(Collections.reverseOrder()).forEach(System.out::println);

        Predicate<Instructor>p1=Instructor::isOnlineCourse;
        Predicate<Instructor>p2=i->i.getYearsOfExperience()>10;
        List<Instructor>instructors =Instructors.getAll();
        Map<String, List<String>> collect = instructors.stream().filter(p1)
                .filter(p2).collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
        System.out.println(collect);
        instructors.stream().filter(p1).filter(p2);
        instructors.stream()
                .peek(System.out::println)
                .filter(p1)
                .filter(p2)
                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));

    }
}
