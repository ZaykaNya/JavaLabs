package com.Jeans;

public class FrontPocket extends JeansParts {

    public FrontPocket(String material, double materialSize, String color) {
        super(material, materialSize, color);
    }

    @Override
    public void print() {
        System.out.println("Front pocket");
        System.out.println("material: " + material);
        System.out.println("material size: " + materialSize + "(m2)");
        System.out.println("color: " + color);
        System.out.println();
    }
}
