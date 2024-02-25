package org.learn.collection.lambda;

public class IncrementByFiveOld implements IncrementByFiveInterface{



    public static void main(String[] args) {
        IncrementByFiveOld incrementByFiveOld = new IncrementByFiveOld();
        System.out.println(incrementByFiveOld.incrementByFive(3));
    }

    @Override
    public int incrementByFive(int incrementFactor) {
        return incrementFactor+5;
    }
}
