package org.learn.functional.dateAndTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.now().plusHours(2);
        Duration duration = Duration.between(localDateTime,localDateTime1);
        System.out.println(duration.toHours());
        duration = Duration.ofHours(3);
        System.out.println(duration.toMinutes());

        LocalTime localTime = LocalTime.now();
        LocalTime time = LocalTime.now().plusMinutes(60);
      Duration  duration1 = Duration.between(localTime,time);
        System.out.println(duration1.toMinutes());
    }
}
