package com.Jeans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class JeansPartsTest {
    @Test
    public void checkParts() {

        Button button = new Button("steel", 0.04, "black", "Common Button");

        Assertions.assertEquals(0.04, button.getMaterialSize());
        Assertions.assertEquals("Common Button", button.getButtonType());
        Assertions.assertEquals("steel", button.getMaterial());
        Assertions.assertEquals("black", button.getColor());


        Zipper zipper = new Zipper("Steel", 0.1, "black", 0.15);

        Assertions.assertEquals("Steel", zipper.getMaterial());
        Assertions.assertEquals(0.1, zipper.getMaterialSize());
        Assertions.assertEquals("black", zipper.getColor());
        Assertions.assertEquals(0.15, zipper.getZipperLength());


        BackPocket backPocket = new BackPocket("Denim", 0.5, "blue",
                new Button("steel", 0.02, "black", "Pocket Button"));

        Assertions.assertEquals("Denim", backPocket.getMaterial());
        Assertions.assertEquals(0.5, backPocket.getMaterialSize());
        Assertions.assertEquals("blue", backPocket.getColor());
        Assertions.assertEquals("steel", backPocket.getBackPocketButton().getMaterial());
        Assertions.assertEquals(0.02, backPocket.getBackPocketButton().getMaterialSize());
        Assertions.assertEquals("black", backPocket.getBackPocketButton().getColor());
        Assertions.assertEquals("Pocket Button", backPocket.getBackPocketButton().getButtonType());


        BottomHem bottomHem = new BottomHem("Denim", 0.1, "blue");

        Assertions.assertEquals("Denim", bottomHem.getMaterial());
        Assertions.assertEquals(0.1, bottomHem.getMaterialSize());
        Assertions.assertEquals("blue", bottomHem.getColor());


        FrontPocket frontPocket = new FrontPocket("Denim", 0.3, "blue");

        Assertions.assertEquals("Denim", frontPocket.getMaterial());
        Assertions.assertEquals(0.3, frontPocket.getMaterialSize());
        Assertions.assertEquals("blue", frontPocket.getColor());


        InsidePart insidePart = new InsidePart("Cotton", 5, "black");

        Assertions.assertEquals("Cotton", insidePart.getMaterial());
        Assertions.assertEquals(5, insidePart.getMaterialSize());
        Assertions.assertEquals("black", insidePart.getColor());


        try {
            Jeans myJeans = new Jeans(new ArrayList<>(), "Collins", 30, 32, JeansType.skinny);

            Assertions.assertEquals("Collins", myJeans.getName());
            Assertions.assertEquals(30, myJeans.getWidth());
            Assertions.assertEquals(32, myJeans.getLength());
            Assertions.assertEquals(JeansType.skinny, myJeans.getType());

        } catch (JeansException e) {
            System.err.println(e.getMessage());
        }


        OutsidePart outsidePart = new OutsidePart("Denim", 5, "blue",
                new OutsidePart.Pattern("Round", "Medium", "white"));

        Assertions.assertEquals("Denim", outsidePart.getMaterial());
        Assertions.assertEquals(5, outsidePart.getMaterialSize());
        Assertions.assertEquals("blue", outsidePart.getColor());
        Assertions.assertEquals("Round", outsidePart.getPattern().getPattern());
        Assertions.assertEquals("Medium", outsidePart.getPattern().getPatternSize());
        Assertions.assertEquals("white", outsidePart.getPattern().getPatternColor());

    }
}
