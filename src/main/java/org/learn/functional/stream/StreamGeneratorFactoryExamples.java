package org.learn.functional.stream;

import java.util.Random;
import java.util.stream.Stream;

public class StreamGeneratorFactoryExamples {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        integerStream.forEach(System.out::println);

        Stream<Integer> integerStream1 = Stream.iterate(0,i->i+2);
        integerStream1.limit(10).forEach(System.out::println);

        System.out.println("---------------");

        Stream<Integer> integerStream2 = Stream.generate(new Random()::nextInt);
        integerStream2.limit(10).forEach(System.out::println);
    }
}
