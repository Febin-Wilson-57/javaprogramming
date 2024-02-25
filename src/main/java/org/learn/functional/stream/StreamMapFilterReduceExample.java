package org.learn.functional.stream;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.List;

public class StreamMapFilterReduceExample {

    public static void main(String[] args) {

        //total yeas of experience between instructors

        List<Instructor> instructors = Instructors.getAll();

        Integer reduce = instructors.stream()
                .filter(Instructor::isOnlineCourse)
                .map(Instructor::getYearsOfExperience)
                .reduce(0, Integer::sum);
        System.out.println(reduce);
    }
}
