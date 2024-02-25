package org.learn.functional.javaImprovements;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SwitchExpressionExample {

    public static void main(String[] args) {
        String month = LocalDate.now().getMonth().name();
        String quarter = switch (month){
            case "JANUARY","FEBRUARY","MARCH"->{
                var isLeapYear = LocalDate.now().isLeapYear();
                yield (isLeapYear ? "FIRST QUARTER - LEAP YEAR":"FIRST QUARTER");
            }
            case "APRIL","MAY","JUNE"->"SECOND QUARTER";
            case "JULY","AUGUST","SEPTEMBER"->"THIRD QUARTER";
            case "OCTOBER","NOVEMBER","DECEMBER"->"FOURTH QUARTER";
            default -> "UNKNOWN QUARTER";
        };
        System.out.println("quarter = " + quarter);
        
        String date = "2022-12-12";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("localDate = " + localDate);
        DateTimeFormatter dateTimeFormatter =
//                DateTimeFormatter.ofPattern("dd-MM-yyyy");
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String string = localDate.format(pattern);
        System.out.println(string);

        LocalDate date1=LocalDate.parse(date);
        System.out.println("date1 = " + date1);
    }
}
