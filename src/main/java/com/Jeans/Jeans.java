package com.Jeans;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class Jeans {
    private final Collection<JeansParts> parts;
    private final String name;
    private double width;
    private double length;
    private final JeansType type;
    private int price;

    public Jeans(Collection<JeansParts> parts, String name, double width, double length, JeansType type) throws JeansException {
        if (name.equals("")) {
            throw new JeansException();
        }
        this.parts = parts;
        this.name = name;
        this.width = width;
        this.length = length;
        this.type = type;

    }

    public Collection<JeansParts> getParts() {
        return parts;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public JeansType getType() {
        return type;
    }

    public Jeans addPart(JeansParts part) {
        this.parts.add(part);
        this.price += part.price;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Jeans jeans = (Jeans) obj;
        return width == jeans.width &&
                length == jeans.length &&
                type == jeans.type &&
                Objects.equals(name, jeans.name);
    }

    public void print() {
        Iterator<JeansParts> iterator = parts.iterator();
        while (iterator.hasNext()) {
            JeansParts part = iterator.next();
            part.print();
        }
    }
}
