package rittick.classes.shapes3D;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Cube {

    private double side;
    private double volume;
    private String color;

    public Cube(double side, double volume, String color) {
        this.side = side;
        this.volume = volume;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getVolume() {
        this.volume = Math.pow(side, 3);
        return volume;
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

    public double getArea(){
        return 6 * (side * side);
    }

}
