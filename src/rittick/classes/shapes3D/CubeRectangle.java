package rittick.classes.shapes3D;

/**
 * Created by Rittick on 5/5/2017.
 */
public class CubeRectangle {

    private double length;
    private double breadth;
    private double height;
    private double area;
    private double volume;
    private String color;

    public CubeRectangle(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
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

    public double getArea() {
        return 4 * (height * breadth) + 2 * (length * breadth);
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolume() {
        return length * breadth * height;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
