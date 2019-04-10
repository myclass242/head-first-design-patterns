package com.zy.proxy;

public class GumballMonitor {
    private GumballMachine machine;

    public GumballMonitor(GumballMachine gumballMachine) {
        machine = gumballMachine;
    }

    public void report() {
        System.out.println("Gumball machine: " + machine.getLocation());
        System.out.println("Current inventory: " + machine.getCount() + " gumballs");
        System.out.println("Current state: " + machine.getState());
    }
}
