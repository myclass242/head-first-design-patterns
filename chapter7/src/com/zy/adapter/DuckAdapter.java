package com.zy.adapter;

import java.util.*;

public class DuckAdapter implements Turkey {
    private Duck duck;
    private Random rand;
    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random(47);
    }
    @Override
    public void gobble() {
        duck.quack();
    }
    @Override
    public void fly() {
        if (rand.nextInt(5) == 0)
            duck.fly();
    }
}
