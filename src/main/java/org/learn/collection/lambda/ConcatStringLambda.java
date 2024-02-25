package org.learn.collection.lambda;

public class ConcatStringLambda {

    public static void main(String[] args) {
        ConcatenateInterface concatenateInterface= (x,y)->x+y;
        System.out.println(concatenateInterface.sConcatenate("Hello","4j"));

    ConcatenateInterface concatenateInterface1=String::concat;
        System.out.println(concatenateInterface1.sConcatenate("ji","jo"));
    }
}
