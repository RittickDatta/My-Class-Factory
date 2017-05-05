package rittick.classes.objects;

import rittick.interfaces.MattressType;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Bed {

    private double length;
    private double breadth;
    private double height;
    private MattressType mattressType;
    private LocationCoordinates locationCoordinates;

    public Bed(double length, double breadth, double height, LocationCoordinates locationCoordinates) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.locationCoordinates = locationCoordinates;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getHeight() {
        return height;
    }

    public MattressType getMattressType() {
        return mattressType;
    }

    public void setMattressType(MattressType mattressType) {
        this.mattressType = mattressType;
    }

    public LocationCoordinates getLocationCoordinates() {
        return locationCoordinates;
    }

    public void setLocationCoordinates(LocationCoordinates locationCoordinates) {
        this.locationCoordinates = locationCoordinates;
    }
}
