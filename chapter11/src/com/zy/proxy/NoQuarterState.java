package com.zy.proxy;

public class NoQuarterState extends State {
    GumballMachine gumballMachine;
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    public void insertQuarter() {
        System.out.println("Your insert a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
    public void ejectQuarter() {
        System.out.println("Your haven't insert a quarter");
    }
    public boolean turnCrank() {
        System.out.println("You turned, but there is no quarter");
        return false;
    }
    public void dispense() {
        System.out.println("Your need pay first");
    }
}
