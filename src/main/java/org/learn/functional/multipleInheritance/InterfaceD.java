package org.learn.functional.multipleInheritance;

public interface InterfaceD {
    default void sumA(int num1,int num2){
        System.out.println("InterfacceA,sumA"+(num1+num2));
    }
}
