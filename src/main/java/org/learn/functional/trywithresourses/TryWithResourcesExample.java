package org.learn.functional.trywithresourses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class TryWithResourcesExample {

    public static void main(String[] args) {
        Reader reader = new StringReader("Dont cut any corners");
        BufferedReader bufferedReader = new BufferedReader(reader);
        try(BufferedReader bf = bufferedReader){
            System.out.println(bf.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }



        Reader reader1 = new StringReader("Hang in there");
        BufferedReader bufferedReader1= new BufferedReader(reader1);
        try(bufferedReader1){
            System.out.println(bufferedReader1.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
