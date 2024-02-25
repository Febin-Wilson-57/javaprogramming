package org.learn.functional.multipleInheritance;

public interface InterfaceB extends InterfaceA {
    default void sumB(int num1,int num2){
        System.out.println("InterfaceB sumB"+(num1+num2));
    }

    default void sumA(int num1,int num2){
        System.out.println("InterfacceB,sumA"+(num1+num2));
    }

}
