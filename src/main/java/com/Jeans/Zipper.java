package com.Jeans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Zipper extends JeansParts {
    private double zipperLength;
    private static final Logger logger = LogManager.getLogger(Zipper.class.getName());

    public Zipper(String material, double materialSize, String color, double zipperLength, int price) {
        super(material, materialSize, color, price);
        this.zipperLength = zipperLength;
    }

    public double getZipperLength() {
        return zipperLength;
    }

    public void setZipperLength(double zipperLength) {
        this.zipperLength = zipperLength;
    }

    @Override
    public void print() {
        logger.info("Inside part");
        logger.info("material: " + material);
        logger.info("material size: " + materialSize + "(m2)");
        logger.info("color: " + color);
        logger.info("zipper length: " + zipperLength + "(m)");
    }
}
