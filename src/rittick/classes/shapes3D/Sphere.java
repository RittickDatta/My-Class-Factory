package rittick.classes.shapes3D;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Sphere {

    private double radius;
    private double surfaceArea;
    private double volume;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSurfaceArea() {
        return 4 * 3.14 * radius * radius;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getVolume() {
        return 4/3 * 3.14 * Math.pow(radius, 3);
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
