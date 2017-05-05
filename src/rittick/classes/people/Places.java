package rittick.classes.people;

import java.util.ArrayList;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Places {

    private String currentCity;
    private ArrayList<String> previousCities;

    public Places(String currentCity, ArrayList<String> previousCities) {
        this.currentCity = currentCity;
        this.previousCities = previousCities;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public ArrayList<String> getPreviousCities() {
        return previousCities;
    }

    public void setPreviousCities(ArrayList<String> previousCities) {
        this.previousCities = previousCities;
    }
}
