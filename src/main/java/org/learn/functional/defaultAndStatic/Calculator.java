package org.learn.functional.defaultAndStatic;

public interface Calculator {

    int sum(int num1,int num2);

    default int substract(int num1,int num2){
        return num1-num2;
    }
    static int multiply(int num1,int num2){
        return num1*num2;
    }

}
