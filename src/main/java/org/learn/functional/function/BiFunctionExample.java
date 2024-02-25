package org.learn.functional.function;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    public static void main(String[] args) {


        List<Instructor> instructors = Instructors.getAll();
        Predicate<Instructor> instructorPredicate= i->i.isOnlineCourse();
        BiFunction<List<Instructor>,Predicate<Instructor>, Map<String, Integer>> mapBiFunction =
                (instructors1,instructorPred) -> {
                    Map<String, Integer> map = new HashMap<>();
                    instructors1.forEach(instructor -> {
                        if(instructorPred.test(instructor)) {
                            map.put(instructor.getName(), instructor.getYearsOfExperience());
                        }
                    });
                    return map;
                };
        System.out.println(mapBiFunction.apply(instructors,instructorPredicate));



    }
}
