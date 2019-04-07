package com.zy.state;

public abstract class State {
    public abstract void insertQuarter();
    public abstract void ejectQuarter();
    public abstract boolean turnCrank();
    public abstract void dispense();
    public void refill(int count) {
        System.out.println("gumball machine has gumball");
    }
}
