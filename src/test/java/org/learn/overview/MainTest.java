package org.learn.overview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class MainTest {

    @InjectMocks
    private Main main;


    @Test
    public void testMainClass(){
        main = new Main();
        Assertions.assertEquals("Hola",main.getString());
    }

}