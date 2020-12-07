package com.Jeans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ZipperTest {
    @Test
    public void checkZipperConstructor() {

        Zipper zipper = new Zipper("Steel", 0.1, "black", 0.15, 200);

        Assertions.assertEquals("Steel", zipper.getMaterial());
        Assertions.assertEquals(0.1, zipper.getMaterialSize());
        Assertions.assertEquals("black", zipper.getColor());
        Assertions.assertEquals(0.15, zipper.getZipperLength());

    }
}
