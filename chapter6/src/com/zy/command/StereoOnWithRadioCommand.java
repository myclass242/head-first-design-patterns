package com.zy.command;

public class StereoOnWithRadioCommand implements Command {
    private Stereo sterao;
    Stereo.Model preModel;
    public StereoOnWithRadioCommand(Stereo stereo) {
        this.sterao = stereo;
    }
    @Override
    public void execute() {
        preModel = sterao.getModel();
        sterao.on();
        sterao.setRadio();
        sterao.setVolume(11);
    }
    @Override
    public void undo() {
        preModel.setModel(sterao);
        sterao.off();
    }
}
