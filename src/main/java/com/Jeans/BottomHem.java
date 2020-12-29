package com.Jeans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BottomHem extends JeansParts{
    private static final Logger logger = LogManager.getLogger(BottomHem.class.getName());
    
    public BottomHem(String material, double materialSize, String color, int price) {
        super(material, materialSize, color, price);
    }

    @Override
    public void print() {
        logger.info("Bottom hem");
        logger.info("material: " + material);
        logger.info("material size: " + materialSize + "(m2)");
        logger.info("color: " + color);
    }
}
