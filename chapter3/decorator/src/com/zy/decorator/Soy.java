package com.zy.decorator;

public class Soy extends CondimentDecorator {
    protected Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", sor";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
