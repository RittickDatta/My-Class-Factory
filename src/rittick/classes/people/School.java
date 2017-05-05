package rittick.classes.people;

import java.util.Date;

/**
 * Created by Rittick on 5/5/2017.
 */
public class School {

    private String schoolName;
    private String major;
    private String minor;
    private Date startDate;
    private Date endDate;
    private float GPA;

    public School(String schoolName, String major, String minor, Date startDate, Date endDate, float GPA) {
        this.schoolName = schoolName;
        this.major = major;
        this.minor = minor;
        this.startDate = startDate;
        this.endDate = endDate;
        this.GPA = GPA;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
}
