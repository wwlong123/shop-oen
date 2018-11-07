package com.jk.model.Modeljihe;

import java.io.Serializable;

public class Users implements Serializable {
    private static final long serialVersionUID = 1451399989778697978L;

    private Integer userid;

    private String username;

    private String usereamil;

    private String userpass;

    private String userdengjiid;

    private String userimge;

    private  String yuefile;


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

    public String getUserdengjiid() {
        return userdengjiid;
    }

    public void setUserdengjiid(String userdengjiid) {
        this.userdengjiid = userdengjiid;
    }

    public String getUserimge() {
        return userimge;
    }

    public void setUserimge(String userimge) {
        this.userimge = userimge;
    }

    public String getYuefile() {
        return yuefile;
    }

    public void setYuefile(String yuefile) {
        this.yuefile = yuefile;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", usereamil='" + usereamil + '\'' +
                ", userpass='" + userpass + '\'' +
                ", userdengjiid='" + userdengjiid + '\'' +
                ", userimge='" + userimge + '\'' +
                ", yuefile='" + yuefile + '\'' +
                '}';
    }
}
