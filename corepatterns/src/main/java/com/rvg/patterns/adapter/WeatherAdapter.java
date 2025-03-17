package com.rvg.patterns.adapter;

/*
 * This is the adapter class that adapts the WeatherFinder interface to find the temperature
 * of a city based on the zipcode.
 */
public class WeatherAdapter {

    public int findTemperature(int zipcode) {
        String city = null;
        if (zipcode == 19406) {
            city = "King of Prussia";
        }

        WeatherFinder finder = new WeatherFinderImpl();
        return finder.find(city);
    }
}
