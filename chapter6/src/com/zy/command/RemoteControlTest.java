package com.zy.command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        remote.setCommand(new LightOnCommand(new Light()));
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
