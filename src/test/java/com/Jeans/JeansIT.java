package com.Jeans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class JeansIT {
    @Test
    public void AreJeansPartsAddedToList() {

        ArrayList<JeansParts> list = spy(new ArrayList<>());
        Jeans jeans = new Jeans("Collins", list);

        BottomHem bottomHem = new BottomHem("Denim", 0.1, "blue", 150);
        Button button = new Button("steel", 0.05, "black", "Common Button", 250);

        jeans.addPart(bottomHem);
        jeans.addPart(button);

        verify(list).add(bottomHem);
        verify(list).add(button);

        Assertions.assertEquals(2, list.size());

    }
}
