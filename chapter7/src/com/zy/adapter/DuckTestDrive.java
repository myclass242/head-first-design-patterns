package com.zy.adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.print("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.print("\nThe Duck says...");
        testDuck(duck);

        System.out.print("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }
    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
