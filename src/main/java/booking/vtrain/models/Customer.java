package booking.vtrain.models;

import java.util.Date;

public class Customer extends User {
    private String fullname;
    private String passportId;
    private Date dateOfBirth;

    public Customer() {
    }

    public Customer(String fullname, String passportId, Date dateOfBirth) {
        this.fullname = fullname;
        this.passportId = passportId;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}