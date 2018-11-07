package com.jk.model.Modeljihe;

import java.io.Serializable;
import java.util.List;

public class Manage implements Serializable {

    private static final long serialVersionUID = -8415664658156197436L;
    private Integer zid;
    private String zname;
    private String zpid;
    private List<Manage> managesList;
    private String state;

    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public String getZpid() {
        return zpid;
    }

    public void setZpid(String zpid) {
        this.zpid = zpid;
    }

    public List<Manage> getManagesList() {
        return managesList;
    }

    public void setManagesList(List<Manage> managesList) {
        this.managesList = managesList;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}