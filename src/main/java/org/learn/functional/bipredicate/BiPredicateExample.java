package org.learn.functional.bipredicate;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {

    public static void main(String[] args) {
        List<Instructor> instructors= Instructors.getAll();

        Predicate<Instructor> instructorPredicate = (i)->i.isOnlineCourse() == true;

        Predicate<Instructor>instructorPredicate1 =(i)-> i.getYearsOfExperience()>10;

        BiPredicate<Boolean,Integer> p3 = (online,experience)->online==true && experience>10;
        BiConsumer<String,List<String>> biConsumer=(name, courses)->{
            System.out.println(name+courses);
        };
        instructors.forEach(instructor -> {
            if(p3.test(instructor.isOnlineCourse(),instructor.getYearsOfExperience())){
                biConsumer.accept(instructor.getName(), instructor.getCourses());
            }
        });


    }
}
