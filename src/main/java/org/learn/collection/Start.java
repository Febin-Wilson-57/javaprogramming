package org.learn.collection;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Clock;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Start {


    public static void main(String[] args) {
        System.out.println(Clock.systemUTC().instant());
        Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random()).nextInt(10000000));

        randomNumbers.limit(20).forEach(System.out::println);


        List<Student> studentList = getStudentListFromCsv();
        Map<String,List<Student>> map =studentList.stream().collect(Collectors.groupingBy(Student::getLast_name));
        System.out.println(map);
        Map<String,Long> map1 =studentList.stream().collect(Collectors.groupingBy(student -> student.getLast_name(),Collectors.counting()));
        System.out.println(map1);

        System.out.println("prime number");
        String s =IntStream.range(2,100).filter(Start::isPrime).mapToObj(Objects::toString).collect(Collectors.joining(","));
        System.out.println(s);

//         Count the empty strings
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        long count = strList.stream() .filter(x -> x.isEmpty()) .count();
        System.out.printf("List %s has %d empty strings %n", strList, count);
        // Count String with length more than 3
         long num = strList.stream() .filter(x -> x.length()> 3) .count();
         System.out.printf("List %s has %d strings of length more than 3 %n", strList, num);
         // Count number of String which startswith "a"
         count = strList.stream() .filter(x -> x.startsWith("a")) .count();
         System.out.printf("List %s has %d strings which startsWith 'a' %n", strList, count);
         // Remove all empty Strings from List
         List<String> filtered = strList.stream() .filter(x -> !x.isEmpty()) .collect(Collectors.toList());
         System.out.printf("Original List : %s, List without Empty Strings : %s %n", strList, filtered);
         // Create a List with String more than 2 characters
         filtered = strList.stream() .filter(x -> x.length()> 2) .collect(Collectors.toList());
         System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
         // Convert String to Uppercase and join them using coma
         List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
         String G7Countries = G7.stream() .map(x -> x.toUpperCase()) .collect(Collectors.joining(", "));
         System.out.println(G7Countries);
//          Create List of square of all distinct numbers
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream() .map( i -> i*i).distinct() .collect(Collectors.toList());
        System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, distinct);
        //Get count, min, max, sum, and average for numbers
         List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
         IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics();
         System.out.println("Highest prime number in List : " + stats.getMax());
         System.out.println("Lowest prime number in List : " + stats.getMin());
         System.out.println("Sum of all prime numbers : " + stats.getSum());
         System.out.println("Average of all prime numbers : " + stats.getAverage());

//         Predicate
//        Supplier
//        Consumer
    }






    private static boolean isPrime(int number){
        return number>1 && IntStream.range(2,number)
                .noneMatch(i-> number%i ==0);
    }

    private static List<Student> getStudentListFromCsv() {
        ObjectMapper objectMapper = new ObjectMapper();
        String file = "src/main/resources/data.json";
        String line ;
        List<Student> students = new ArrayList();
        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {
            while((line = br.readLine()) != null){
               List<Student> studentList=  objectMapper.readValue(line, new TypeReference<List<Student>>() {
               });
                students.addAll(studentList);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return students;
    }

}
