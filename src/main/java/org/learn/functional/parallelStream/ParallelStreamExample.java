package org.learn.functional.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(0,50000).parallel().sum());
        System.out.println(IntStream.rangeClosed(0,50000).sum());




    int loop =20;
    long result = measurePerformance(ParallelStreamExample::sumParallel,loop);
    System.out.println(result);
    result = measurePerformance(ParallelStreamExample::sumSequential,loop);
    System.out.println(result);


    }
    public static long measurePerformance(Supplier<Integer> supplier,int numberOfTimes){
        long start = System.currentTimeMillis();
        for(int i=0;i<numberOfTimes;i++){
            supplier.get();
        }
        return System.currentTimeMillis()-start;
    }

    private static int sumSequential(){
        return IntStream.rangeClosed(1,50000).sum();
    }
    private static int sumParallel(){
        return IntStream.rangeClosed(1,50000).parallel().sum();
    }

}
