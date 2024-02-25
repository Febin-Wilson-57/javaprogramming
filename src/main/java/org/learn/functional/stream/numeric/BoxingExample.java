package org.learn.functional.stream.numeric;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class BoxingExample {


    public static void main(String[] args) {

        List<Integer>numbers;
        IntStream intStream= IntStream.rangeClosed(0,5000);
        numbers = intStream.boxed().collect(Collectors.toList());
        numbers.stream().limit(4).forEach(System.out::println);
        Optional<Integer> sum = numbers.stream().reduce((a,b)->a+b);
        sum.ifPresent(System.out::println);
        int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum1);

        //Map TO Object
        System.out.println("Map TO Object");
        List<RandomIds> randomIds = IntStream.rangeClosed(0,5)
                .mapToObj((i)->{
                    return new RandomIds(i, ThreadLocalRandom.current().nextInt(100));
                }).collect(Collectors.toList());
        randomIds.forEach(System.out::println);

        LongStream longStream = IntStream.rangeClosed(0,5)
                .mapToLong(i->(long) i);
        longStream.forEach(System.out::println);




    }
}
class RandomIds{
    int id;
    int randomNumber;

    public RandomIds(int id, int randomNumber) {
        this.id = id;
        this.randomNumber = randomNumber;
    }

    @Override
    public String toString() {
        return "RandomIds{" +
                "id=" + id +
                ", randomNumber=" + randomNumber +
                '}';
    }
}