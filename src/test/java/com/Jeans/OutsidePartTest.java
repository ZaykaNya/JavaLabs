package com.Jeans;

import com.Jeans.Jeans;
import com.Jeans.OutsidePart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class OutsidePartTest {
    @Test
    public void checkOutsidePartConstructor() {

        OutsidePart outsidePart = new OutsidePart("Denim", 5, "blue",
                new OutsidePart.Pattern("Round", "Medium", "white"), 200);

        Assertions.assertEquals("Denim", outsidePart.getMaterial());
        Assertions.assertEquals(5, outsidePart.getMaterialSize());
        Assertions.assertEquals("blue", outsidePart.getColor());
        Assertions.assertEquals("Round", outsidePart.getPattern().getPattern());
        Assertions.assertEquals("Medium", outsidePart.getPattern().getPatternSize());
        Assertions.assertEquals("white", outsidePart.getPattern().getPatternColor());

    }
}
