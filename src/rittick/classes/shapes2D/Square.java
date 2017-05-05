package rittick.classes.shapes2D;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Square {
    private float sideLength;
    private String fillColor;
    private boolean isBorderPresent;
    private float borderLength;

    public Square(float sideLength, String fillColor, boolean isBorderPresent) {
        this.sideLength = sideLength;
        this.fillColor = fillColor;
        this.isBorderPresent = isBorderPresent;

        if(isBorderPresent){
            addBorderToSquare();
        }
    }

    private void addBorderToSquare() {
        borderLength = (float) ((float) sideLength + 0.5);
    }

    public float areaOfSquare(){
        return sideLength * sideLength;
    }

    public float areaOfBorder(){
        return borderLength * borderLength;
    }

    public float getSideLength() {
        return sideLength;
    }

    public void setSideLength(float sideLength) {
        this.sideLength = sideLength;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public static void main(String[] args) {
        Square square = new Square((float) 5.5, "Red", true );
        System.out.println("Area of Square: "+square.areaOfSquare());
        System.out.println("Area of Border: "+square.areaOfBorder());
    }
}
