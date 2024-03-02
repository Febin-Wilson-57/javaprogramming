package org.learn.collection.lambda;

import java.util.Arrays;

public class HelloWorldLambda {

    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = ()->{
            return "Hello World Lambda";
        };
        HelloWorldInterface helloWorldInterface1 =()->"Helloo...";
        System.out.println(helloWorldInterface.sayHelloWorld());
        System.out.println(helloWorldInterface1.sayHelloWorld());
        HelloWorldInterface worldInterface =()-> "Arrays.asList(12,12,1333)";
        System.out.println(worldInterface.sayHelloWorld());
    }
}
