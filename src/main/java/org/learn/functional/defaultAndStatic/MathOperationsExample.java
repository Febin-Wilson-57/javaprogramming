package org.learn.functional.defaultAndStatic;

public class MathOperationsExample implements Calculator{
    @Override
    public int sum(int num1, int num2) {
        return num1+num2;
    }


    public static void main(String[] args) {
        MathOperationsExample mathOperationsExample = new MathOperationsExample();
        System.out.println(mathOperationsExample.sum(2,4));

        Calculator calculator = (num1,num2)->num1%num2;

        System.out.println(calculator.sum(10,3));

        System.out.println(mathOperationsExample.substract(4,2));
        System.out.println("mult"+Calculator.multiply(4,2));

        System.out.println(mathOperationsExample.substract(3,3));
    }
}
