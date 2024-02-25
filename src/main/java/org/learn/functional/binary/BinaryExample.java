package org.learn.functional.binary;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryExample {

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator=(i,l)->i+l;
        System.out.println(binaryOperator.apply(4,5));

        Comparator<Integer> comparator = Integer::compareTo;
        BinaryOperator<Integer>binaryOperator1 = BinaryOperator.maxBy(comparator);
        System.out.println(binaryOperator1.apply(7,9));


    }
}
