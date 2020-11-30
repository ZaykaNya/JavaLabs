package com.Jeans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BottomHemTest {
    @Test
    public void checkBottomHemConstructor() {

        BottomHem bottomHem = new BottomHem("Denim", 0.1, "blue");

        Assertions.assertEquals("Denim", bottomHem.getMaterial());
        Assertions.assertEquals(0.1, bottomHem.getMaterialSize());
        Assertions.assertEquals("blue", bottomHem.getColor());


    }
}
