package com.zy.proxy;


public class GumballMachine {
    private NoQuarterState noQuarterState;
    private HasQuarterState hasQuarterState;
    private SoldState soldState;
    private SoldOutState soldOutState;
    private WinnerState winnerState;

    private State state;
    private int count;
    private String location;

    public GumballMachine(int count, String location) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.count = count;
        this.location = location;
        if (this.count > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    public void turnCrank() {
        if (state.turnCrank()) {
            state.dispense();
        }
    }
    public void refill(int count) {
        state.refill(count);
    }

    public void setState(State state) {
        this.state = state;
    }
    public State getNoQuarterState() {
        return noQuarterState;
    }
    public State getHasQuarterState() {
        return hasQuarterState;
    }
    public State getSoldState() {
        return soldState;
    }
    public State getSoldOutState() {
        return soldOutState;
    }
    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }
    public String getLocation() {
        return location;
    }
    public State getState() {
        return state;
    }
    void add(int count) {
        this.count += count;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot ...");
        if (count != 0) {
            count -= 1;
        }
    }
}

//public class GumballMachine {
//    final static int SOLD_OUT = 0;
//    final static int NO_QUARTER = 1;
//    final static int HAS_QUARTER = 2;
//    final static int SOLD = 3;
//
//    int state = SOLD_OUT;
//    int count = 0;
//
//    GumballMachine(int count) {
//        this.count = count;
//        if (count > 0) {
//            state = HAS_QUARTER;
//        }
//    }
//
//    public void insertQuarter() {
//        if (state == SOLD_OUT) {
//            System.out.print("sold out");
//        } else if (state == NO_QUARTER) {
//            state = HAS_QUARTER;
//            System.out.println("insert a quarter");
//        } else if (state == HAS_QUARTER) {
//            System.out.println("has quarter");
//        } else {
//            System.out.println("Please wait, we are giving your a gumball");
//        }
//    }
//
//    public void ejectQuarter() {
//        if (state == SOLD_OUT) {
//            System.out.print("sold out");
//        } else if (state == NO_QUARTER) {
//            System.out.println("no quarter");
//        } else if (state == HAS_QUARTER) {
//            state = NO_QUARTER;
//            System.out.println("quarter returned");
//        } else {
//            System.out.println("Sorry, you are turned the crank");
//        }
//    }
//
//    public void trueCrank() {
//        if (state == SOLD_OUT) {
//            System.out.print("sold out");
//        } else if (state == NO_QUARTER) {
//            System.out.println("no quarter");
//        } else if (state == HAS_QUARTER) {
//            state = SOLD;
//            System.out.println("You turned...");
//            dispense();
//        } else {
//            System.out.println("turn twice does not give you another gumball");
//        }
//    }
//
//    public void dispense() {
//        if (state == SOLD_OUT) {
//            System.out.print("sold out");
//        } else if (state == NO_QUARTER) {
//            System.out.println("no quarter");
//        } else if (state == HAS_QUARTER) {
//            System.out.println("No gumball dispense");
//        } else {
//            System.out.println("A gumball comes rolling out the slot");
//            count -= 1;
//            if (count == 0) {
//                System.out.println("Out of gumballs");
//                state = SOLD_OUT;
//            } else {
//                state = NO_QUARTER;
//            }
//        }
//    }
//}
