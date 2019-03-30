package com.zy.command;

public class StereoOffCommand implements Command {
    private Stereo sterao;
    public StereoOffCommand(Stereo stereo) {
        this.sterao = stereo;
    }
    @Override
    public void execute() {
        sterao.off();
    }
    @Override
    public void undo() {
        sterao.on();
    }
}
