package org.learn.functional.stream.numeric;

import java.util.Random;
import java.util.stream.IntStream;

public class IntStreamExmaple {

    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1,2,3,4,5);
        intStream.forEach(System.out::println);
        System.out.println("-------------");
        intStream=IntStream.iterate(0,i->i+2).limit(5);
        intStream.forEach(System.out::println);
        System.out.println("-------------");
        intStream = IntStream.generate(new Random()::nextInt).limit(5);
        intStream.forEach(System.out::println);
        System.out.println("-------------");
        IntStream.range(1,5).forEach(System.out::println);
        System.out.println("-------------");
        IntStream.rangeClosed(1,5).forEach(System.out::println);
    }
}
