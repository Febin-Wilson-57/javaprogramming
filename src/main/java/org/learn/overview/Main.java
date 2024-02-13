package org.learn.overview;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args){
        System.out.println("Hey there..");
        LOGGER.info("Hey Boy Im working correctly");
        LOGGER.error("Hey Boy Im working correctly");
        LOGGER.trace("Hey Boy Im working correctly");
        LOGGER.warn("Hey Boy Im working correctly");
        LOGGER.debug("Hey Boy Im working correctly");
    }

    public String getString(){
//        Properties properties = System.getProperties();
//        System.out.println(properties.toString());
        return "Hola";
    }
}
