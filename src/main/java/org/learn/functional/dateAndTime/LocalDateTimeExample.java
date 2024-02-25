package org.learn.functional.dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime =LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        System.out.println(localDateTime.isBefore(localDateTime.plusDays(2)));
        localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime
                .parse("2018-11-03T12:45:30");
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(localDateTime1));
        LocalDateTime  localDateTime2= LocalDateTime.now();
        System.out.println(localDateTime2.toLocalDate());
        System.out.println(localDateTime2.toLocalTime());



    }
}
