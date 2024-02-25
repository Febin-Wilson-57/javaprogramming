package org.learn.functional.biconsumer;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer =(x,y)-> System.out.println(x+y);
        biConsumer.accept(12,12);

        List<Instructor> instructors = Instructors.getAll();

        BiConsumer<String,String> biConsumer1=(name,gender)-> System.out.println("name is :"+name+" and gender is :"+gender);

        instructors.forEach(instructor -> {
            biConsumer1.accept(instructor.getName(), instructor.getGender());
        });

        BiConsumer<String,List<String>> biConsumer2 = (name,courses)->
                System.out.println("name is :"+name+" and courses:"+courses);
        instructors.forEach(instructor -> {
            biConsumer2.accept(instructor.getName(), instructor.getCourses());
        });

    }
}
