package com.vimeo.networking.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by alfredhanssen on 4/12/15.
 */

public class User implements Serializable {

    private static final long serialVersionUID = -4112910222188194647L;

    public enum AccountType {
        BASIC,
        PRO,
        PLUS,
        STAFF
    }

    public String uri;
    public String name;
    public String link;
    public String location;
    public String bio;
    public Date createdTime;
    public String account;
    public PictureCollection pictures;
    public ArrayList<Website> websites;
    public Metadata metadata;

    public AccountType getAccountType() {
        if (this.account.equals("basic")) {
            return AccountType.BASIC;
        } else if (this.account.equals("plus")) {
            return AccountType.PLUS;
        } else if (this.account.equals("pro")) {
            return AccountType.PRO;
        } else if (this.account.equals("staff")) {
            return AccountType.STAFF;
        }

        return AccountType.BASIC;
    }
}
