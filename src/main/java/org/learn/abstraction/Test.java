package org.learn.abstraction;

public interface Test extends Test1,Test2,Test3{

     default String tester(){
        return "kokkoo";
    }

    static void main(String[] args) {
        System.out.println("kikiii");
    }
}
