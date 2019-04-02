package com.zy.templatepattern;

public class Tea extends CaffeineBeverage{
    public void brew() {
        System.out.println("Steeping the tea");
    }
    public void addCondiments() {
        System.out.println("Add lemon");
    }
}