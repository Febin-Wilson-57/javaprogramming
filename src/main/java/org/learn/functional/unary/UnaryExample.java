package org.learn.functional.unary;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryExample {

    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator=i->i*10;
        System.out.println(unaryOperator.apply(6));

        Function<Integer,Integer> function = i->i*10;
        System.out.println(function.apply(6));

        IntUnaryOperator intUnaryOperator =i->i*18;
        System.out.println(intUnaryOperator.applyAsInt(10));
    }

}
