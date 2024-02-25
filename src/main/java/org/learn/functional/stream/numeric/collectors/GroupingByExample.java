package org.learn.functional.stream.numeric.collectors;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) {

//        groupingBy()
        List<String> names = List.of("Syed","mike","jenny","Gene","Rajeev");
        Map<Integer, List<String>> collect = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);

        Map<String, List<String>> collect1 = Instructors.getAll().stream().collect(Collectors.groupingBy(Instructor::getGender,Collectors.mapping(Instructor::getName,Collectors.toList())));

        collect1.forEach((a,b)-> System.out.println(a+" "+b));

        Map<String, List<Instructor>> collect2 = Instructors.getAll().stream().collect(Collectors.groupingBy(instructor -> instructor.getYearsOfExperience() > 10 ? "SENIOR" : "JUNIOR"));
        collect2.forEach((a,b)-> System.out.println(a+" "+b));

//        GroupingBy(classifier,downstream)

        List<String> newNames = List.of("Sid","Mike","Jenny","Gene","Rajeev");
        Map<Integer,List<String>> namesMap = newNames.stream()
                .collect(Collectors.groupingBy(String::length,
                        Collectors.filtering(s->s.contains("e"),Collectors.toList())));
        namesMap.forEach((a,b)-> System.out.println(a+" "+b));


        Map<String, List<Instructor>> collect3 = Instructors.getAll().stream().
                collect(Collectors.groupingBy(instructor ->
                                instructor.getYearsOfExperience() > 10 ? "SENIOR" : "JUNIOR",
                        Collectors.filtering(Instructor::isOnlineCourse, Collectors.toList())));

        collect3.forEach((a,b)-> System.out.println(a+" "+b));


//        groupingBy(classifier,MapFactory,downstream)

        LinkedHashMap<Integer,List<String>> namesFactoryMap = newNames.stream()
                .collect(Collectors.groupingBy(String::length, LinkedHashMap::new,
                        Collectors.filtering(s->s.contains("e"),Collectors.toList())));
        namesMap.forEach((a,b)-> System.out.println(a+" "+b));

    }
}
