package rittick.classes.people;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Address {

    private String country;
    private String state;
    private String city;
    private String street;
    private String houseNumber;
    private String mailBoxNumber;
    private Integer pin;

    public Address(String country, String state, String city, String street, String houseNumber, String mailBoxNumber, Integer pin) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.mailBoxNumber = mailBoxNumber;
        this.pin = pin;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getMailBoxNumber() {
        return mailBoxNumber;
    }

    public void setMailBoxNumber(String mailBoxNumber) {
        this.mailBoxNumber = mailBoxNumber;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }
}
