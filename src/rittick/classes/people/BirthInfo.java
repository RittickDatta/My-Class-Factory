package rittick.classes.people;

import java.util.Date;

/**
 * Created by Rittick on 5/5/2017.
 */
public class BirthInfo {

    private Date dob;
    private String placeOfBirth;

    public BirthInfo(Date dob, String placeOfBirth) {
        this.dob = dob;
        this.placeOfBirth = placeOfBirth;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
}
