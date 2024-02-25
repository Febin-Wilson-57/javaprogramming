package org.learn.functional.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        Consumer<Instructor> c1 = System.out::println;
        instructors.forEach(c1);
        System.out.println("-----------------------");
        Consumer<Instructor> c2= (s1)-> System.out.println(s1.getName());
        instructors.forEach(c2);
        System.out.println("____________________________");
        Consumer<Instructor>c3 = (s1)-> System.out.println(s1.getCourses());
        instructors.forEach(c2.andThen(c3));
        System.out.println("++++++++++++++++++");

        instructors.forEach(instructor -> {
            if(instructor.getYearsOfExperience()>10)
                c1.accept(instructor);
        });

    }
}
