package com.zy.observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemperature;
    private float minTempreature;
    private float avgTemperature;
    private float maxHumidity;
    private float minHumidity;
    private float avgHumidity;
    private float maxPressure;
    private float minPressure;
    private float avgPressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Temperature: %f %f %f\n", maxTemperature, minTempreature, avgTemperature);
        System.out.printf("Humidity: %f %f %f\n", maxHumidity, minHumidity, avgHumidity);
        System.out.printf("Pressure: %f %f %f\n", maxPressure, minPressure, avgPressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        maxTemperature = max(maxTemperature, temperature);
        minTempreature = min(minTempreature ,temperature);
        avgTemperature = average(avgTemperature, temperature);

        maxHumidity = max(maxHumidity, humidity);
        minHumidity = min(minHumidity, humidity);
        avgHumidity = average(avgHumidity, humidity);

        maxPressure = max(maxPressure, pressure);
        minPressure = min(minPressure, pressure);
        avgPressure = average(avgPressure, pressure);

        display();
    }

    private float max(float a, float b) {
        return a > b ? a : b;
    }

    private float min(float a, float b) {
        return a < b ? b : a;
    }

    private float average(float preValue, float curValue) {
        return (preValue + curValue) / 2;
    }
}
