package com.Jeans;

import com.Jeans.Jeans;
import com.Jeans.JeansException;
import com.Jeans.JeansType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class JeansTest {
    @Test
    public void checkOutsideJeansConstructor() {

        try {
            Jeans myJeans = new Jeans(new ArrayList<>(), "Collins", 30, 32, JeansType.skinny);

            Assertions.assertEquals("Collins", myJeans.getName());
            Assertions.assertEquals(30, myJeans.getWidth());
            Assertions.assertEquals(32, myJeans.getLength());
            Assertions.assertEquals(JeansType.skinny, myJeans.getType());

        } catch (JeansException e) {
            System.err.println(e.getMessage());
        }

    }
}
