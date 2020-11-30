package com.Jeans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class InsidePartTest {
    @Test
    public void checkInsidePartConstructor() {

        InsidePart insidePart = new InsidePart("Cotton", 5, "black");

        Assertions.assertEquals("Cotton", insidePart.getMaterial());
        Assertions.assertEquals(5, insidePart.getMaterialSize());
        Assertions.assertEquals("black", insidePart.getColor());

    }
}
