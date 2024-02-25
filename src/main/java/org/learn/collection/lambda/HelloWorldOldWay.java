package org.learn.collection.lambda;

public class HelloWorldOldWay implements HelloWorldInterface{
    @Override
    public String sayHelloWorld() {
        return "Hello World";
    }

    public static void main(String[] args) {
        HelloWorldOldWay helloWorldOldWay= new HelloWorldOldWay();
        System.out.println(helloWorldOldWay.sayHelloWorld());
    }
}
