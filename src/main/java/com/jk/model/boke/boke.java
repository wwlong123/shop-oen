package com.jk.model.boke;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class boke implements Serializable {
    private static final long serialVersionUID = 4621400205000040216L;
    private Integer bId;
    private  Integer niuB;
    @DateTimeFormat(pattern="MM-dd")
    @JsonFormat(pattern = "MM-dd",timezone = "GMT+8")
    private Date creDate;
    private String btext;
    private String title;
    private Integer count;
    private Integer browse;
    private Integer uid;
    private Integer state;
    /*虚的字段*/
    /*用户头像*/
    private String userimge;
    /*用户id*/
    private Integer userid;
    /*用户名称*/
    private String username;
    /*时间*/
    private String endCreate;

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public Integer getNiuB() {
        return niuB;
    }

    public void setNiuB(Integer niuB) {
        this.niuB = niuB;
    }

    public Date getCreDate() {
        return creDate;
    }

    public void setCreDate(Date creDate) {
        this.creDate = creDate;
    }

    public String getBtext() {
        return btext;
    }

    public void setBtext(String btext) {
        this.btext = btext;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getBrowse() {
        return browse;
    }

    public void setBrowse(Integer browse) {
        this.browse = browse;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUserimge() {
        return userimge;
    }

    public void setUserimge(String userimge) {
        this.userimge = userimge;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getEndCreate() {
        return endCreate;
    }

    public void setEndCreate(String endCreate) {
        this.endCreate = endCreate;
    }

    @Override
    public String toString() {
        return "boke{" +
                "bId=" + bId +
                ", niuB=" + niuB +
                ", creDate=" + creDate +
                ", btext='" + btext + '\'' +
                ", title='" + title + '\'' +
                ", count=" + count +
                ", browse=" + browse +
                ", uid=" + uid +
                ", state=" + state +
                ", userimge='" + userimge + '\'' +
                ", userid=" + userid +
                ", username='" + username + '\'' +
                '}';
    }
}
