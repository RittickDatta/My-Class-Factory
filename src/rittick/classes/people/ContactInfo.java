package rittick.classes.people;

/**
 * Created by Rittick on 5/5/2017.
 */
public class ContactInfo {

    private Integer phoneNumber;
    private String email;

    public ContactInfo(Integer phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
