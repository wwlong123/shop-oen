package com.jk.model;

import java.io.Serializable;

public class Htuser implements Serializable {
    private static final long serialVersionUID = 7505312357683164803L;
    private Integer userid;

    private String username;

    private Integer usersex;

    private String usersuozaidi;

    private String usershoujihao;

    private String userdizhi;

    private String userzsname;

    private String userjieji;

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

    public Integer getUsersex() {
        return usersex;
    }

    public void setUsersex(Integer usersex) {
        this.usersex = usersex;
    }

    public String getUsersuozaidi() {
        return usersuozaidi;
    }

    public void setUsersuozaidi(String usersuozaidi) {
        this.usersuozaidi = usersuozaidi;
    }

    public String getUsershoujihao() {
        return usershoujihao;
    }

    public void setUsershoujihao(String usershoujihao) {
        this.usershoujihao = usershoujihao;
    }

    public String getUserdizhi() {
        return userdizhi;
    }

    public void setUserdizhi(String userdizhi) {
        this.userdizhi = userdizhi;
    }

    public String getUserzsname() {
        return userzsname;
    }

    public void setUserzsname(String userzsname) {
        this.userzsname = userzsname;
    }

    public String getUserjieji() {
        return userjieji;
    }

    public void setUserjieji(String userjieji) {
        this.userjieji = userjieji;
    }
}
