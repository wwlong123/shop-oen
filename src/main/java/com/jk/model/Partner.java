package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Partner implements Serializable {
    private static final long serialVersionUID = 9192711079667643256L;
    private Integer id;

    private String parname;

    private String parcompany;

    private String parrelation;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date    startdate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date enddate;

    private Integer parstate;

    private String parimge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParname() {
        return parname;
    }

    public void setParname(String parname) {
        this.parname = parname;
    }

    public String getParcompany() {
        return parcompany;
    }

    public void setParcompany(String parcompany) {
        this.parcompany = parcompany;
    }

    public String getParrelation() {
        return parrelation;
    }

    public void setParrelation(String parrelation) {
        this.parrelation = parrelation;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getParstate() {
        return parstate;
    }

    public void setParstate(Integer parstate) {
        this.parstate = parstate;
    }

    public String getParimge() {
        return parimge;
    }

    public void setParimge(String parimge) {
        this.parimge = parimge;
    }
}
