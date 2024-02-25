package org.learn.functional.variable;

import org.learn.functional.consumer.Instructors;

import java.util.function.IntConsumer;

public class VariableScope {

    public static void main(String[] args) {
        int b =10;
        IntConsumer intConsumer = a-> System.out.println(a*10);

        int k=0;
        Instructors.getAll().forEach(i->
        {
            System.out.println(i+""+k);
        });
    }
}
