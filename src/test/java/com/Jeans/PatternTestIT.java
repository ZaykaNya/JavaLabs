package com.Jeans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PatternTestIT {
    @Test
    void testPattern() {
        String str = "Round";
        OutsidePart.Pattern pattern = Mockito.mock(OutsidePart.Pattern.class);
        pattern.setPattern("Round");
        Mockito.when(pattern.getPattern()).thenReturn(str);
        OutsidePart outsidePart = new OutsidePart("Denim", 5, "blue", pattern, 200);
        Assertions.assertEquals(outsidePart.getPattern().getPattern(), str);
        Mockito.verify(pattern).getPattern();
    }
}
