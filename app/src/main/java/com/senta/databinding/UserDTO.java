package com.senta.databinding;

import java.io.Serializable;

/**
 * Created by "Nilesh Senta" on 3/28/2016.
 */
public class UserDTO implements Serializable {
    public String uName;
    public String pass;

    public UserDTO(String uName, String pass) {
        this.uName = uName;
        this.pass = pass;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
