package org.learn.functional.dateAndTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeModifyExample {

    public static void main(String[] args) {
        LocalTime localTime= LocalTime.now();
        System.out.println("localTime.plusHours(2) = "
                + localTime.plusHours(2));
        System.out.println(localTime.minusHours(12));
        System.out.println("localTime.minus(2,ChronoUnit.HOURS) = "
                + localTime.minus(2,ChronoUnit.HOURS));

        System.out.println("localTime.with(LocalTime.MIDNIGHT) = " +
                localTime.with(LocalTime.MIDNIGHT));
        System.out.println("localTime.with(ChronoField.HOUR_OF_DAY,4) = "
                + localTime.with(ChronoField.HOUR_OF_DAY,4));

    }
}
