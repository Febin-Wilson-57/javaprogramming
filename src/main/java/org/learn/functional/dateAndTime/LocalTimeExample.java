package org.learn.functional.dateAndTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime localTime= LocalTime.now();
        System.out.println(localTime);
        localTime = LocalTime.of(15,18);
        System.out.println("localTime = " + localTime);
        localTime = LocalTime.of(15,18,22);
        System.out.println("localTime = " + localTime);
        
//        get methods
        System.out.println("localTime.getHour() = " + localTime.getHour());
        System.out.println(localTime.getNano());
        System.out.println(localTime.get(ChronoField.SECOND_OF_DAY));
    }
}
