package com.zy.state;

public class SoldOutState extends State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("No gumball");
    }
    public void ejectQuarter() {
        System.out.println("No gumball");
    }
    public boolean turnCrank() {
        System.out.println("No gumball");
        return false;
    }
    public void dispense() {
        System.out.println("No gumball");
    }
    @Override
    public void refill(int count) {
        gumballMachine.add(count);
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
