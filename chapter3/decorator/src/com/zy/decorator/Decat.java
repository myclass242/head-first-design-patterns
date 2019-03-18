package com.zy.decorator;

public class Decat extends Beverage {
    public Decat() {
        description = "Decat";
    }

    public double cost() {
        return 1.05 + sizeCost();
    }
}
