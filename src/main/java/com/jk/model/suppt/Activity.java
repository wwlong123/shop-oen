package com.jk.model.suppt;

import java.io.Serializable;

public class Activity implements Serializable {

    private static final long serialVersionUID = 8565616386223350731L;
    private int hid;
    private  String hname;
    private  int htype;
    private  String hshows;
    private  String himgs;

    public String getHimgs() {
        return himgs;
    }

    public void setHimgs(String himgs) {
        this.himgs = himgs;
    }
    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public int getHtype() {
        return htype;
    }

    public void setHtype(int htype) {
        this.htype = htype;
    }

    public String getHshows() {
        return hshows;
    }

    public void setHshows(String hshows) {
        this.hshows = hshows;
    }
}
