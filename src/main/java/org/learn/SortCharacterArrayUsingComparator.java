package org.learn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortCharacterArrayUsingComparator {


    public static void main(String[] args) {

        String name = "GeekForGeeks Here!";
        Character[] chars =  name.chars().mapToObj(c->(char)c).toArray(Character[]::new);
        Arrays.stream(chars).forEach(System.out::print);
        System.out.println();
        Arrays.sort(chars, Comparator.comparing(Character::toLowerCase));
        Arrays.stream(chars).forEach(System.out::print);

    }
}
