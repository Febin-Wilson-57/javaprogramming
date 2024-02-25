package org.learn.functional.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8);
        Optional<Integer> max = integerList.stream().max(Integer::compareTo);

        if(max.isPresent()){
            System.out.println(max.get());
        }
        int result = integerList.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println(result);

        Optional<Integer> result3 = integerList.stream().reduce((a, b)->a>b?a:b);
        result3.ifPresent(System.out::println);

        Optional<Integer> min = integerList.stream().min(Integer::compare);
        System.out.println(min.get());
        Optional<Integer> reduce = integerList.stream().reduce(Integer::min);
        reduce.ifPresent(System.out::println);

        Optional<Integer> reduce1 = integerList.stream().reduce((a,b)->a<b?a:b);
        reduce1.ifPresent(System.out::println);

    }
}
