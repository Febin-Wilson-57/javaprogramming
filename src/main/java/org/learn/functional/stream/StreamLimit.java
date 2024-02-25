package org.learn.functional.stream;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimit {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8);
        integerList.stream().limit(5).forEach(System.out::println);
        System.out.println("------------------------------------");
        integerList.stream().skip(5).forEach(System.out::println);


        Optional<Instructor>instructor = Instructors.getAll().stream()
                .findAny();
        instructor.ifPresent(System.out::println);
        Optional<Instructor>instructor1 = Instructors.getAll().stream()
                .findFirst();
        instructor1.ifPresent(System.out::println);
    }
}
