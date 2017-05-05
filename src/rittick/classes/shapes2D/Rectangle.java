package rittick.classes.shapes2D;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Rectangle {

    private double length;
    private double breadth;
    private String color;

    public Rectangle(double length, double breadth, String color) {
        this.length = length;
        this.breadth = breadth;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return length * breadth;
    }
}
