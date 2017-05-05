package rittick.classes.people;

import java.util.ArrayList;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Family {

    private ArrayList<Person> family;

    public Family(ArrayList<Person> family) {
        this.family = family;
    }

    public ArrayList<Person> getFamily() {
        return family;
    }

    public void setFamily(ArrayList<Person> family) {
        this.family = family;
    }

    public void addMemberNewBorn(Person person) {
        family.add(person);
    }

    public void deleteMemberDeath(Person person) {
        family.remove(person);
    }
}
