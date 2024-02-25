package org.learn.functional.stream.numeric;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class LongStreamExample {

    public static void main(String[] args) {
        LongStream longStream= LongStream.of(1,2,3,4,5);
        longStream.forEach(System.out::println);

        DoubleStream doubleStream = DoubleStream.of(1.0,2.0,3.0,4.0);
        doubleStream.forEach(System.out::println);

        IntStream intStream = IntStream.range(1,11);
        int sum = intStream.sum();
        System.out.println(sum);
        IntStream.range(1,11).max().ifPresent(System.out::println);
        IntStream.range(1,13).average().ifPresent(System.out::println);

    }
}
