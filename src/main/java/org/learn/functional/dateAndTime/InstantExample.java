package org.learn.functional.dateAndTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant.getNano());

        Instant instant1 = Instant.now().plusSeconds(3600);
        System.out.println(Duration.between(instant1,instant).toSeconds());

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault());
        System.out.println("localDateTime = " + localDateTime);


    }
}
