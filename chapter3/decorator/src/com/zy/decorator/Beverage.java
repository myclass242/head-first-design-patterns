package com.zy.decorator;

import java.util.HashMap;

public abstract class Beverage {
    protected String description = "Unknown Beverage";

    enum Size {
        TALL, GRANDE, VENTI
    }

    public Size size;
    protected static HashMap<Size, Double> sizeCost;
    {
        sizeCost.put(Size.TALL, 0.10);
        sizeCost.put(Size.GRANDE, 0.15);
        sizeCost.put(Size.VENTI, 0.20);
    }

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    protected double sizeCost() {
        return sizeCost.get(size);
    }

    public abstract double cost();
}
