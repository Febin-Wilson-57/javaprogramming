package org.learn.functional.javaImprovements;

public class MultiLineTextBlocks {

    public static void main(String[] args) {
        String s1 = """
               Hello World using 
               text block!
               ;;;;;
                """;
        System.out.println(s1);

        String phrase = """
                {
                employee:"Mike",
                employeeId:1001,
                employeeType:FT
                }
                
                """;
        System.out.println(phrase);
    }
}
