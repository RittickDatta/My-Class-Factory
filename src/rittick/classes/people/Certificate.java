package rittick.classes.people;

import java.util.Date;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Certificate {

    private String certificateTitle;
    private String organization;
    private Date validFrom;
    private Date validTo;

    public Certificate(String certificateTitle, String organization, Date validFrom, Date validTo) {
        this.certificateTitle = certificateTitle;
        this.organization = organization;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    public String getCertificateTitle() {
        return certificateTitle;
    }

    public void setCertificateTitle(String certificateTitle) {
        this.certificateTitle = certificateTitle;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }
}
