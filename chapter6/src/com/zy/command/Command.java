package com.zy.command;

public interface Command {
    void execute();
    void undo();
}

class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No Command");
    }
    @Override
    public void undo() {
        System.out.println("No Command");
    }
}
