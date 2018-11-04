package com.jk.model.suppt;




import java.io.Serializable;

public class Share implements Serializable {
    private static final long serialVersionUID = -4299280293538473500L;
    private  int zid;
    private String ztitle;
    private  String zshowop;
    private  int zpid;
    private  String zfile;
    private  String ztype;
    private  String maxname;
    private  String minname;

    public String getMaxname() {
        return maxname;
    }

    public void setMaxname(String maxname) {
        this.maxname = maxname;
    }

    public String getMinname() {
        return minname;
    }

    public void setMinname(String minname) {
        this.minname = minname;
    }

    public int getZid() {
        return zid;
    }

    public void setZid(int zid) {
        this.zid = zid;
    }

    public String getZtitle() {
        return ztitle;
    }

    public void setZtitle(String ztitle) {
        this.ztitle = ztitle;
    }

    public String getZshowop() {
        return zshowop;
    }

    public void setZshowop(String zshowop) {
        this.zshowop = zshowop;
    }

    public int getZpid() {
        return zpid;
    }

    public void setZpid(int zpid) {
        this.zpid = zpid;
    }

    public String getZfile() {
        return zfile;
    }

    public void setZfile(String zfile) {
        this.zfile = zfile;
    }

    public String getZtype() {
        return ztype;
    }

    public void setZtype(String ztype) {
        this.ztype = ztype;
    }
}
