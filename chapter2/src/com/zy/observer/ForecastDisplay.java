package com.zy.observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float preTemperature;
    private float curTemperature;
    private float predictTemperature;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Predict:" + predictTemperature);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        preTemperature = curTemperature;
        curTemperature = temperature;
        predict();

        display();
    }

    private void predict() {
        predictTemperature = (preTemperature + curTemperature ) / 2;
    }
}
