package rittick.classes.people;

import java.util.ArrayList;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Education {

    private ArrayList<School> schools;
    private ArrayList<Certificate> certificates;
    private ArrayList<Publication> publications;
    private ArrayList<Group> groups;
    private ArrayList<Honor> honors;

    public Education(ArrayList<School> schools, ArrayList<Certificate> certificates, ArrayList<Publication> publications, ArrayList<Group> groups, ArrayList<Honor> honors) {
        this.schools = schools;
        this.certificates = certificates;
        this.publications = publications;
        this.groups = groups;
        this.honors = honors;
    }

    public ArrayList<School> getSchools() {
        return schools;
    }

    public void setSchools(ArrayList<School> schools) {
        this.schools = schools;
    }

    public void addSchool(School school) {
        schools.add(school);
    }

    public ArrayList<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(ArrayList<Certificate> certificates) {
        this.certificates = certificates;
    }

    public ArrayList<Publication> getPublications() {
        return publications;
    }

    public void setPublications(ArrayList<Publication> publications) {
        this.publications = publications;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public ArrayList<Honor> getHonors() {
        return honors;
    }

    public void setHonors(ArrayList<Honor> honors) {
        this.honors = honors;
    }
}
