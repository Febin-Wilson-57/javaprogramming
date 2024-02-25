package org.learn.functional.factoryMethodForCollections;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Syed");
        names.add("Mike");
        names.add("Jenny");
        names = Collections.unmodifiableList(names);
        System.out.println("names = " + names);
//        names.add("Gene");

//        Factory method

        List<String>names1 = List.of("Syed","Mike","Jenny");
        System.out.println("names1 = " + names1);

        Set<String> set = Set.of("Syed","Mike","Jenny");
        Map<String,String> map = Map.of("Grade1","Syed","Grade2","Mike");
        System.out.println("map = " + map);


//        names1.add("Gene");
//        set= Set.of("Syed","Mike","Syed","Jenny");
        names.sort(Comparator.naturalOrder());
        
    }
}
