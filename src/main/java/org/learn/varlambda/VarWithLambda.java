package org.learn.varlambda;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.function.Predicate;

public class VarWithLambda {

    public static void main(String[] args) {
        var instructors = Instructors.getAll();

        Predicate<Instructor> experiencePredicate = (var s)->
                s.getYearsOfExperience()>10;
        instructors.forEach(instructor -> {
            if(experiencePredicate.test(instructor)){
                var result = instructor.getName();
                System.out.println(result);
            }
        });

    }



}
