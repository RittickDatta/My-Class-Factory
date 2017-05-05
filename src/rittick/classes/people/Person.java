package rittick.classes.people;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Person {

    private Name name;
    private ContactInfo contactInfo;
    private Address address;
    private BirthInfo birthInfo;
    private Places places;
    private Education education;
    private Experience experience;
    private Family family;

    public Person(Name name, ContactInfo contactInfo, Address address, BirthInfo birthInfo, Places places, Education education, Experience experience, Family family) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.address = address;
        this.birthInfo = birthInfo;
        this.places = places;
        this.education = education;
        this.experience = experience;
        this.family = family;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BirthInfo getBirthInfo() {
        return birthInfo;
    }

    public void setBirthInfo(BirthInfo birthInfo) {
        this.birthInfo = birthInfo;
    }

    public Places getPlaces() {
        return places;
    }

    public void setPlaces(Places places) {
        this.places = places;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }


    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void updateContactInfo(Integer phone, String email) {
        contactInfo.setPhoneNumber(phone);
        contactInfo.setEmail(email);
    }

    public void updateCurrentCity(String currentCity) {
        places.setCurrentCity(currentCity);
    }

    public void updateSchoolList(School school) {
        education.addSchool(school);
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public void updateCurrentJob(Job currentJob) {
        experience.setCurrentJob(currentJob);
    }
}
