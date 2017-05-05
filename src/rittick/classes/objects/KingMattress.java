package rittick.classes.objects;

import rittick.interfaces.MattressType;

/**
 * Created by Rittick on 5/5/2017.
 */
public class KingMattress implements MattressType {
    @Override
    public void type() {
        System.out.println("Mattress Type: King");
    }
}
