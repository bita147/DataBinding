package com.senta.databinding;

/**
 * Created by "Nilesh Senta" on 12/23/2015.
 */
public class PersonDTO {
    public String firstName;
    public String lastName;
    public String mobile;

    public PersonDTO(String firstName, String lastName, String mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
