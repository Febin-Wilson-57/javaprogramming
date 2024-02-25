package org.learn.functional.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVsCollectionExample {

    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("Mike");
        names.add("Syed");
        names.add("Rajeev");
        System.out.println(names);
//        names.add("joji");
        names.remove("Syed");
        System.out.println(names);
        System.out.println("-------------------");
        for(String name:names){
            System.out.println(name);
        }
        System.out.println("-------------------");
        for(String name:names){
            System.out.println(name);
        }
        System.out.println("-------------------");
        for(String name:names){
            System.out.println(name);
        }
        System.out.println("-------------------");

        Stream<String> stringStream = names.stream();
        System.out.println("========================");
        stringStream.forEach(System.out::println);
        System.out.println("========================");
//        stringStream.forEach(System.out::println);

        List<String> collected = names.stream().filter(s -> s.startsWith("M")).collect(Collectors.toList());
        System.out.println(collected);

    }
}
