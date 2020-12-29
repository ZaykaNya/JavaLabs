package com.Jeans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FrontPocket extends JeansParts {
    private static final Logger logger = LogManager.getLogger(FrontPocket.class.getName());
    
    public FrontPocket(String material, double materialSize, String color, int price) {
        super(material, materialSize, color, price);
    }

    @Override
    public void print() {
        logger.info("Front pocket");
        logger.info("material: " + material);
        logger.info("material size: " + materialSize + "(m2)");
        logger.info("color: " + color);
    }
}
