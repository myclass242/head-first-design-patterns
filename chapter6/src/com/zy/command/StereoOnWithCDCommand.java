package com.zy.command;

public class StereoOnWithCDCommand implements Command {
    private Stereo sterao;
    Stereo.Model preModel;
    public StereoOnWithCDCommand(Stereo stereo) {
        this.sterao = stereo;
    }
    @Override
    public void execute() {
        preModel = sterao.getModel();
        sterao.on();
        sterao.setCd();
        sterao.setVolume(11);
    }
    @Override
    public void undo() {
        preModel.setModel(sterao);
        sterao.off();
    }
}
