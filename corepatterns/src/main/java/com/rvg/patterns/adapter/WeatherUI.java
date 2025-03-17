package com.rvg.patterns.adapter;

/*
 * This is the client class that uses the WeatherAdapter to find the temperature
 * of a city based on the zipcode.
 */
public class WeatherUI {

    public void showTemperature(int zipcode) {
        WeatherAdapter adapter = new WeatherAdapter();
        System.out.println("The temperature is: " + adapter.findTemperature(zipcode));
    }

    public static void main(String[] args) {
        WeatherUI ui = new WeatherUI();
        ui.showTemperature(19406);
    }
}
