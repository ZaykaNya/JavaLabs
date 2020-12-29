package com.Jeans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Button extends JeansParts{
    private static final Logger logger = LogManager.getLogger(Button.class.getName());
    private String buttonType;

    public Button(String material, double materialSize, String color, String buttonType, int price) {
        super(material, materialSize, color, price);
        this.buttonType = buttonType;
    }

    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }

    @Override
    public void print() {
        logger.info("Button");
        logger.info("material: " + material);
        logger.info("material size: " + materialSize + "(m2)");
        logger.info("color: " + color);
        logger.info("button type: " + buttonType);
    }
}
