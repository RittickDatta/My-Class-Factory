package rittick.abstractClasses;

/**
 * Created by Rittick on 5/5/2017.
 */
public abstract class Animal {

    public abstract void carnivoreOrHerbivore();

    public void hunt(){
        System.out.println("Carnivore.");
    }

    public void eatPlants(){
        System.out.println("Herbivore.");
    }

}
