package org.learn.functional.predicate;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumer {

    public static void main(String[] args) {
        List<Instructor> instructors= Instructors.getAll();

        Predicate<Instructor>instructorPredicate = (i)->i.isOnlineCourse() == true;

        Predicate<Instructor>instructorPredicate1 =(i)-> i.getYearsOfExperience()>10;

        BiConsumer<String,List<String>> biConsumer=(name,courses)->{
            System.out.println(name+courses);
        };

        instructors.forEach(instructor -> {
            if(instructorPredicate.and(instructorPredicate1).test(instructor)){
                biConsumer.accept(instructor.getName(), instructor.getCourses());
            }
        });
    }




}
