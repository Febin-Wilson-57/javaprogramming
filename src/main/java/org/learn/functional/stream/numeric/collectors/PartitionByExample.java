package org.learn.functional.stream.numeric.collectors;

import org.learn.functional.consumer.Instructor;
import org.learn.functional.consumer.Instructors;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitionByExample {

    public static void main(String[] args) {

        Predicate<Instructor> experiencePredicate = instructor -> instructor.getYearsOfExperience()>10;

        Map<Boolean, List<Instructor>> partitionMap = Instructors.getAll()
                .stream().collect(Collectors.partitioningBy(experiencePredicate));

        partitionMap.forEach((a,b)-> System.out.println(a+" "+b));

        Map<Boolean, Set<Instructor>> partitionMap1 = Instructors.getAll()
                .stream().collect(Collectors.partitioningBy(experiencePredicate, Collectors.toSet()));

        partitionMap1.forEach((a,b)-> System.out.println(a+" "+b));

    }
}
