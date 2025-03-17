package com.rvg.patterns.adapter;

/*
 * This is the interface that the WeatherAdapter uses to find the temperature of a city.
 * The WeatherFinderImpl class implements this interface.
 */
public interface WeatherFinder {

    int find(String city);
}
