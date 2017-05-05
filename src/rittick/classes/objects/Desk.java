package rittick.classes.objects;

import rittick.enumerations.Colors;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Desk {

    private double length;
    private double breadth;
    private double height;
    private boolean isLampPresent;
    private boolean isShelfPresent;
    private LocationCoordinates locationCoordinates;
    private Colors color;

    public Desk(double length, double breadth, double height, boolean isLampPresent, boolean isShelfPresent, LocationCoordinates locationCoordinates, Colors color) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.isLampPresent = isLampPresent;
        this.isShelfPresent = isShelfPresent;
        this.locationCoordinates = locationCoordinates;
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isLampPresent() {
        return isLampPresent;
    }

    public void setLampPresent(boolean lampPresent) {
        isLampPresent = lampPresent;
    }

    public boolean isShelfPresent() {
        return isShelfPresent;
    }

    public void setShelfPresent(boolean shelfPresent) {
        isShelfPresent = shelfPresent;
    }

    public LocationCoordinates getLocationCoordinates() {
        return locationCoordinates;
    }

    public void setLocationCoordinates(LocationCoordinates locationCoordinates) {
        this.locationCoordinates = locationCoordinates;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}

