package com.zy.proxy;


import java.io.Serializable;

public abstract class State implements Serializable{
    public abstract void insertQuarter();
    public abstract void ejectQuarter();
    public abstract boolean turnCrank();
    public abstract void dispense();
    public void refill(int count) {
        System.out.println("gumball machine has gumball");
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
