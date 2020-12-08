package com.Jeans;

public abstract class JeansParts implements JeansComponent {
    protected String material;
    protected double materialSize;
    protected String color;
    protected int price;

    public JeansParts(String material, double materialSize, String color, int price) {
        this.material = material;
        this.materialSize = materialSize;
        this.color = color;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getMaterialSize() {
        return materialSize;
    }

    public void setMaterialSize(double materialSize) {
        this.materialSize = materialSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.material;
    }

    public void print() {
    }
}
