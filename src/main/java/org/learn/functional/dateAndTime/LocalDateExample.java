package org.learn.functional.dateAndTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {

    public static void main(String[] args) {
//        creating localdate

        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);


        LocalDate date=LocalDate.ofYearDay(2018,35);
        System.out.println(date);

        date = LocalDate.of(2018, 5,23);
        System.out.println(date);


        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println("date.getDayOfWeek() = " + date.getDayOfWeek());

        System.out.println("date.get(ChronoField.DAY_OF_MONTH) = " + date.get(ChronoField.DAY_OF_MONTH));






    }
}
