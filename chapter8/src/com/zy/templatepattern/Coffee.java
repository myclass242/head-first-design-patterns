package com.zy.templatepattern;

public class Coffee  extends CaffeineBeverage{
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }
    public void addCondiments() {
        System.out.println("Add sugar and milk");
    }
}
