package com.rvg.patterns.adapter;

/*
 * This is the implementation class that implements the WeatherFinder interface to find the temperature
 * of a city based on the city name.
 */
public class WeatherFinderImpl implements WeatherFinder{

    @Override
    public int find(String city) {
        return 27;
    }

}
