package com.Jeans;

import com.Jeans.BackPocket;
import com.Jeans.Button;
import com.Jeans.Jeans;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class BackPocketTest {
    @Test
    public void checkBackPocketConstructor() {

        BackPocket backPocket = new BackPocket("Denim", 0.5, "blue",
                new Button("steel", 0.02, "black", "Pocket Button", 200), 200);

        Assertions.assertEquals("Denim", backPocket.getMaterial());
        Assertions.assertEquals(0.5, backPocket.getMaterialSize());
        Assertions.assertEquals("blue", backPocket.getColor());
        Assertions.assertEquals("steel", backPocket.getBackPocketButton().getMaterial());
        Assertions.assertEquals(0.02, backPocket.getBackPocketButton().getMaterialSize());
        Assertions.assertEquals("black", backPocket.getBackPocketButton().getColor());
        Assertions.assertEquals("Pocket Button", backPocket.getBackPocketButton().getButtonType());

    }

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

