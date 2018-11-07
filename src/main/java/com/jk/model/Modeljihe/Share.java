package com.jk.model.Modeljihe;




import java.io.Serializable;

public class Share implements Serializable {
    private static final long serialVersionUID = -4299280293538473500L;
    private  int zid;
    private String ztitle;
    private  String zshowop;
    private  int zpid;
    private  String zfile;
    private  String ztype;
    private Integer zusershareid;
    private String username;
    private String userimge;
    private Integer userdengjiid;
    private String zimg;
    private String zway;
    private String zname;
    private String ztext;
    private  String zbrowse;


    public String getZtext() {
        return ztext;
    }

    public void setZtext(String ztext) {
        this.ztext = ztext;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public String getZimg() {
        return zimg;
    }

    public void setZimg(String zimg) {
        this.zimg = zimg;
    }

    public String getZway() {
        return zway;
    }

    public void setZway(String zway) {
        this.zway = zway;
    }

    public Integer getUserdengjiid() {
        return userdengjiid;
    }

    public void setUserdengjiid(Integer userdengjiid) {
        this.userdengjiid = userdengjiid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserimge() {
        return userimge;
    }

    public void setUserimge(String userimge) {
        this.userimge = userimge;
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

    public Integer getZusershareid() {
        return zusershareid;
    }

    public void setZusershareid(Integer zusershareid) {
        this.zusershareid = zusershareid;
    }

    public String getZbrowse() {
        return zbrowse;
    }

    public void setZbrowse(String zbrowse) {
        this.zbrowse = zbrowse;
    }

    @Override
    public String toString() {
        return "Share{" +
                "zid=" + zid +
                ", ztitle='" + ztitle + '\'' +
                ", zshowop='" + zshowop + '\'' +
                ", zpid=" + zpid +
                ", zfile='" + zfile + '\'' +
                ", ztype='" + ztype + '\'' +
                ", zusershareid=" + zusershareid +
                ", username='" + username + '\'' +
                ", userimge='" + userimge + '\'' +
                ", userdengjiid=" + userdengjiid +
                ", zimg='" + zimg + '\'' +
                ", zway='" + zway + '\'' +
                ", zname='" + zname + '\'' +
                ", ztext='" + ztext + '\'' +
                ", zbrowse='" + zbrowse + '\'' +
                '}';
    }
}
