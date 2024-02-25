package org.learn.collection.lambda;

public class HelloWorldLambda {

    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = ()->{
            return "Hello World Lambda";
        };
        HelloWorldInterface helloWorldInterface1 =()->"Helloo...";
        System.out.println(helloWorldInterface.sayHelloWorld());
        System.out.println(helloWorldInterface1.sayHelloWorld());
    }
}
