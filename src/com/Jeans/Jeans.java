package com.Jeans;

import java.util.Collection;
import java.util.Iterator;

public class Jeans {
    private final Collection <JeansParts> parts;
    private final String name;
    private double width;
    private double length;
    private final JeansType type;

    public Jeans(Collection<JeansParts> parts, String name, double width, double length, JeansType type) {
        this.parts = parts;
        this.name = name;
        this.width = width;
        this.length = length;
        this.type = type;
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
        return this;
    }

    //while замість for
    public void print() {
        for(Iterator<JeansParts> iterator = parts.iterator(); iterator.hasNext(); ){
            JeansParts part = iterator.next();
            part.print();
        }
    }
}
