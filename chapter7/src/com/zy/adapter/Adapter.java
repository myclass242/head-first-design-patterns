package com.zy.adapter;

public class Adapter implements Duck, Turkey {
    private Turkey turkey;
    public Adapter(Turkey turkey) {
        this.turkey = turkey;
    }
    @Override
    public void gobble() {
        turkey.gobble();
    }
    @Override
    public void quack() {
        turkey.gobble();
    }
    @Override
    public void fly() {
        turkey.fly();
    }
}
