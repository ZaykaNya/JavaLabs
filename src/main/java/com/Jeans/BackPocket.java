package com.Jeans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BackPocket extends JeansParts{
    private static final Logger logger = LogManager.getLogger(BackPocket.class.getName());
    private Button backPocketButton;

    public BackPocket(String material, double materialSize, String color, Button backPocketButton, int price) {
        super(material, materialSize, color, price);
        this.backPocketButton = backPocketButton;
    }

    public Button getBackPocketButton() {
        return backPocketButton;
    }

    public void setBackPocketButton(Button backPocketButton) {
        this.backPocketButton = backPocketButton;
    }

    @Override
    public void print() {
        logger.info("Back pocket");
        logger.info("material: " + material);
        logger.info("material size: " + materialSize + "(m2)");
        logger.info("color: " + color);
        backPocketButton.print();
    }
}
