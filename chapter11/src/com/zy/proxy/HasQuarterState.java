package com.zy.proxy;

import java.util.*;


public class HasQuarterState extends State {
    private GumballMachine gumballMachine;
    private Random rand;

    HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        rand = new Random(47);
    }

    public void insertQuarter() {
        System.out.println("Your already have a quarter");
    }
    public void ejectQuarter() {
        System.out.println("return a  quarter");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    public boolean turnCrank() {
        System.out.println("You turned...");
        int winner = rand.nextInt(10);
        if (winner == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
        return true;
    }
    public void dispense() {
        System.out.println("No gumball dispense");
    }
}
