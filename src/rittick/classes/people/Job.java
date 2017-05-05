package rittick.classes.people;

import java.util.Date;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Job {

    private String companyName;
    private String position;
    private String jobDescription;
    private Date startDate;
    private Date endDate;
    private double income;

    public Job(String companyName, String position, String jobDescription, Date startDate, Date endDate, double income) {
        this.companyName = companyName;
        this.position = position;
        this.jobDescription = jobDescription;
        this.startDate = startDate;
        this.endDate = endDate;
        this.income = income;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
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

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
