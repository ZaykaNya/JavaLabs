package com.Jeans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class MockitoTest {
    @Test
    void testPatter() {
        String str = "Round";
        OutsidePart.Pattern pattern = Mockito.mock(OutsidePart.Pattern.class);
        pattern.setPattern("Round");
        Mockito.when(pattern.getPattern()).thenReturn(str);
        OutsidePart outsidePart = new OutsidePart("Denim", 5, "blue", pattern);
        Assertions.assertEquals(outsidePart.getPattern().getPattern(), str);
        Mockito.verify(pattern).getPattern();
    }

    @Test
    void testBackPocket() {
        String str = "Pocket Button";
        Button button = Mockito.mock(Button.class);
        button.setButtonType("Pocket Button");
        Mockito.when(button.getButtonType()).thenReturn(str);
        BackPocket backPocket = new BackPocket("Denim", 0.5, "blue", button);
        Assertions.assertEquals(backPocket.getBackPocketButton().getButtonType(), str);
        Mockito.verify(button).getButtonType();
    }
}
