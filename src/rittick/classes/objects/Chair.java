package rittick.classes.objects;

import rittick.enumerations.Colors;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Chair {
    public String typeOfChair;
    public boolean isRockingChair;
    public boolean isArmRestPresent;
    public boolean isCushionPresent;
    public Colors color;

    public Chair(String typeOfChair, boolean isRockingChair, boolean isArmRestPresent, boolean isCushionPresent, Colors color) {
        this.typeOfChair = typeOfChair;
        this.isRockingChair = isRockingChair;
        this.isArmRestPresent = isArmRestPresent;
        this.isCushionPresent = isCushionPresent;
        this.color = color;
    }

    public String getTypeOfChair() {
        return typeOfChair;
    }

    public void setTypeOfChair(String typeOfChair) {
        this.typeOfChair = typeOfChair;
    }

    public boolean isRockingChair() {
        return isRockingChair;
    }

    public void setRockingChair(boolean rockingChair) {
        isRockingChair = rockingChair;
    }

    public boolean isArmRestPresent() {
        return isArmRestPresent;
    }

    public void setArmRestPresent(boolean armRestPresent) {
        isArmRestPresent = armRestPresent;
    }

    public boolean isCushionPresent() {
        return isCushionPresent;
    }

    public void setCushionPresent(boolean cushionPresent) {
        isCushionPresent = cushionPresent;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
