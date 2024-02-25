package org.learn.functional.dateAndTime;

import java.time.*;
import java.util.Date;

public class ZoneExample {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream()
                .forEach(System.out::println);


        System.out.println("ZonedDateTime.now(ZoneId.of(\"Europe/London\")) = " + ZonedDateTime.now(ZoneId.of("Europe/London")));
        
        
//        LocalDate time to ZoneDateTime

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        ZonedDateTime time = localDateTime
                .atZone(ZoneId.of("America/New_York"));
        System.out.println("time = " + time);
        System.out.println(localDateTime.atOffset(ZoneOffset.ofHours(-10)));
    
    
//        Date fro util and sql to localDate

        Date date = new Date();
        LocalDateTime localDateTime1 = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
        System.out.println("localDateTime1 = " + localDateTime1);

        java.sql.Date date1 = new java.sql.Date(System.currentTimeMillis());
        LocalDate localDate = date1.toLocalDate();
        System.out.println("localDate = " + localDate);
    
    
    
    }
}
