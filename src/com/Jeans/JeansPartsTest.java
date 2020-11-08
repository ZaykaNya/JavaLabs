package com.Jeans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JeansPartsTest {
    @Test
    public void checkParts() {
        Button button1 = new Button("steel", 0.04, "black", "Common Button");
        Button button2 = new Button("steel", 0.04, "black", "Common Button");

        Zipper zipper = new Zipper("Steel", 0.1, "black", 0.15);
        Zipper zipper2 = new Zipper("Steel", 0.1, "black", 0.2);

        Assertions.assertEquals(button1.getMaterialSize(), button2.getMaterialSize());
        Assertions.assertEquals(button1.getButtonType(), button2.getButtonType());
        Assertions.assertEquals(button1.getMaterial(), button2.getMaterial());
        Assertions.assertEquals(button1.getColor(), button2.getColor());
        Assertions.assertNotEquals(button1, button2);

        Assertions.assertNotEquals((JeansParts) button1, (JeansParts) zipper);
        Assertions.assertEquals(zipper.getColor(), zipper2.getColor());
        Assertions.assertNotEquals(zipper.getZipperLength(), zipper2.getZipperLength());

    }
}
