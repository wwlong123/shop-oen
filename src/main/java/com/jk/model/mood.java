package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class mood implements  Serializable{


    private static final long serialVersionUID = 5299960555495176937L;
    private String  id;

    private String   yid ;


    private String  z_zan ;

    private String  z_cai ;

    private String testarea;

    private  Integer z_count ;

    private  Integer z_caicount;

    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",timezone="GMT+8")
    private Date tdate ;

    private  String datetime;

    private  String username;

    private String  userdengjiid;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYid() {
        return yid;
    }

    public void setYid(String yid) {
        this.yid = yid;
    }



    public String getZ_zan() {
        return z_zan;
    }

    public void setZ_zan(String z_zan) {
        this.z_zan = z_zan;
    }

    public String getZ_cai() {
        return z_cai;
    }

    public void setZ_cai(String z_cai) {
        this.z_cai = z_cai;
    }

    public String getTestarea() {
        return testarea;
    }

    public void setTestarea(String testarea) {
        this.testarea = testarea;
    }

    public Date getTdate() {
        return tdate;
    }

    public void setTdate(Date tdate) {
        this.tdate = tdate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserdengjiid() {
        return userdengjiid;
    }

    public void setUserdengjiid(String userdengjiid) {
        this.userdengjiid = userdengjiid;
    }

    public Integer getZ_count() {
        return z_count;
    }

    public void setZ_count(Integer z_count) {
        this.z_count = z_count;
    }

    public Integer getZ_caicount() {
        return z_caicount;
    }

    public void setZ_caicount(Integer z_caicount) {
        this.z_caicount = z_caicount;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "mood{" +
                "id='" + id + '\'' +
                ", yid='" + yid + '\'' +
                ", z_zan='" + z_zan + '\'' +
                ", z_cai='" + z_cai + '\'' +
                ", testarea='" + testarea + '\'' +
                ", z_count=" + z_count +
                ", z_caicount=" + z_caicount +
                ", tdate=" + tdate +
                ", datetime='" + datetime + '\'' +
                ", username='" + username + '\'' +
                ", userdengjiid='" + userdengjiid + '\'' +
                '}';
    }
}
