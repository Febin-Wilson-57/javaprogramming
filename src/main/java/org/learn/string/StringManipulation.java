package org.learn.string;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class StringManipulation {

    public static void main(String[] args) {

        StringTokenizer stringTokenizer = new StringTokenizer(
                "Hello Geeks How are you", " "
        );
        while (stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(
                "JAVA : Code : String", " :");

        // If tokens are present
        while (st2.hasMoreTokens()) {
            // Print all tokens
            System.out.println(st2.nextToken());
        }

        StringTokenizer st3 = new StringTokenizer(
                "JAVA : Code : String", " :", true);

        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }

        StringJoiner joiner = new StringJoiner(",");
        List<String>numList = Arrays.asList("1","2","3","4");
        String s = String.join(",", numList);
        System.out.println(s);

    }
}
