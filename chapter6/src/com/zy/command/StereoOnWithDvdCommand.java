package com.zy.command;

public class StereoOnWithDvdCommand implements Command {
    private Stereo sterao;
    Stereo.Model preModel;
    public StereoOnWithDvdCommand(Stereo stereo) {
        this.sterao = stereo;
    }
    @Override
    public void execute() {
        preModel = sterao.getModel();
        sterao.on();
        sterao.setDvd();
        sterao.setVolume(11);
    }
    @Override
    public void undo() {
        preModel.setModel(sterao);
        sterao.off();
    }
}
