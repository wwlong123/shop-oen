package com.jk.model;

import java.io.Serializable;

public class Users implements Serializable {
    private static final long serialVersionUID = 1451399989778697978L;
    private Integer userid;

    private String username;

    private String usereamil;

    private String userpass;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsereamil() {
        return usereamil;
    }

    public void setUsereamil(String usereamil) {
        this.usereamil = usereamil;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", usereamil='" + usereamil + '\'' +
                ", userpass='" + userpass + '\'' +
                '}';
    }
}
