package org.learn.functional.stream.numeric.collectors;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMappingExample {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        List<String> names=instructors.stream().map(Instructor::getName).collect(Collectors.toList());
        names.forEach(System.out::println);

        List<String> names1 = instructors.stream().collect(Collectors.mapping(Instructor::getName,Collectors.toList()));
        names1.forEach(System.out::println);


        Map<Integer, List<String>> collect = instructors.stream().collect(Collectors.groupingBy(Instructor::getYearsOfExperience, Collectors.mapping(Instructor::getName, Collectors.toList())));
collect.forEach((i,j)->{
    System.out.println(i+" "+j);
});

    }
}
