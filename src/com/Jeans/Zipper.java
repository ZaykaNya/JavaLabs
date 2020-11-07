package com.Jeans;

public class Zipper extends JeansParts {
    private double zipperLength;

    public Zipper(String material, double materialSize, String color, double zipperLength) {
        super(material, materialSize, color);
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
        System.out.println("Inside part");
        System.out.println("material: " + material);
        System.out.println("material size: " + materialSize + "(m2)");
        System.out.println("color: " + color);
        System.out.println("zipper length: " + zipperLength + "(m)");
        System.out.println();
    }
}
