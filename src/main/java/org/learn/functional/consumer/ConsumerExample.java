package org.learn.functional.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> stringConsumer=(x)-> System.out.println(x);
        stringConsumer.accept("jojojooooooooooo");

        Consumer<Integer> integerConsumer=(x)->{
            System.out.println("x * x :"+x*x);
        };
        integerConsumer.accept(7);
    }
}
