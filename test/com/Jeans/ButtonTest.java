package com.Jeans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ButtonTest {
    @Test
    public void checkButtonConstructor() {

        Button button = new Button("steel", 0.04, "black", "Common Button");

        Assertions.assertEquals(0.04, button.getMaterialSize());
        Assertions.assertEquals("Common Button", button.getButtonType());
        Assertions.assertEquals("steel", button.getMaterial());
        Assertions.assertEquals("black", button.getColor());

    }
}
