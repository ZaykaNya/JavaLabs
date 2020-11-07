package com.Jeans;

public class InsidePart extends JeansParts{

    public InsidePart(String material, double materialSize, String color) {
        super(material, materialSize, color);
    }

    @Override
    public void print() {
        System.out.println("Inside part");
        System.out.println("material: " + material);
        System.out.println("material size: " + materialSize + "(m2)");
        System.out.println("color: " + color);
        System.out.println();
    }
}
