package org.learn.functional.method;

import org.learn.functional.InstructorFactory;
import org.learn.functional.consumer.Instructor;

import java.util.Arrays;

public class ConstructorReferenceExamplpe {

    public static void main(String[] args) {
        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor3 =instructorFactory.getInstructor("Gene", 6, "Manager",
                "M", false, Arrays.asList("C++ programming", "C Programming", "React Native"));
        System.out.println(instructor3);


    }
}
