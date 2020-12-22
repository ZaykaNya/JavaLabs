package com.Jeans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class BackPocketIT {
    @Test
    void testBackPocket() {
        String str = "Pocket Button";
        Button button = Mockito.mock(Button.class);
        button.setButtonType("Pocket Button");
        Mockito.when(button.getButtonType()).thenReturn(str);
        BackPocket backPocket = new BackPocket("Denim", 0.5, "blue", button, 200);
        Assertions.assertEquals(backPocket.getBackPocketButton().getButtonType(), str);
        Mockito.verify(button).getButtonType();
    }
}
