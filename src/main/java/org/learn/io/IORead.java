package org.learn.io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IORead {
    private static final Logger LOGGER = LoggerFactory.getLogger(IORead.class);

    public static void main(String[] args) {
        IORead ioRead= new IORead();
        System.out.println(ioRead.getResourceName());
        String append = "Whats up boy! \n";
        System.out.println(ioRead.getResourceName(append));
    }

    public String getResourceName(){

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        String name ="";
        try {
            System.out.println("Enter name:");
            name = bufferedReader.readLine();
        }catch (IOException e){
           LOGGER.error("IOException @ IORead class with message: "+e.getMessage());
        }
        return name;
    }
    public String getResourceName(String append){

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        String name =append;
        try {
            System.out.println("Enter name:");
            name = name+bufferedReader.readLine();
        }catch (IOException e){
            LOGGER.error("IOException @ IORead class with message: "+e.getMessage());
        }
        return name;
    }
}
