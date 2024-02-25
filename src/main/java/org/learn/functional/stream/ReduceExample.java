package org.learn.functional.stream;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.IntStream;

public class ReduceExample {

    public static void main(String[] args) {
        long reduce = IntStream.rangeClosed(1, 9).asLongStream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
        long reduceMult = IntStream.rangeClosed(1, 9).asLongStream()
                .reduce(1, (a, b) -> a*b);
        System.out.println(reduceMult);

        OptionalLong reduced = IntStream.rangeClosed(0, 9).asLongStream()
                .reduce((a, b) -> a+b);
        if(reduced.isPresent()) {
            System.out.println(reduced.getAsLong());
        }

        List<Instructor> instructors = Instructors.getAll();
        Optional<Instructor> reduce1 = instructors.stream().reduce((s1, s2) -> {
            if (s1.getYearsOfExperience() > s2.getYearsOfExperience()) {
                return s1;
            } else {
                return s2;
            }
        });
        System.out.println(reduce1.get());
        Optional<Instructor> reduce12 = instructors.stream().reduce((s1, s2) -> {
            return s2.getYearsOfExperience() > s1.getYearsOfExperience() ? s2 : s1;
        });
        System.out.println(reduce12.get());
    }
}
