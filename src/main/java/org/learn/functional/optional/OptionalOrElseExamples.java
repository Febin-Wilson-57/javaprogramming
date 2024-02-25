package org.learn.functional.optional;

import java.util.Optional;

public class OptionalOrElseExamples {

    public static void main(String[] args) {

        Integer[] numbers = new Integer[10];
        numbers[0]=1;
        Optional<Integer> number = Optional.ofNullable(numbers[1]);
        int result = number.orElse(-1);
        System.out.println(result);

        result = number.orElseGet(()->-1);
        System.out.println(result);

        try {
            result = number.orElseThrow(Exception::new);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);

    }

}
