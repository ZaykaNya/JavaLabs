package com.Jeans;

public abstract class JeansParts implements JeansComponent {
    protected String material;
    protected double materialSize;
    protected String color;

    public JeansParts(String material, double materialSize, String color) {
        this.material = material;
        this.materialSize = materialSize;
        this.color = color;
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

    public void print(){}
}
