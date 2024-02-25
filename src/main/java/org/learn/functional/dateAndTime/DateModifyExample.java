package org.learn.functional.dateAndTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateModifyExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        localDate =localDate.plusDays(4);
        System.out.println(localDate);

        System.out.println(localDate.plusMonths(2));

        System.out.println(localDate.plusYears(4));

        System.out.println(localDate.minusYears(4));
        System.out.println(localDate.withYear(2023));
        System.out.println(localDate.with(ChronoField.YEAR,2025));
        System.out.println(localDate.with(TemporalAdjusters.lastDayOfMonth()));
    }
}
