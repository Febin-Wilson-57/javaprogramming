package org.learn.functional.javaImprovements;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;

public class TypeInterferenceExample {

    public static void main(String[] args) {

        String name = "Mike";
        var name1 = "Mike";
        System.out.println(name1.getClass());
        System.out.println(name.getClass());
        
        var dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        var map = new HashMap<String,String>();
        System.out.println(map.getClass());


    }
}
