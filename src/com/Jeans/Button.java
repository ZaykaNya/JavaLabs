package com.Jeans;

public class Button extends JeansParts{
    private String buttonType;

    public Button(String material, double materialSize, String color, String buttonType) {
        super(material, materialSize, color);
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
        System.out.println("Button");
        System.out.println("material: " + material);
        System.out.println("material size: " + materialSize + "(m2)");
        System.out.println("color: " + color);
        System.out.println("button type: " + buttonType);
        System.out.println();
    }
}
