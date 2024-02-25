package org.learn.functional.stream.numeric;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {

    public static void main(String[] args) {

        String collect = Stream.of("e", "r", "t", "y").collect(Collectors.joining());
        System.out.println(collect);

        collect = Stream.of("e", "r", "t", "Y").collect(Collectors.joining(","));
        System.out.println(collect);

        collect = Stream.of("E","F","T","U").collect(Collectors.joining(",","{","}"));
        System.out.println(collect);

        String namesConcatenated = Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.joining(",","{","}"));
        System.out.println(namesConcatenated);





    }
}
