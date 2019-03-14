package com.zy.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecaseDisplay = new ForecastDisplay(weatherData);

        weatherData.serMeasurements(80, 65, 30.4f);
        weatherData.serMeasurements(82, 70, 29.2f);
        weatherData.serMeasurements(78, 90, 29.2f);
    }
}
