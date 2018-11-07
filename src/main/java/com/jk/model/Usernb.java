package com.jk.model;

import java.io.Serializable;

public class Usernb implements Serializable {

    private static final long serialVersionUID = -7242856342265683409L;
    private Integer id;

    private Integer userid;

    private String usernb;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsernb() {
        return usernb;
    }

    public void setUsernb(String usernb) {
        this.usernb = usernb;
    }
}
