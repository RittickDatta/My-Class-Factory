package rittick.classes.people;

import java.util.ArrayList;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Experience {

    private Job currentJob;
    private ArrayList<Job> jobs;

    public Experience(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }

    public Job getCurrentJob() {
        return currentJob;
    }

    public void setCurrentJob(Job currentJob) {
        this.currentJob = currentJob;
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }
}
