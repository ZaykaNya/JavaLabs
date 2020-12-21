package com.Jeans;

import com.Jeans.FrontPocket;
import com.Jeans.Jeans;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FrontPocketTest {
    @Test
    public void checkFrontPocketConstructor() {

        FrontPocket frontPocket = new FrontPocket("Denim", 0.3, "blue", 200);

        Assertions.assertEquals("Denim", frontPocket.getMaterial());
        Assertions.assertEquals(0.3, frontPocket.getMaterialSize());
        Assertions.assertEquals("blue", frontPocket.getColor());

    }
}