package rittick.classes.people;

import java.util.Date;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Honor {

    private String honorTitle;
    private String honorDescription;
    private Date honorConferralDate;

    public Honor(String honorTitle, String honorDescription, Date honorConferralDate) {
        this.honorTitle = honorTitle;
        this.honorDescription = honorDescription;
        this.honorConferralDate = honorConferralDate;
    }

    public String getHonorTitle() {
        return honorTitle;
    }

    public void setHonorTitle(String honorTitle) {
        this.honorTitle = honorTitle;
    }

    public String getHonorDescription() {
        return honorDescription;
    }

    public void setHonorDescription(String honorDescription) {
        this.honorDescription = honorDescription;
    }

    public Date getHonorConferralDate() {
        return honorConferralDate;
    }

    public void setHonorConferralDate(Date honorConferralDate) {
        this.honorConferralDate = honorConferralDate;
    }
}
