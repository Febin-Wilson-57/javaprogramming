package org.learn.functional.optional;

import java.util.Optional;

public class OptionalExample {


    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
//        int number = numbers[1].intValue();
//        System.out.println(number);
        Optional<Integer>checkNull = Optional.ofNullable(numbers[1]);
        int result = checkNull.isPresent()? checkNull.get() : -1;
        System.out.println(result);


        Optional<String> optionalString =
                Optional.of("Hello Wolrd");
        System.out.println(optionalString);
        System.out.println(getWords());
    }

    public static Optional<String> getWords(){
        String[] words = new String[10];
        words[1]="test";
        Optional<String> optionalS = Optional.ofNullable(words[1]);
        if(optionalS.isPresent()){
            return optionalS;
        }else {
            return Optional.empty();
        }
    }
}
