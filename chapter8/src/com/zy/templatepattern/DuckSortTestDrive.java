package com.zy.templatepattern;

import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("A", 8),
                new Duck("B", 2),
                new Duck("C", 7),
                new Duck("D", 2),
                new Duck("E", 10),
                new Duck("F", 2),
        };

        System.out.println("Before sorting");
        display(ducks);

        Arrays.sort(ducks);
        System.out.println("After sorting");
        display(ducks);
    }
    public static void display(Duck[] ducks) {
        for (Duck d : ducks) {
            System.out.println(d);
        }
    }
}
