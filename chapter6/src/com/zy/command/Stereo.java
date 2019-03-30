package com.zy.command;

public class Stereo {
    enum Model {
        CD, DVD, RADIO;
        void setModel(Stereo stero) {
            stero.model = this;
        }
    };
    Model model;
    Stereo() {
        model = Model.CD;
    }
    public void on() {
        System.out.println("Stereo on");
    }
    public void off() {
        System.out.println("Stereo off");
    }
    public void setCd() {
        System.out.println("Stereo dv model");
        model = Model.CD;
    }
    public void setDvd() {
        System.out.println("Stereo dvd model");
        model = Model.DVD;
    }
    public void setRadio() {
        System.out.println("Stereo radio model");
        model = Model.RADIO;
    }
    public void setVolume(int volume) {
        System.out.println("Stereo volume " + volume);
    }
    public Model getModel() {
        return model;
    }
}
