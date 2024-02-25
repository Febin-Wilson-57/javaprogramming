package org.learn.functional.consumer;

import java.util.Arrays;
import java.util.List;

public class Instructors {
    public static List<Instructor> getAll() {
        Instructor instructor = new Instructor("Mike", 10, "software developer",
                "M", true, Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));
        Instructor instructor2 = new Instructor("Jenny", 5, "Engineer",
                "F", false, Arrays.asList("Multi-Threaded programming", "CI/CD", "Unit Testing"));
        Instructor instructor3 = new Instructor("Gene", 6, "Manager",
                "M", false, Arrays.asList("C++ programming", "C Programming", "React Native"));

        Instructor instructor4 = new Instructor("Anthony", 15, "Senior developer",
                "M", true, Arrays.asList("Java Programming", "Angular Programming", "React Native"));
        Instructor instructor5 = new Instructor("Syed", 15, "Principal Engineer",
                "M", true, Arrays.asList("Java Programming", "Multi-Threaded programming", "React Native"));

        return Arrays.asList(instructor,instructor2,instructor3,instructor4,instructor5);
    }
}
