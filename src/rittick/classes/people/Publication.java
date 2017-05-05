package rittick.classes.people;

import java.util.Date;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Publication {

    private String paperTitle;
    private String organization;
    private Date publicationDate;

    public Publication(String paperTitle, String organization, Date publicationDate) {
        this.paperTitle = paperTitle;
        this.organization = organization;
        this.publicationDate = publicationDate;
    }

    public String getPaperTitle() {
        return paperTitle;
    }

    public void setPaperTitle(String paperTitle) {
        this.paperTitle = paperTitle;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
}
