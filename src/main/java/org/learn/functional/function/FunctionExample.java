package org.learn.functional.function;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Double> sqrt = (n) -> Math.sqrt(n);
        System.out.println(sqrt.apply(64));
        System.out.println(sqrt.apply(81));

        Function<String, String> lowerToUpper = s -> s.toLowerCase();
        System.out.println(lowerToUpper.apply("Theee GG dfsd HHH"));
        Function<String, String> concat = s -> s.concat("JJJJjlkk");
        System.out.println(lowerToUpper.andThen(concat).apply("pro:"));
        System.out.println(lowerToUpper.compose(concat).apply("PRO:"));


        System.out.println("------------------------------------------------------------");

        List<Instructor> instructors = Instructors.getAll();
        Predicate<Instructor>instructorPredicate= i->i.isOnlineCourse();
        Function<List<Instructor>, Map<String, Integer>> mapFunction =
                instructors1 -> {
                    Map<String, Integer> map = new HashMap<>();
                    instructors1.forEach(instructor -> {
                        if(instructorPredicate.test(instructor)) {
                            map.put(instructor.getName(), instructor.getYearsOfExperience());
                        }
                    });
                    return map;
                };
        System.out.println(mapFunction.apply(instructors));


    }
}
