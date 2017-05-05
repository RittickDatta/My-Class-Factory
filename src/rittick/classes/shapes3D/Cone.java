package rittick.classes.shapes3D;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Cone {

    private  double radius;
    private double height;
    private double surfaceArea;
    private double volume;
    private String color;

    private static final double PI = 3.14;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getSurfaceArea() {
        this.surfaceArea =  PI * radius * (radius + Math.sqrt(Math.pow(height, 2)+ Math.pow(radius,2)));
        return surfaceArea;
    }

    public double getVolume() {
        this.volume = PI * Math.pow(radius, 2) * height * 1/3;
        return volume;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
