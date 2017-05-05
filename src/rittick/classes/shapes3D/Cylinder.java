package rittick.classes.shapes3D;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Cylinder {

    private double radius;
    private double height;
    private double surfaceArea;
    private double volume;

    private static final double PI = 3.14;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getSurfaceArea() {
        this.surfaceArea = (2 * 3.14 * radius * height) + (2 * 3.14 * Math.pow(radius, 2));
        return this.surfaceArea;
    }

    public double getVolume() {
        this.volume = PI * Math.pow(radius, 2) * height;
        return this.volume;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public static double getPI() {
        return PI;
    }
}
