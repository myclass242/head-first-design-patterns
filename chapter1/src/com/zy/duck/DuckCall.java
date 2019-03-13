package com.zy.duck;

public class DuckCall {
    private QuackBehavior quackBehavior;
    DuckCall() {
        quackBehavior = new Quack();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
