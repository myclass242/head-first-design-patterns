package com.zy.templatepattern;

public class Duck implements Comparable {
    private String name;
    int weight;
    public Duck(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }
    public String toString() {
        return name +  " weights " + weight;
    }
    @Override
    public int compareTo(Object object) {
        Duck otherDuck = (Duck)object;

        if (weight < otherDuck.weight) {
            return -1;
        } else if (weight > otherDuck.weight) {
            return 1;
        } else {
            return 0;
        }
    }
}
