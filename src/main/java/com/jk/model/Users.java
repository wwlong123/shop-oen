package com.jk.model;

import java.io.Serializable;

public class Users implements Serializable {
    private static final long serialVersionUID = 1451399989778697978L;
    private Integer userid;

    private String username;

    private String usereamil;

    private String userpass;

    private String userimge;

    private String usernb;

    public String getUsernb() {
        return usernb;
    }

    public void setUsernb(String usernb) {
        this.usernb = usernb;
    }

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

    public String getUserimge() {
        return userimge;
    }

    public void setUserimge(String userimge) {
        this.userimge = userimge;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", usereamil='" + usereamil + '\'' +
                ", userpass='" + userpass + '\'' +
                ", userimge='" + userimge + '\'' +
                '}';
    }
}
